package com.project.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.project.dao.*;
import com.project.model.*;
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/eventmetadata.jsp";
    private static String LIST_EVENTS = "/event.jsp";
    private EventDAO dao;

    public ServletController() {
        super();
        dao = new EventDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");
        System.out.println("in ServletController");
        if (action.equalsIgnoreCase("delete")){
            String eventId = request.getParameter("eventId");
            dao.deleteEvent(eventId);
            forward = LIST_EVENTS;
            request.setAttribute("events", dao.getAllEvents());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            String eventId = request.getParameter("eventId");
            Event event = dao.getEventById(eventId);
            request.setAttribute("event", event);
        } else if (action.equalsIgnoreCase("listevent")){
            forward = LIST_EVENTS;
            request.setAttribute("events", dao.getAllEvents());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		
		Event event = new Event();
        Eventtype eventtype = new Eventtype();
        EventtrackstableId eventtrack=new EventtrackstableId();
        Venue venue= new Venue();
       // eventtype.setEventtypename(request.getParameter("eventType"));
        event.setEventtitle(request.getParameter("eventTitle"));
        event.setEventidentifier(request.getParameter("eventIdentifier"));
        try {
            Date startdate = new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("startdate"));
            Date enddate = new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("enddate"));

            System.out.println("startdate"+ startdate);
            System.out.println("enddate"+ enddate);
            event.setStartdate(startdate);
            event.setEnddate(enddate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        event.setEventdescription(request.getParameter("eventdescription"));
        event.setCustommessage(request.getParameter("custommessage"));
        event.setInstructions(request.getParameter("instructions"));
        event.setCfpProcess(request.getParameter("cfpprocess"));
      //  eventtrack.setEventtracks(request.getParameter("eventtrack"));
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);

        // parse the string
        BigDecimal eid,vid;
		try {
			eid = (BigDecimal) decimalFormat.parse(request.getParameter("eventID"));
			vid = (BigDecimal) decimalFormat.parse(request.getParameter("venueID"));
			event.setEventid(eid);
venue.setVenueid(vid);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
       venue.setVenuename(request.getParameter("venuename"));
       venue.getVenueid();
       venue.getVenuename();
       event.setVenue(venue);
       ses.save(venue);
       // ses.save(eventtrack);
       // ses.save(eventtype);
        ses.save(event);
        tx.commit(); 
        
        RequestDispatcher view = request.getRequestDispatcher(LIST_EVENTS);
        request.setAttribute("events", dao.getAllEvents());
        view.forward(request, response);
    }
}
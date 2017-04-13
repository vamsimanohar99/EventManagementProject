package com.project.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            String eventId = request.getParameter("eventid");
            dao.deleteEvent(eventId);
            forward = LIST_EVENTS;
            request.setAttribute("events", dao.getAllEvents());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            String eventId = request.getParameter("eventid");
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

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Event event = new Event();
        event.setUname(request.getParameter("uname"));
        user.setPassword(request.getParameter("pass"));
        try {
            Date reg = new SimpleDateFormat("yyyy/MM/dd").parse(request.getParameter("dob"));
            System.out.println(""+ reg);
            user.setRegisteredon(reg);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setEmail(request.getParameter("email"));
        //String userid = request.getParameter("uname");
//        if(userid == null || userid.isEmpty())
//        {
//            dao.addUser(user);
//        }
//        else
//        {
           // user.setUname(userid);
            dao.checkUser(user);
//        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("users", dao.getAllUsers());
        view.forward(request, response);
    }*/
}
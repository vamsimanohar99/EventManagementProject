package com.project.model;
import java.sql.*;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EventDAO {

    
    public void addEvent(Event event) {
        
    }

    public void deleteEvent(String eventid) {
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4=ses.createQuery("delete from Event where eventId=?");
		q4.setString(0,eventid);
		int count=q4.executeUpdate();
		System.out.println("number of rows removed : "+count );
		tx.commit(); 
    }

    public void updateEvent(Event event) {
    	Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query q4=ses.createQuery("update Event set =?, =?, =? where =?");

       
		
    }

    public List<Event> getAllEvents() {
    	System.out.println("in method");
        List<Event> events = new ArrayList<Event>();
        Configuration conf=new Configuration();
		conf=conf.configure();

		SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
		Session ses=factory.openSession();
		Transaction tx=(Transaction) ses.beginTransaction();
		Query query =ses.createQuery("from Event");
		Iterator i1=query.iterate();
		//System.out.println("Event details are .....");

		while(i1.hasNext())
		{
			Event e=(Event) i1.next();
			events.add(e);
		}
		       System.out.println(events);

        return events;
    }

    public Event getEventById(String eventid) {
        Event event = new Event();
        

        return event;
    }
}
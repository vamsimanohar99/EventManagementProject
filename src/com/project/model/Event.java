package com.project.model;
// Generated Apr 11, 2017 7:41:13 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Event generated by hbm2java
 */
public class Event implements java.io.Serializable {

	private BigDecimal eventid;
	private Venue venue;
	private String eventtitle;
	private String eventidentifier;
	private Date startdate;
	private Date enddate;
	private String eventdescription;
	private String custommessage;
	private String instructions;
	private String cfpProcess;
	private Blob eventlogo;
	private Set clients = new HashSet(0);
	private Set vendors = new HashSet(0);

	public Event() {
	}

	public Event(BigDecimal eventid, Venue venue) {
		this.eventid = eventid;
		this.venue = venue;
	}

	public Event(BigDecimal eventid, Venue venue, String eventtitle, String eventidentifier, Date startdate,
			Date enddate, String eventdescription, String custommessage, String instructions, String cfpProcess,
			Blob eventlogo, Set clients, Set vendors) {
		this.eventid = eventid;
		this.venue = venue;
		this.eventtitle = eventtitle;
		this.eventidentifier = eventidentifier;
		this.startdate = startdate;
		this.enddate = enddate;
		this.eventdescription = eventdescription;
		this.custommessage = custommessage;
		this.instructions = instructions;
		this.cfpProcess = cfpProcess;
		this.eventlogo = eventlogo;
		this.clients = clients;
		this.vendors = vendors;
	}

	public BigDecimal getEventid() {
		return this.eventid;
	}

	public void setEventid(BigDecimal eventid) {
		this.eventid = eventid;
	}

	public Venue getVenue() {
		return this.venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public String getEventtitle() {
		return this.eventtitle;
	}

	public void setEventtitle(String eventtitle) {
		this.eventtitle = eventtitle;
	}

	public String getEventidentifier() {
		return this.eventidentifier;
	}

	public void setEventidentifier(String eventidentifier) {
		this.eventidentifier = eventidentifier;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getEventdescription() {
		return this.eventdescription;
	}

	public void setEventdescription(String eventdescription) {
		this.eventdescription = eventdescription;
	}

	public String getCustommessage() {
		return this.custommessage;
	}

	public void setCustommessage(String custommessage) {
		this.custommessage = custommessage;
	}

	public String getInstructions() {
		return this.instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getCfpProcess() {
		return this.cfpProcess;
	}

	public void setCfpProcess(String cfpProcess) {
		this.cfpProcess = cfpProcess;
	}

	public Blob getEventlogo() {
		return this.eventlogo;
	}

	public void setEventlogo(Blob eventlogo) {
		this.eventlogo = eventlogo;
	}

	public Set getClients() {
		return this.clients;
	}

	public void setClients(Set clients) {
		this.clients = clients;
	}

	public Set getVendors() {
		return this.vendors;
	}

	public void setVendors(Set vendors) {
		this.vendors = vendors;
	}

}

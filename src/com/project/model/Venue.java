package com.project.model;
// Generated Apr 11, 2017 7:41:13 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Venue generated by hbm2java
 */
public class Venue implements java.io.Serializable {

	private BigDecimal venueid;
	private String venuename;
	private String streetname;
	private String aptno;
	private String city;
	private String state;
	private String zip;
	private String country;
	private BigDecimal phonenumber;
	private BigDecimal mobilenumber;
	private String emailid;
	private Set events = new HashSet(0);

	public Venue() {
	}

	public Venue(BigDecimal venueid) {
		this.venueid = venueid;
	}

	public Venue(BigDecimal venueid, String venuename, String streetname, String aptno, String city, String state,
			String zip, String country, BigDecimal phonenumber, BigDecimal mobilenumber, String emailid, Set events) {
		this.venueid = venueid;
		this.venuename = venuename;
		this.streetname = streetname;
		this.aptno = aptno;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.phonenumber = phonenumber;
		this.mobilenumber = mobilenumber;
		this.emailid = emailid;
		this.events = events;
	}

	public BigDecimal getVenueid() {
		return this.venueid;
	}

	public void setVenueid(BigDecimal venueid) {
		this.venueid = venueid;
	}

	public String getVenuename() {
		return this.venuename;
	}

	public void setVenuename(String venuename) {
		this.venuename = venuename;
	}

	public String getStreetname() {
		return this.streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getAptno() {
		return this.aptno;
	}

	public void setAptno(String aptno) {
		this.aptno = aptno;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigDecimal getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(BigDecimal phonenumber) {
		this.phonenumber = phonenumber;
	}

	public BigDecimal getMobilenumber() {
		return this.mobilenumber;
	}

	public void setMobilenumber(BigDecimal mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Set getEvents() {
		return this.events;
	}

	public void setEvents(Set events) {
		this.events = events;
	}

}
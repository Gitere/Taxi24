package com.bk.taxi24;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Trip {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long driver_id;
	private long rider_id;	
	private Calendar start_time;
	private Calendar end_time;
	private double distance;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(long driver_id) {
		this.driver_id = driver_id;
	}
	public long getRider_id() {
		return rider_id;
	}
	public void setRider_id(long rider_id) {
		this.rider_id = rider_id;
	}
	
	public Calendar getStart_time() {
		return start_time;
	}
	public void setStart_time(Calendar start_time) {
		this.start_time = start_time;
	}
	public Calendar getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Calendar end_time) {
		this.end_time = end_time;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

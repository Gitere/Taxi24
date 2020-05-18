package com.bk.taxi24;

import java.util.Calendar;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Invoice {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long rider_id;
	private long driver_id;
	private long trip_id;
	private double amount;
	private Calendar invoice_date;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRider_id() {
		return rider_id;
	}
	public void setRider_id(long rider_id) {
		this.rider_id = rider_id;
	}
	public long getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(long driver_id) {
		this.driver_id = driver_id;
	}
	public long getTrip_id() {
		return trip_id;
	}
	public void setTrip_id(long trip_id) {
		this.trip_id = trip_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Calendar getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(Calendar invoice_date) {
		this.invoice_date = invoice_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}


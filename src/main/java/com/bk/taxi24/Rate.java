package com.bk.taxi24;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Rate {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private double km;
	private double minute;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public double getMinute() {
		return minute;
	}
	public void setMinute(double minute) {
		this.minute = minute;
	}
	
}

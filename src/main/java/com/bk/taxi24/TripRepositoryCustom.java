package com.bk.taxi24;

import java.util.Calendar;
import java.util.List;

public interface TripRepositoryCustom {

	public String completeTrip(long tripId, double distance, String endTime, String status);
	
	public List<Trip> activeTrips();
	
	public List<Trip> getTripById(Long Id);
}

package com.bk.taxi24;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class TripRepositoryImpl implements TripRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	@Override
	public String completeTrip(long id, double distance, String endtime, String status) {
		Query query = entityManager.createNativeQuery(
				"update trip set distance = " + distance + ", end_time='" + endtime + "', status='"+status+"' where id = " + id + "");
		 query.executeUpdate();
		return "";
	}
	
	@Override
    public List<Trip> activeTrips() {
		List<Trip> trips = new ArrayList<Trip>();
		try {
        Query query = entityManager.createNativeQuery("SELECT * FROM trip t where status = 'Active'", Trip.class);            
        trips = query.getResultList();
		} catch (Exception ex) {

		}
		return trips;
    }
	
	@Override
    public List<Trip> getTripById(Long id) {
		List<Trip> trips = new ArrayList<Trip>();
		try {
        Query query = entityManager.createNativeQuery("SELECT * FROM trip t where id = "+id+"", Trip.class);            
        trips = query.getResultList();
		} catch (Exception ex) {

		}
		return trips;
    }
    

}

package com.bk.taxi24;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class RiderRepositoryImpl implements RiderRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Rider> allRiders() {
		List<Rider> riders = new ArrayList<Rider>();
		try {
			Query query = entityManager.createNativeQuery("SELECT * FROM rider r", Rider.class);
			riders = query.getResultList();
		} catch (Exception ex) {

		}
		return riders;
	}

	@Override
	public List<Driver> closestDrivers() {
		List<Driver> drivers = new ArrayList<Driver>();
		try {
			Query query = entityManager.createNativeQuery("SELECT * FROM driver d order by distance asc limit 3",
					Driver.class);
			drivers = query.getResultList();
		} catch (Exception ex) {

		}
		return drivers;
	}

	@Override
	public List<Rider> riderById(long id) {
		List<Rider> riders = new ArrayList<Rider>();
		try {
			Query query = entityManager.createNativeQuery("SELECT * FROM rider r where id = " + id + "", Rider.class);
			riders = query.getResultList();
		} catch (Exception ex) {

		}
		return riders;
	}

}

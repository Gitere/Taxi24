package com.bk.taxi24;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepositoryCustom {
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Driver> availableDrivers() {

		List<Driver> drivers = new ArrayList<Driver>();
		try {
			Query query = entityManager.createNativeQuery("SELECT * FROM driver d where status = 1", Driver.class);
			drivers = query.getResultList();
		} catch (Exception ex) {

		}
		return drivers;
	}

	@Override
	public List<Driver> driversByLocation(String location) {
		List<Driver> drivers = new ArrayList<Driver>();
		try {
			Query query = entityManager.createNativeQuery(
					"SELECT * FROM driver d where distance <= 3 and location = '" + location + "'", Driver.class);
			drivers = query.getResultList();
		} catch (Exception ex) {

		}
		return drivers;
	}

	@Override
	public List<Driver> driverById(long id) {
		List<Driver> drivers = new ArrayList<Driver>();
		try {
			Query query = entityManager.createNativeQuery("SELECT * FROM driver d where id = " + id + "", Driver.class);

			drivers = query.getResultList();
		} catch (Exception ex) {

		}
		return drivers;
	}

}

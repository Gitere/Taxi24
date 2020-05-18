package com.bk.taxi24;

import java.util.List;

public interface DriverRepositoryCustom {
	public List<Driver> availableDrivers();
	
	public List<Driver> driversByLocation(String location);
	
	public List<Driver> driverById(long id);
}

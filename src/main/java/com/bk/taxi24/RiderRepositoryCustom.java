package com.bk.taxi24;

import java.util.List;

public interface RiderRepositoryCustom {
	
	public List<Rider> allRiders();
	
	public List<Rider> riderById(long id);
	
	public List<Driver> closestDrivers();
}

package com.bk.taxi24;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer>, DriverRepositoryCustom {	
	
}

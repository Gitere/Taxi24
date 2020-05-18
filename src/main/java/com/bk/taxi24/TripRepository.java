package com.bk.taxi24;

import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, Long>, TripRepositoryCustom {

}

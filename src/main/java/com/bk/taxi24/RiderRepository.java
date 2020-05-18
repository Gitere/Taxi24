package com.bk.taxi24;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface RiderRepository extends CrudRepository<Rider, Integer>, RiderRepositoryCustom {

}

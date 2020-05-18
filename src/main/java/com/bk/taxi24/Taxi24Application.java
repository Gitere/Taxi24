package com.bk.taxi24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// @EnableJpaRepositories(basePackageClasses = {RepoPackageMarker.class, FilterRepositoryCustomImpl.class})

@SpringBootApplication
public class Taxi24Application {

	public static void main(String[] args) {
		SpringApplication.run(Taxi24Application.class, args);
	}

}

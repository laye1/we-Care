package org.spring.we_care.repository;

import java.util.Optional;

import org.spring.we_care.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
	
	Optional<City> findByNameContaining(String name);

}

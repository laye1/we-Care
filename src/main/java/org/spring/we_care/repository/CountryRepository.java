package org.spring.we_care.repository;

import java.util.Optional;

import org.spring.we_care.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	public Optional<Country> findByNameContaining(String name);

}

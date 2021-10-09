package org.spring.we_care.repository;

import java.util.Optional;

import org.spring.we_care.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Integer>{
	
	public Optional<Speciality> findByNameContaining(String name);

}

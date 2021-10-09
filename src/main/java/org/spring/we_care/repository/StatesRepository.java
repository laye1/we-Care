package org.spring.we_care.repository;

import java.util.Optional;

import org.spring.we_care.model.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepository extends JpaRepository<States, Integer> {
	
	public Optional<States> findByNameContaining(String name);

}

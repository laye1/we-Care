package org.spring.we_care.repository;

import java.util.Optional;

import org.spring.we_care.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
	
	public Optional<Profile> findByProfileNameContaining(String profileName);

}

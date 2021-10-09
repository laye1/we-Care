package org.spring.we_care.repository;

import java.util.List;
import java.util.Optional;

import org.spring.we_care.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	// PAGINATION AND SORTING
	Page<User> findByUsernameContaining(String username, Pageable pageable);
	  
	List<User> findByUsernameContaining(String username, Sort sort);
	 
	// RETRIEVE A USER ACCORDING TO HIS UNIQUE PARAMETER
	Optional<User> findByUsernameContaining(String username);
	
	Optional<User> findByEmailContaining(String email);
	
	Optional<User> findByPhoneContaining(String phone);
	
	Optional<User> findByCodeContaining(String code);
	
	Optional<User> findByPinCodeContaining(String pinCode);
	
	// CHECK IF THE PARAMETERS ARE ALREADY USED OR
	boolean existsByUsername(String username);
	
	boolean existsByEmail(String email);
	
	boolean existsByPhoneNumber(String phone);
	
	boolean existsByCode(String code);
	
	boolean existsByPinCode(String pinCode);

}

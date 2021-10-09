package org.spring.we_care.repository;

import org.spring.we_care.model.Apppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApppointmentRepository extends JpaRepository<Apppointment, Integer> {

}

package com.spring.passenger.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface PassengerRepository<Passenger> extends JpaRepository<Passenger,Long>
 {
	
	
	
}


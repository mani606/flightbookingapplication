package com.spring.passenger.repository;


import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.passenger.model.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight , Long>{
	
	@Query(value = "select * from flight where source = ?1 and destination = ?2" , nativeQuery=true)
	List<Flight> findBySource(String source , String destination);

}

	
	
	



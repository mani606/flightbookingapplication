package com.spring.passenger.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.passenger.model.Booking;


@Repository
public interface BookingRepository extends JpaRepository<Booking , Long>{

	@Query(value = "select * from booking where airlinesname = ?1" , nativeQuery=true)
	List<Booking> findByAirlines(String airlnesname);

}





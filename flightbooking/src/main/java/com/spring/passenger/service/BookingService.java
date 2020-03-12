package com.spring.passenger.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.passenger.model.Booking;
import com.spring.passenger.repository.BookingRepository;



@Service
public class BookingService {

	@Autowired
	BookingRepository brepo;	

	public List<Booking> getBookingHistory(String airlinesname) {
		return brepo.findByAirlines(airlinesname);
	}	
}



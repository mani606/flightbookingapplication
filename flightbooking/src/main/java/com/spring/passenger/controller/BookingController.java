package com.spring.passenger.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.passenger.model.Booking;
import com.spring.passenger.model.Flight;
import com.spring.passenger.service.BookingService;
import com.spring.passenger.service.FlightService;


@RestController
@RequestMapping("/flightbooking")
public class BookingController {
	
	@Autowired
	private FlightService fservice;
	
	@Autowired
	private BookingService bservice;
		
	@GetMapping()
	public String sayHello(){
		return "hello";		
	}
	@GetMapping("/hi")
	public String sayHi(){
		return "Hi";		
	}
	
	/*@GetMapping("/searchFlights/{source}/{destination}")
	public List<Flight> getSearchedFlights(@PathVariable String source, @PathVariable String destination){
		return fservice.getSearchedFlights(source, destination);		
	}*/
	
	@GetMapping("/searchFlights")
	public List<Flight> getFlights(){
		return fservice.getFlights();		
	}
	
	@GetMapping("/searchBookingHistory/{airlinesname}")
	public List<Booking> getBookingHistory(@PathVariable String airlinesname) {		
		return bservice.getBookingHistory(airlinesname);
	}
	

	}

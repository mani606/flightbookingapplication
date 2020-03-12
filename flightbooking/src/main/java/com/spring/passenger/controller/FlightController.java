package com.spring.passenger.controller;


import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.passenger.model.Flight;
import com.spring.passenger.service.FlightService;


@RestController
@RequestMapping("/flightbooking")
public class FlightController {

	@Autowired
	private FlightService flightService;

	private static final Logger logger = LoggerFactory.getLogger(FlightController.class);

	@GetMapping
	public @ResponseBody List<Flight> getAllFlights() {
		return flightService.getFlights();
	}

	@GetMapping("/{flightid}")
	public @ResponseBody Flight getFlightById(@PathVariable("flight-id") String flightId) {
		return flightService.getFlightById(flightId);
	}
	
	public List<Flight> getSearchedFlights(@PathVariable String source,@PathVariable String destination,@PathVariable Date traveldate){
       return  flightService.getSearchedFlights(source,destination,traveldate);

 }
}



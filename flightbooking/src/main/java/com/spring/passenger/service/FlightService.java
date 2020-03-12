package com.spring.passenger.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.passenger.model.Flight;
import com.spring.passenger.repository.FlightRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FlightService {
	
	@Autowired
	FlightRepository frepo;

	public List<Flight> getSearchedFlights(String source , String destination, Date traveldate) {
		return frepo.findBySource(source , destination);		
	}

	public List<Flight> getFlights() {
		// TODO Auto-generated method stub
		List<Flight>  fs = frepo.findAll();
		System.out.println("Size : "+fs.size());
		return fs;
	}

	public Flight getFlightById(String flightId) {
		// TODO Auto-generated method stub
		return null;
	}
}

	
	



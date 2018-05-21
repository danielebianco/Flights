package it.polito.tdp.flight.model;

import java.util.*;

public class AirlineIdMap {
	
	private Map<Integer,Airline> map;
	
	public AirlineIdMap() {
		map = new HashMap<Integer,Airline>();
	}
	
	
	public Airline get(int airlineId ) {
		return map.get(airlineId);
	}
	
	public Airline get(Airline airline) {
		Airline old = map.get(airline.getAirlineId());
		if(old==null) {
			map.put(airline.getAirlineId(), airline);
			return airline;
		}
		return old;
	}
	
	public void put(Airline airline, int airlineId) {
		map.put(airlineId, airline);
	}
	
	
}

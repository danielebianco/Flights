package it.polito.tdp.flight.model;

import java.util.*;

public class AirportIdMap {
	
	private Map<Integer,Airport> map;
	
	public AirportIdMap() {
		map = new HashMap<Integer,Airport>();
	}
	
	
	public Airport get(int airportId ) {
		return map.get(airportId);
	}
	
	public Airport get(Airport airport) {
		Airport old = map.get(airport.getAirportId());
		if(old==null) {
			map.put(airport.getAirportId(), airport);
			return airport;
		}
		return old;
	}
	
	public void put(Airport airport, int airportId) {
		map.put(airportId, airport);
	}
	
	
}

package it.polito.tdp.flight.model;

import java.util.*;

public class TestModel {

	public static void main(String[] args) {
		
		Model m = new Model();
		Airport a = m.getAirport().get(0);
		System.out.println(a);
		System.out.println(a.getRoutes());
		
		m.createGraph();
		m.printStats();
		
		Set<Airport> biggestSCC = m.getBiggestSCC();
		System.out.println(biggestSCC.size());
		
		List<Airport> airportList = new ArrayList<Airport>(biggestSCC);
		int id1 = airportList.get(0).getAirportId();
		int id2 = airportList.get(15).getAirportId();
		
		System.out.println(m.getShortestPath(id1,id2));
		
//		try {
//			int id1 = 8591;	 --> NYC <--
//		//	int id2 = 1525;  --> BGY <--
//			int id2 = 3469;  --> SFO <--
//			
//			System.out.println(m.getShortestPath(id1,id2));
//		
//		} catch(RuntimeException e) {
//			System.out.println("Airport code error");
//		}
		
	}

}

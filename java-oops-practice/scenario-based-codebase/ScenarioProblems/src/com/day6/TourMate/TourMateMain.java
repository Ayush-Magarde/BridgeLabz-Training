package com.day6.TourMate;

public class TourMateMain {

	public static void main(String[] mains) {
		
		Transport flight = new Transport(25000);
		Hotel hotel = new Hotel(15000);
		Activity activity = new Activity(5000);
		
		Trip domesticTrip = new DomesticTrip(
				"Manali", 5, flight, hotel, activity);
		
		Trip internationalTrip = new InternationalTrip(
				"Spain", 10, flight, hotel, activity);
		
		domesticTrip.book();
		domesticTrip.displayTrip();
		
		System.out.println();
		
		internationalTrip.book();
		internationalTrip.displayTrip();
		internationalTrip.cancel();
		
		
	}
}

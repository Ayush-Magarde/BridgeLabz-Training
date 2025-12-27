package com.constructors.levelone;

public class HotelBookingMain {

	public static void main(String[] args) {
		HotelBooking booking1 = new HotelBooking ();
		HotelBooking booking2 = new HotelBooking ("Max", "Presidential suite", 2);
		HotelBooking booking3 = new HotelBooking (booking2);
		booking1.displayBookingDetails();
		booking2.displayBookingDetails();
		booking3.displayBookingDetails();
	}

}

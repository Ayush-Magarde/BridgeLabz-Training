package com.constructors.levelone;

public class HotelBooking {
	String guestName;
	String roomType;
	int nights;

	public HotelBooking() {
		guestName = "Ayush";
		roomType = "Deluxe Suite";
		nights = 4;
	}
	public HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	public HotelBooking(HotelBooking copyAttributes) {
		this.guestName = copyAttributes.guestName;
		this.roomType = copyAttributes.roomType;
		this.nights = copyAttributes.nights;
	}
	public void displayBookingDetails() {
		System.out.println("Guest name: " + guestName);
		System.out.println("Room type: " + roomType);
		System.out.println("Number of nights: " + nights);
	}

}

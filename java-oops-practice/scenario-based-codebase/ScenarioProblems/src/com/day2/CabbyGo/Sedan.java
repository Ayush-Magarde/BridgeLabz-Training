package com.day2.CabbyGo;

public class Sedan extends Vehicle implements IRideService {
	
    private boolean isBooked;
    private final double baseFare = 180;
    private final double farePerKilometer = 150;
	
	public Sedan (String vehicleNumber, int capacity) {
		super(vehicleNumber, capacity,"Sedan");
	}
	
	public boolean getIsBooked() {
		return isBooked;
	}
	
	@Override
	public void bookRide() {
		if(!isBooked) {
			isBooked = true;
			System.out.println("Sedan ride booked!");
		} else {
	        System.out.println("Sedan is already booked.");
	    }
	}
	@Override
	public void endRide() {
		isBooked = false;
		System.out.println("Sedan ride ended.");
	}
	@Override
	public double calculateFare(int distance) {
		return baseFare + (farePerKilometer * distance); 
	}

}

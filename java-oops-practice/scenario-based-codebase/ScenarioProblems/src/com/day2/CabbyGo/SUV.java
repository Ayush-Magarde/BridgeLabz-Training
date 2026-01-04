package com.day2.CabbyGo;

public class SUV extends Vehicle implements IRideService {
	
    private boolean isBooked;
    private final double baseFare = 150;
    private final double farePerKilometer = 100;
	
	public SUV(String vehicleNumber, int capacity) {
		super(vehicleNumber, capacity,"SUV");
	}
	
	public boolean getIsBooked() {
		return isBooked;
	}
	
	@Override
	public void bookRide() {
		if(!isBooked) {
			isBooked = true;
			System.out.println("SUV ride booked!");
		} else {
	        System.out.println("SUV is already booked.");
	    }
	}
	@Override
	public void endRide() {
		isBooked = false;
		System.out.println("SUV ride ended.");
	}
	@Override
	public double calculateFare(int distance) {
		return baseFare + (farePerKilometer * distance); 
	}

}

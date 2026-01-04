package com.day2.CabbyGo;

public class Mini extends Vehicle implements IRideService {
	
    private boolean isBooked;
    private final double baseFare = 100;
    private final double farePerKilometer = 50;
	
	public Mini (String vehicleNumber, int capacity) {
		super(vehicleNumber, capacity,"Mini");
	}
	
	public boolean getIsBooked() {
		return isBooked;
	}
	
	@Override
	public void bookRide() {
		if(!isBooked) {
			isBooked = true;
			System.out.println("Mini ride booked!");
		} else {
	        System.out.println("Mini is already booked.");
	    }
	}
	@Override
	public void endRide() {
		isBooked = false;
		System.out.println("Mini ride ended.");
	}
	@Override
	public double calculateFare(int distance) {
		return baseFare + (farePerKilometer * distance); 
	}

}

package com.vehicleRentalApplication;

public class Bike extends Vehicle implements Rentable {
	
	public Bike (String vehicleNumber, double ratePerDay) {
		super(vehicleNumber, ratePerDay);
	}
	
	@Override
	public double calculateRent(int days) {
		return (getRatePerDay()  * days) + 100;  // 100 rupees extra charge
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle Type: Bike");
		super.displayInfo();
	}
}

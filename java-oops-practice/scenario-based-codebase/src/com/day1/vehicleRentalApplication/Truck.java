package com.vehicleRentalApplication;

public class Truck extends Vehicle implements Rentable{

	public Truck (String vehicleNumber, double ratePerDay) {
		super(vehicleNumber, ratePerDay);
	}
	
	@Override
	public double calculateRent(int days) {
		return (getRatePerDay()  * days) + 1000;  // 1000 rupees extra charge
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle Type: Truck");
		super.displayInfo();
	}
}

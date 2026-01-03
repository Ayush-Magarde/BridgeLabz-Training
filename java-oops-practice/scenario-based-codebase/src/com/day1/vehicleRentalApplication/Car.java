package com.vehicleRentalApplication;

public class Car extends Vehicle implements Rentable {

	public Car (String vehicleNumber, double ratePerDay) {
		super(vehicleNumber, ratePerDay);
	}
	
	@Override
	public double calculateRent(int days) {
		return (getRatePerDay()  * days) + 500;  // 500 rupees extra charge
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Vehicle Type: Car");
		super.displayInfo();
	}
}

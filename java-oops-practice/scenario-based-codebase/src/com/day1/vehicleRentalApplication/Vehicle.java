package com.vehicleRentalApplication;

public class Vehicle {

	protected String vehicleNumber;
	protected double ratePerDay;
	
	public Vehicle(String vehicleNumber,double ratePerDay) {
		this.vehicleNumber = vehicleNumber;
		setRatePerDay(ratePerDay);
	}
	
	// getters and setters
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public double getRatePerDay() {
		return ratePerDay;
	}
	
	public void setRatePerDay(double ratePerDay) {
		if (ratePerDay > 0) {
			this.ratePerDay = ratePerDay;
		}
	}
	
	public void displayInfo() {
		System.out.println("Number: " + vehicleNumber);
		System.out.println("Rate: " + ratePerDay + " INR per day");
	}
}

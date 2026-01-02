package com.encapsulation.vehicleRentalSystem;

public class Car extends Vehicle implements Insurable{

	private String policyNumber;
	public Car (String vehicleNumber, String type, double rate, String policyNumber) {
		super(vehicleNumber, type, rate);
		this.policyNumber = policyNumber;
		
	}
	
	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}
	
	@Override
    public double calculateInsurance() {
        return 500; // fixed insurance
    }
	
	@Override
    public String getInsuranceDetails() {
        return "Car Policy Number: " + policyNumber;
    }
}

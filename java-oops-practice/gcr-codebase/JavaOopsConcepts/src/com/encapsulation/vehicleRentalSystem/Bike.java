package com.encapsulation.vehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {

	private String policyNumber;
    public Bike(String vehicleNumber, String type, double rate, String policyNumber) {
        super(vehicleNumber, type, rate);
        this.policyNumber = policyNumber;
    }

	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}
	
	@Override
    public double calculateInsurance() {
        return 200; // fixed insurance
    }
	
	@Override
    public String getInsuranceDetails() {
        return "Bike Policy Number: " + policyNumber;
    }
}

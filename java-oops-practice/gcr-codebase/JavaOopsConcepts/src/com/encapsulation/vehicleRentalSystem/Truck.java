package com.encapsulation.vehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {
	
	private String policyNumber;
    public Truck (String vehicleNumber, String type, double rate, String policyNumber) {
        super(vehicleNumber, type, rate);
        this.policyNumber = policyNumber;
    }
    
	@Override
	public double calculateRentalCost(int days) {
		return getRentalRate() * days;
	}
	
	@Override
    public double calculateInsurance() {
        return 2000; // fixed insurance
    }
	
	@Override
    public String getInsuranceDetails() {
        return "Truck Policy Number: " + policyNumber;
    }
}

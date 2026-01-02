package com.encapsulation.rideHailingApplication;

public abstract class Vehicle {

	private int vehicleId;
	private String driverName;
	private double ratePerKm;

	public Vehicle(int vehicleId, String driverName, double ratePerKm) {
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		setRatePerKm(ratePerKm);
	}
	
    public int getVehicleId() {
        return vehicleId;
    }
    
    public String getDriverName() {
        return driverName;
    }
    
    public double getRatePerKm() {
        return ratePerKm;
    }
    
    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm > 0) {
            this.ratePerKm = ratePerKm;
        }
    }
    
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: INR " + ratePerKm);
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}
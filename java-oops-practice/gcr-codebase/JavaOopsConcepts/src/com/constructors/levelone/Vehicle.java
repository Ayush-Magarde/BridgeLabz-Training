package com.constructors.levelone;

public class Vehicle {
	
	String ownerName;
	String vehicleType;
	static int registrationFee = 1000;
	
	// Constructor
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	// Instance method to display vehicle details
	public void displayVehicleDetails() {
		System.out.println("Owner name: " + ownerName);
		System.out.println("Vehicle type: " + vehicleType);
		System.out.println("Registration fee: " + registrationFee);
	}
	
	// Class method to update registration fee
	public static void updateRegistrationFee (int newRegistrationFee) {
		registrationFee = newRegistrationFee;
	}

}

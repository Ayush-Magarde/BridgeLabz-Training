package com.constructors.levelone;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("Ayush", "BMW");
		vehicle1.displayVehicleDetails();
		Vehicle.updateRegistrationFee(2500);
		Vehicle vehicle2 = new Vehicle ("Max", "Audi");
		vehicle2.displayVehicleDetails();
	}
}

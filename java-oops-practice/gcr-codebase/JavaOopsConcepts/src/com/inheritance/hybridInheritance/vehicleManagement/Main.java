package com.inheritance.hybridInheritance.vehicleManagement;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = new ElectricVehicle(200, "Tesla - S");
		Vehicle vehicle2 = new PetrolVehicle(180, "BMW");
		
		vehicle1.displayInfo();
		((ElectricVehicle)vehicle1).charge();
		
		System.out.println();
		
		vehicle2.displayInfo();
		((PetrolVehicle)vehicle2).refuel();
	}
}

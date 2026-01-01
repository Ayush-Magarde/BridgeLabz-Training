package com.inheritance.hybridInheritance.vehicleManagement;

public class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    
    public void charge() {
        System.out.println("Electric vehicle is charging");
    }
}

package com.day1.smartHomeAutomationSystem;

public class Main {

	public static void main(String[] args) {
		
		Controllable light = new Light();
		Controllable fan = new Fan(50);
		Controllable ac = new AC(100);
		
		UserController controller = new UserController();
		
		controller.controlDevice(light, true);
		controller.controlDevice(fan, true);
		controller.controlDevice(ac, true);
		
		System.out.println();
		
        controller.compareEnergyUsage((Appliance)light, (Appliance)ac);
        controller.compareEnergyUsage((Appliance)fan, (Appliance)light);
        
        System.out.println();

        controller.controlDevice(ac, false);
	}

}

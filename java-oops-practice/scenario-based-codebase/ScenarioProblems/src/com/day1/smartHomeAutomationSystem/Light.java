package com.day1.smartHomeAutomationSystem;

public class Light extends Appliance implements Controllable {
	
	public Light () {
		super(40); // light uses 40 watts
	}
	
	@Override
	public void turnOn() {
		setOn(true);
		System.out.println("Light turned ON!");
	}
	
	@Override
	public void turnOff() {
		setOn(false);
		System.out.println("Light turned OFF!");
	}

}

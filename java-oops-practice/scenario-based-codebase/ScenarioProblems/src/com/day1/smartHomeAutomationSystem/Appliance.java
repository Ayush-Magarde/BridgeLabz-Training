package com.day1.smartHomeAutomationSystem;

public abstract class Appliance {

	private boolean isOn;
	private int powerUsage;
	
	public Appliance(int powerUsage) {
		this.powerUsage = powerUsage;
		this.isOn = false; // device is off
	}
	
	protected void setOn(boolean state) {
		this.isOn = state;
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public int getPowerUsage() {
		return powerUsage;
	}
	
	public void displayStatus() {
        System.out.println("Power Usage: " + powerUsage + "W");
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
	}
}

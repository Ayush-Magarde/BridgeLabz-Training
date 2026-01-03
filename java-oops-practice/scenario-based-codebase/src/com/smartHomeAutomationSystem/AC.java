package com.smartHomeAutomationSystem;

public class AC extends Appliance implements Controllable {

    public AC(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("AC cooling started");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("AC turned OFF");
    }
}

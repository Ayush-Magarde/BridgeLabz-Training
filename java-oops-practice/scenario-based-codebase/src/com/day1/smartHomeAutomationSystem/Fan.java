package com.smartHomeAutomationSystem;

public class Fan extends Appliance implements Controllable  {

    public Fan(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan started spinning");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan stopped");
    }
}

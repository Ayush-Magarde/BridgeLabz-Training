package com.inheritance.singleInheritance.smartHomeDevices;

public class Main {

    public static void main(String[] args) {

        Thermostat thermostat =
            new Thermostat("TH-101", "ON", 24);

        thermostat.displayStatus();
    }
}

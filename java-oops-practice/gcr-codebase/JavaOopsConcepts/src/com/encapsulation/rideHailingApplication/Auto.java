package com.encapsulation.rideHailingApplication;

public class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.9;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}

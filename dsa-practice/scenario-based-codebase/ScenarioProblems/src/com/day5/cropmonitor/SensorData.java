package com.day5.cropmonitor;

public class SensorData {

    long timestamp;

    public SensorData(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Timestamp: " + timestamp;
    }
}

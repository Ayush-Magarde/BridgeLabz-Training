package com.day5.cropmonitor;

public class CropMonitorMain {

    public static void main(String[] args) {

        SensorData[] data = {
                new SensorData(1690004000),
                new SensorData(1689992000),
                new SensorData(1690010000),
                new SensorData(1689989000)
        };

        CropMonitor monitor = new CropMonitor();

        monitor.quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Sensor Data:");
        monitor.displayData(data);
    }
}

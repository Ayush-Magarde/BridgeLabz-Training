package com.day5.cropmonitor;

public class CropMonitor {

    public void quickSort(SensorData[] data, int low, int high) {

        if (low < high) {
            int pivot = partition(data, low, high);
            quickSort(data, low, pivot - 1);
            quickSort(data, pivot + 1, high);
        }
    }

    private int partition(SensorData[] data, int low, int high) {

        long pivot = data[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp < pivot) {
                i++;
                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        SensorData temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    public void displayData(SensorData[] data) {
        for (SensorData d : data)
            System.out.println(d);
    }
}

package com.day8.movietime;

public class Show {
    String movieName;
    int showTime; // 24-hour format

    public Show(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return movieName + " | Time: " + showTime;
    }
}

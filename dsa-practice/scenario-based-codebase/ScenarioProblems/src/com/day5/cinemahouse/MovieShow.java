package com.day5.cinemahouse;

public class MovieShow {

    int showTime; // in 24-hr format

    public MovieShow(int showTime) {
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "Show Time: " + showTime;
    }
}

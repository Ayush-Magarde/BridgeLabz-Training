package com.day5.cinemahouse;

public class CinemaHouseMain {

    public static void main(String[] args) {

        CinemaHouse cinema = new CinemaHouse(10);

        cinema.addShow(new MovieShow(1800));
        cinema.addShow(new MovieShow(1400));
        cinema.addShow(new MovieShow(2100));
        cinema.addShow(new MovieShow(1600));

        cinema.sortShows();

        System.out.println("Sorted Movie Show Timings:");
        cinema.displayShows();
    }
}

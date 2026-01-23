package com.day8.movietime;

public class MovieTimeMain {

    public static void main(String[] args) {

        MovieTime mt = new MovieTime(10);

        mt.addShow(new Show("Inception", 1800));
        mt.addShow(new Show("Avatar", 1500));
        mt.addShow(new Show("Interstellar", 2000));
        mt.addShow(new Show("Dune", 1700));

        System.out.println("Sorted Show Listings:");
        mt.displayShows();
    }
}

package com.day5.cinemahouse;

public class CinemaHouse {

    private MovieShow[] shows;
    private int size;

    public CinemaHouse(int capacity) {
        shows = new MovieShow[capacity];
        size = 0;
    }

    public void addShow(MovieShow show) {
        shows[size++] = show;
    }

    // Bubble Sort for small dataset
    public void sortShows() {

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (shows[j].showTime > shows[j + 1].showTime) {
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }

    public void displayShows() {
        for (int i = 0; i < size; i++)
            System.out.println(shows[i]);
    }
}

package com.day6.artexpo;

public class ArtExpo {

    private Artist[] artists;
    private int size;

    public ArtExpo(int capacity) {
        artists = new Artist[capacity];
        size = 0;
    }

    // Insert artist in sorted order by registration time
    public void addArtist(Artist artist) {

        int i = size - 1;

        while (i >= 0 && artists[i].registrationTime > artist.registrationTime) {
            artists[i + 1] = artists[i];
            i--;
        }

        artists[i + 1] = artist;
        size++;
    }

    public void displayArtists() {
        for (int i = 0; i < size; i++)
            System.out.println(artists[i]);
    }
}

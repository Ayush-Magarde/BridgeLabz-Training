package com.day6.artexpo;

public class ArtExpoMain {

    public static void main(String[] args) {

        ArtExpo expo = new ArtExpo(10);

        expo.addArtist(new Artist("Ayush", 30));
        expo.addArtist(new Artist("Neha", 10));
        expo.addArtist(new Artist("Ravi", 25));
        expo.addArtist(new Artist("Aarya", 5));

        System.out.println("Artists sorted by registration time:");
        expo.displayArtists();
    }
}

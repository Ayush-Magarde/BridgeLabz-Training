package com.day6.artexpo;

public class Artist {

    String name;
    int registrationTime; // minutes since opening

    public Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return name + " | Registered at: " + registrationTime;
    }
}

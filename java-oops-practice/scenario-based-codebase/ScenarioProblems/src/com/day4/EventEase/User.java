package com.day4.EventEase;

public class User {

    private String name;
    private String email;   // sensitive data (encapsulated)

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayUser() {
        System.out.println("Organizer: " + name);
    }
}

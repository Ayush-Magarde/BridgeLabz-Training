package com.day9.birdsanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String id, String name) {
        super(id, name, "Seagull");
    }

    public void fly() {
        System.out.println("Seagull glides near the sea.");
    }

    public void swim() {
        System.out.println("Seagull floats on water.");
    }
}

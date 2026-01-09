package com.day4.PetPal;

import java.util.Random;

public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated internal states
    private int hunger;
    private int energy;
    private int mood;

    // Constructor with random default values
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hunger = r.nextInt(50) + 30;   // 30–80
        this.energy = r.nextInt(50) + 30;
        this.mood = r.nextInt(50) + 30;
    }

    // Constructor with user-defined values
    public Pet(String name, String type, int age, int hunger, int energy, int mood) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = hunger;
        this.energy = energy;
        this.mood = mood;
    }

    // Encapsulation: controlled updates only
    protected void changeHunger(int value) {
        hunger += value;
    }

    protected void changeEnergy(int value) {
        energy += value;
    }

    protected void changeMood(int value) {
        mood += value;
    }

    public void displayStatus() {
        System.out.println(
                name + " (" + type + ")" +
                " | Hunger: " + hunger +
                " | Energy: " + energy +
                " | Mood: " + mood
        );
    }

    // Polymorphic behavior
    public abstract void makeSound();
}


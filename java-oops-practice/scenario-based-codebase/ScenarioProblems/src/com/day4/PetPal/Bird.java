package com.day4.PetPal;

public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    public void feed() {
        changeHunger(-6);
        changeMood(4);
        System.out.println(name + " pecked some seeds.");
    }

    @Override
    public void play() {
        changeEnergy(-12);
        changeMood(8);
        System.out.println(name + " is flying around!");
    }

    @Override
    public void sleep() {
        changeEnergy(15);
        System.out.println(name + " is resting in its nest.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }
}

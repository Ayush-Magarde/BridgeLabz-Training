package com.day4.PetPal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    public void feed() {
        changeHunger(-8);
        changeMood(3);
        System.out.println(name + " ate quietly.");
    }

    @Override
    public void play() {
        changeEnergy(-10);
        changeMood(7);
        System.out.println(name + " played with a toy.");
    }

    @Override
    public void sleep() {
        changeEnergy(25);
        System.out.println(name + " is napping.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

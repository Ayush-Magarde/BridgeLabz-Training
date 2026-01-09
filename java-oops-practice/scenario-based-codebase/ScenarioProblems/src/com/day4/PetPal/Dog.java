package com.day4.PetPal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    public void feed() {
        changeHunger(-10);
        changeMood(5);
        System.out.println(name + " enjoyed the food!");
    }

    @Override
    public void play() {
        changeEnergy(-15);
        changeMood(10);
        System.out.println(name + " is playing fetch!");
    }

    @Override
    public void sleep() {
        changeEnergy(20);
        System.out.println(name + " is sleeping peacefully.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

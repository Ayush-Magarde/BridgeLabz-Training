package com.day4.PetPal;

public class PetPalMain {

    public static void main(String[] args) {

        Pet dog = new Dog("Tommy", 3);
        Pet cat = new Cat("Kitty", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.makeSound();
        dog.feed();
        dog.play();
        dog.displayStatus();

        System.out.println();

        cat.makeSound();
        cat.sleep();
        cat.displayStatus();

        System.out.println();

        bird.makeSound();
        bird.play();
        bird.feed();
        bird.displayStatus();
    }
}

package com.inheritance.animalHierarchy;

public class Main {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog("Bob", 4);
		animals[1] = new Cat("Tom", 2);
		animals[2] = new Bird("Jessie", 1);
		
		for (Animal a : animals) {
			a.makeSound();
		}
	}
}

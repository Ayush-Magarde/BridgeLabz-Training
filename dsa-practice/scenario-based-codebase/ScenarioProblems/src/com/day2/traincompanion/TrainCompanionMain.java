package com.day2.traincompanion;

public class TrainCompanionMain {

    public static void main(String[] args) {

        TrainCompanion train = new TrainCompanion();

        train.addCompartment("Engine");
        train.addCompartment("Sleeper");
        train.addCompartment("Pantry");
        train.addCompartment("AC");

        train.displayForward();
        train.displayBackward();

        train.removeCompartment("Pantry");

        train.displayForward();
    }
}

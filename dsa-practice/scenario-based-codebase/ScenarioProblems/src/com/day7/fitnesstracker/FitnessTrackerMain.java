package com.day7.fitnesstracker;

public class FitnessTrackerMain {

    public static void main(String[] args) {

        User[] users = {
                new User("Ayush", 8500),
                new User("Neha", 12000),
                new User("Ravi", 7000),
                new User("Aarya", 9500)
        };

        FitnessTracker ft = new FitnessTracker();
        ft.bubbleSort(users);

        System.out.println("Daily Step Rankings:");
        for (User u : users)
            System.out.println(u);
    }
}

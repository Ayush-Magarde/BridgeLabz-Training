package com.day4.FitTrack;

public class FitTrackMain {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Ayush", 22, 70.5, 2500);
        user.displayProfile();

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(40);

        cardio.startWorkout();
        int cardioCalories = cardio.calculateCalories();
        cardio.stopWorkout();

        strength.startWorkout();
        int strengthCalories = strength.calculateCalories();
        strength.stopWorkout();

        int totalBurned = cardioCalories + strengthCalories;

        // Operator usage for progress
        int remainingCalories = user.getDailyGoal() - totalBurned;

        System.out.println("Calories Burned Today: " + totalBurned);
        System.out.println("Remaining Calories to Goal: " + remainingCalories);
    }
}

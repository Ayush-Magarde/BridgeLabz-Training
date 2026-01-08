package com.day4.FitTrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration;          // in minutes
    protected int caloriesBurned;

    // Internal logs (restricted access)
    protected String[] workoutLogs;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
        this.workoutLogs = new String[5];
    }

    public abstract int calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
    }
}

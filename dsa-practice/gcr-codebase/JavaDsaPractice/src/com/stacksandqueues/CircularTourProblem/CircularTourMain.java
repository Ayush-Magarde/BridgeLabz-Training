package com.stacksandqueues.CircularTourProblem;

public class CircularTourMain {

    public static void main(String[] args) {

        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        int startIndex = CircularTour.findStartingPoint(petrol, distance);

        if (startIndex == -1) {
            System.out.println("Circular tour is not possible");
        } else {
            System.out.println("Start the tour from petrol pump index: " + startIndex);
        }
    }
}

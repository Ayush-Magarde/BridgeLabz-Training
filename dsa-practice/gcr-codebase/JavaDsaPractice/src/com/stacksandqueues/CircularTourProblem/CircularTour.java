package com.stacksandqueues.CircularTourProblem;

import java.util.Queue;
import java.util.LinkedList;

public class CircularTour {

    // Method to find starting petrol pump index
    public static int findStartingPoint(int[] petrol, int[] distance) {

        int n = petrol.length;

        Queue<Integer> queue = new LinkedList<>();

        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < n; i++) {
            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
                queue.clear();
            } else {
                queue.offer(i);
            }
        }

        if (surplus + deficit >= 0)
            return start;

        return -1; // Tour not possible
    }
}

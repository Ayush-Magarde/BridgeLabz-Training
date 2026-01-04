package com.stacksandqueues.SlidingWindowMaximum;

public class SlidingWindowMaximumMain {

    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] maxValues = SlidingWindowMaximum.findSlidingWindowMaximum(arr, k);

        System.out.println("Sliding Window Maximums:");
        for (int value : maxValues) {
            System.out.print(value + " ");
        }
    }
}

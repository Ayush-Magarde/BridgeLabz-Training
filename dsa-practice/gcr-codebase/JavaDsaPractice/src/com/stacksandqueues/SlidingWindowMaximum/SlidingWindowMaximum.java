package com.stacksandqueues.SlidingWindowMaximum;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

    // Method to find maximum of each sliding window
    public static int[] findSlidingWindowMaximum(int[] arr, int k) {

        if (arr == null || k <= 0)
            return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new LinkedList<>(); // stores indices

        for (int i = 0; i < n; i++) {

            // Remove indices that are out of current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements (not useful)
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Store result once first window is complete
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }
}

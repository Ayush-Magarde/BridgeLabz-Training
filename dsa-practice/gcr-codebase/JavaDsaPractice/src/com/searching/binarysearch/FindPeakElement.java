package com.searching.binarysearch;

public class FindPeakElement {

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }

    // Binary search to find a peak element
    public static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            boolean leftOk = (mid == 0) || arr[mid] > arr[mid - 1];
            boolean rightOk = (mid == arr.length - 1) || arr[mid] > arr[mid + 1];

            // Check if mid is a peak
            if (leftOk && rightOk) {
                return mid;
            }

            // If left neighbor is greater, move left
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Else move right
            else {
                left = mid + 1;
            }
        }

        return -1; // fallback (should not happen for valid input)
    }
}

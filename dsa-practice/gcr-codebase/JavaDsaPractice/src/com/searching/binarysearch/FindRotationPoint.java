package com.searching.binarysearch;

public class FindRotationPoint {

    public static void main(String[] args) {

        int[] arr = {15, 18, 2, 3, 6, 12};

        int index = findRotationPoint(arr);

        System.out.println("Rotation point index: " + index);
        System.out.println("Smallest element: " + arr[index]);
    }

    // Binary search to find index of smallest element
    public static int findRotationPoint(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // index of smallest element (rotation point)
    }
}

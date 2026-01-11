package com.searching.binarysearch;

public class FirstAndLastOccurrence {

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        if (first == -1 || last == -1) {
            System.out.println("-1");
        } else {
            System.out.println("First occurrence index: " + first);
            System.out.println("Last occurrence index: " + last);
        }
    }

    // Binary search for first occurrence
    public static int findFirstOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // search left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Binary search for last occurrence
    public static int findLastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // search right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}

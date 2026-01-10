package com.sorting.countingsort.studentages;

public class CountingSort {

    public static void sort(int[] arr, int minAge, int maxAge) {

        int range = maxAge - minAge + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Store frequency of each age
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Compute cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build output array
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy sorted data back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}

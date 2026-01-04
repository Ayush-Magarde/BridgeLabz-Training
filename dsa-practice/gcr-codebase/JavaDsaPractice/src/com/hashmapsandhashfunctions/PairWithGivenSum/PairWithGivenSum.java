package com.hashmapsandhashfunctions.PairWithGivenSum;

import java.util.HashMap;

public class PairWithGivenSum {

    // Method to check if a pair with given sum exists
    public static boolean hasPairWithSum(int[] arr, int targetSum) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            int required = targetSum - num;

            if (map.containsKey(required)) {
                System.out.println("Pair Found: " + num + " + " + required + " = " + targetSum);
                return true;
            }

            map.put(num, true);
        }

        return false;
    }
}

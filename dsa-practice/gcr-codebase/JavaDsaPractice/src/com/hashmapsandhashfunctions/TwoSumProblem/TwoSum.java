package com.hashmapsandhashfunctions.TwoSumProblem;

import java.util.HashMap;

public class TwoSum {

    // Method to find indices of two numbers that add up to target
    public static int[] findTwoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int required = target - nums[i];

            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}

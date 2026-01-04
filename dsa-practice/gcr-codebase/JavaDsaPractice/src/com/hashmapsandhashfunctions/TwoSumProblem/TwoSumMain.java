package com.hashmapsandhashfunctions.TwoSumProblem;

public class TwoSumMain {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.findTwoSum(nums, target);

        if (result[0] == -1) {
            System.out.println("No valid pair found");
        } else {
            System.out.println(
                    "Indices found: " + result[0] + " and " + result[1]
            );
        }
    }
}


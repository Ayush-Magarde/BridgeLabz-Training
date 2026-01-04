package com.hashmapsandhashfunctions.PairWithGivenSum;

public class PairWithGivenSumMain {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int targetSum = 10;

        boolean result = PairWithGivenSum.hasPairWithSum(arr, targetSum);

        if (!result) {
            System.out.println("No pair found with the given sum");
        }
    }
}

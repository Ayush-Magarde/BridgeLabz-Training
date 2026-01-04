package com.hashmapsandhashfunctions.ZeroSumSubarrays;

import java.util.List;

public class ZeroSumSubarraysMain {

    public static void main(String[] args) {

        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};

        List<String> subarrays =
                ZeroSumSubarrays.findZeroSumSubarrays(arr);

        if (subarrays.isEmpty()) {
            System.out.println("No zero-sum subarrays found");
        } else {
            for (String s : subarrays) {
                System.out.println(s);
            }
        }
    }
}

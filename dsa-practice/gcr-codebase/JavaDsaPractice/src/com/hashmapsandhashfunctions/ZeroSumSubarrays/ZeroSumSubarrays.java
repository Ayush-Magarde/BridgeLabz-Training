package com.hashmapsandhashfunctions.ZeroSumSubarrays;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class ZeroSumSubarrays {

    // Method to find all zero-sum subarrays
    public static List<String> findZeroSumSubarrays(int[] arr) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        int sum = 0;

        // Base case: sum = 0 at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    result.add("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        return result;
    }
}

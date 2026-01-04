package com.hashmapsandhashfunctions.LongestConsecutiveSequence;

import java.util.HashMap;

public class LongestConsecutiveSequence {

    // Method to find length of longest consecutive sequence
    public static int findLongestConsecutive(int[] arr) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        // Store all elements in map
        for (int num : arr) {
            map.put(num, true);
        }

        int longest = 0;

        for (int num : arr) {

            // Check if num is the start of a sequence
            if (!map.containsKey(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Count consecutive numbers
                while (map.containsKey(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

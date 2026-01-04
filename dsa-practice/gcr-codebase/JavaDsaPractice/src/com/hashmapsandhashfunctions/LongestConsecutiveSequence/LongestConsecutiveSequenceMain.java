package com.hashmapsandhashfunctions.LongestConsecutiveSequence;

public class LongestConsecutiveSequenceMain {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int result = LongestConsecutiveSequence.findLongestConsecutive(arr);

        System.out.println("Length of Longest Consecutive Sequence: " + result);
    }
}


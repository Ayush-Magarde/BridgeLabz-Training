package com.searching.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {

    public static void main(String[] args) {

        String input = "programming";

        // Step 1: Initialize StringBuilder and HashSet
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        // Step 2: Iterate over each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Step 3: Append only if not already present
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        // Output
        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + result.toString());
    }
}

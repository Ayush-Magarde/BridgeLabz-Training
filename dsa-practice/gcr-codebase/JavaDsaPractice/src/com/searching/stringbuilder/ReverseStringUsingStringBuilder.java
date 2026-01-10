package com.searching.stringbuilder;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        String input = "hello";

        // Step 1: Create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Step 2: Append the string
        sb.append(input);

        // Step 3: Reverse the string
        String reversed = sb.reverse().toString();

        // Output
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}

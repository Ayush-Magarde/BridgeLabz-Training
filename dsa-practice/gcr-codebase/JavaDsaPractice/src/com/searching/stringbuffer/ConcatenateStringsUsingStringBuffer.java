package com.searching.stringbuffer;

public class ConcatenateStringsUsingStringBuffer {

    public static void main(String[] args) {

        String[] words = {"Hello", " ", "World", "!"};

        // Step 1: Create StringBuffer object
        StringBuffer buffer = new StringBuffer();

        // Step 2: Append each string in the array
        for (String word : words) {
            buffer.append(word);
        }

        // Output
        System.out.println("Concatenated String: " + buffer.toString());
    }
}

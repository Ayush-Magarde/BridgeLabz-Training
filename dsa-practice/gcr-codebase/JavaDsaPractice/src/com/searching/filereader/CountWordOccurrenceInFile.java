package com.searching.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrenceInFile {

    public static void main(String[] args) {

        String filePath = "src/com/searching/filereader/sample.txt";
        String targetWord = "java";   // word to search
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {

                // Split line into words
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // Output result
            System.out.println("Word \"" + targetWord + "\" occurred " + count + " times.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

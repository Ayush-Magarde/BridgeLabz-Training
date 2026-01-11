package com.searching.linearsearch;

public class SearchWordInSentences {

    public static void main(String[] args) {

        String[] sentences = {
                "Java is a powerful language",
                "I love learning data structures",
                "Linear search is simple",
                "Practice makes perfect"
        };

        String targetWord = "search";

        String result = findSentenceContainingWord(sentences, targetWord);

        System.out.println(result);
    }

    // Linear search method
    public static String findSentenceContainingWord(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;   // return first matching sentence
            }
        }

        return "Not Found";
    }
}

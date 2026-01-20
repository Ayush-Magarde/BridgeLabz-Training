package com.testprograms.flipkey;

import java.util.Scanner;

public class FlipKeyMain {

	public static String reverseString(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		return reverse;
	}

	public static String cleanseAndInvert (String word) {
		String key = "";
		if (word.length() < 6 || word == null) return key;
		boolean isValid = true;
		for (int i = 0; i < word.length(); i++) {
			int ch = word.charAt(i);
			if (ch < 65 && ch > 90) {
				isValid = false;
				return key;
			}
			// we have to remove all characters whose ascii value is even numbers
			if (ch % 2 != 0) {
				key = key + (char)ch;
			}
		}
		key = reverseString(key);
		String answer = "";
		for (int i = 0; i < key.length(); i++) {
			char ch = key.charAt(i);
			if(i%2 == 0) {
				char upper = (char)(ch - 32);
				answer += upper;
			}
			else {
				answer += ch;
			}
		}
		return answer;
	}
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		String word = input.nextLine().toLowerCase();
		
		System.out.println(cleanseAndInvert(word));
		
		
		
		
		
		
	}
}

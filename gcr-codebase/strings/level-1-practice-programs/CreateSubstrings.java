import java.util.Scanner;
class CreateSubstrings {
	
	// Method to create substring using charAt()
	public static String createSubstringUsingCharAt (String userInput, int startIndex, int endIndex) {
		String sub = "";
		for (int i = startIndex; i < endIndex; i++) {
			sub += userInput.charAt(i);
		}
		return sub;
	}
	
	// Method to compare two strings
	public static boolean compareStrings (String a, String b) {
		if (a.length() != b.length()) return false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) return false;
		}
		return true;
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String userInput = input.next();
		System.out.print("Please enter the start index: ");
		int startIndex = input.nextInt();
		System.out.print("Please enter the end index: ");
		int endIndex = input.nextInt();
		// Calling the method and storing the results
		String subUsingCharAt = createSubstringUsingCharAt (userInput, startIndex, endIndex);
		String sub = userInput.substring(startIndex, endIndex);
		
		// Call the Methods and display the results
		System.out.println ("String using Substring method: " + sub);
		System.out.println ("String using charAt() method: " + subUsingCharAt);
		System.out.println ("Are both strings equal: " + compareStrings(sub, subUsingCharAt));
	}
}
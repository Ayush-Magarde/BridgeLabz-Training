import java.util.Scanner;
class UpperCaseConversion {
	
	// Method to convert to uppercase using charAt
	public static String upperCaseUsingCharAt (String text) {
		String upperCase = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char)(ch - 32);
				upperCase += ch;
			} else upperCase += ch;
		}
		return upperCase;
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
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the text");
		String text = input.nextLine();
		
		// Call the methods
		String upperCaseBuiltIn = text.toUpperCase();
		String upperCaseManual = upperCaseUsingCharAt(text);
		
		// Display the results
		System.out.println ("Are both the strings equal: " + compareStrings(upperCaseBuiltIn, upperCaseManual));
	}
}
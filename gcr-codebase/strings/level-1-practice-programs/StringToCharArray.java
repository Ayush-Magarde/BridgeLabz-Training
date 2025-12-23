import java.util.Scanner;
class StringToCharArray {
	
	// Method to store the characters of the string in a char array
	public static char[] charactersOfString (String text) {
		char[] stringCharacters = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			stringCharacters[i] = text.charAt(i);
		}
		return stringCharacters;
	}
	
	// Method to compare the two char arrays
	public static boolean compareCharArrays (char[] a, char[] b) {
		if (a.length != b.length) return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String text = input.next();
		
		// Calling the methods
		char[] toChar = text.toCharArray();
		char[] toCharManual = charactersOfString(text);
		
		// Compare the arrays and display the results
		System.out.println("The two char arrays are equal: " + compareCharArrays(toChar, toCharManual));		
	}
}
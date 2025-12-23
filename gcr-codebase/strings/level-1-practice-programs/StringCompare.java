import java.util.Scanner;
class StringCompare {

	// Method to compare two strings using charAt
	public static boolean compareStrings (String a, String b) {
		if (a.length() != b.length()) return false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) return false;
		}
		return true;
	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = input.next();
		System.out.print("Enter second string: ");
		String s2 = input.next();
		
		// Call the method to compare the strings
		boolean result1 = compareStrings(s1, s2);
		boolean result2 = s1.equals(s2);
		
		// Display the result
		System.out.println("Using charAt: " + result1);
		System.out.println("Using equals: " + result2);
	}
}

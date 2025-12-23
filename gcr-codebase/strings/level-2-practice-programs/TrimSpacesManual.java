import java.util.Scanner;
class TrimSpacesManual {

	// Method to find start and end indexes after removing leading and trailing spaces
	public static int[] trimIndexes (String text) {
		int start = 0, end = text.length() - 1;
		while (text.charAt(start) == ' ') start++;
		while (text.charAt(end) == ' ') end--;
		return new int[] { start, end + 1 };
	}

	// Method to create substring manually using indexes
	public static String substringManual (String text, int start, int end) {
		String result = "";
		for (int i = start; i < end; i++) {
			result += text.charAt(i);
		}
		return result;
	}

	// Method to compare two strings character by character
	public static boolean compare (String a, String b) {
		if (a.length() != b.length()) return false;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) return false;
		}
		return true;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input string from user
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call methods to trim spaces manually and compare with trim()
		int[] idx = trimIndexes(text);
		String manual = substringManual(text, idx[0], idx[1]);
		String builtIn = text.trim();

		System.out.println("Same result: " + compare(manual, builtIn));
	}
}

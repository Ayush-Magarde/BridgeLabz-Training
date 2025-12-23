import java.util.Scanner;
class FrequencyUsingUnique {

	// Method to find unique characters from the string
	public static char[] uniqueChars (String text) {
		char[] temp = new char[text.length()];
		int index = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			boolean unique = true;
			for (int j = 0; j < i; j++) {
				if (ch == text.charAt(j)) unique = false;
			}
			if (unique) temp[index++] = ch;
		}
		char[] result = new char[index];
		for (int i = 0; i < index; i++) result[i] = temp[i];
		return result;
	}

	// Method to find frequency of characters using unique character array
	public static String[][] frequency (String text) {
		int[] freq = new int[256];
		// Count frequency of each character
		for (int i = 0; i < text.length(); i++) {
			freq[text.charAt(i)]++;
		}
		// Store character and its frequency in 2D array
		char[] unique = uniqueChars(text);
		String[][] result = new String[unique.length][2];
		for (int i = 0; i < unique.length; i++) {
			result[i][0] = String.valueOf(unique[i]);
			result[i][1] = String.valueOf(freq[unique[i]]);
		}
		return result;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input string from user
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call method to calculate and display character frequency
		String[][] table = frequency(text);
		for (String[] row : table) {
			System.out.println(row[0] + " : " + row[1]);
		}
	}
}

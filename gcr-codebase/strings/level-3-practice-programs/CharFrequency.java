import java.util.Scanner;
class CharFrequency {

	// Method to find frequency of each character in the string
	public static String[][] frequency (String text) {
		int[] freq = new int[256];
		// Count frequency of each character
		for (int i = 0; i < text.length(); i++) {
			freq[text.charAt(i)]++;
		}
		// Count number of unique characters
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (freq[text.charAt(i)] > 0) count++;
		}
		// Store character and its frequency in 2D array
		String[][] result = new String[count][2];
		int index = 0;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (freq[ch] > 0) {
				result[index][0] = String.valueOf(ch);
				result[index][1] = String.valueOf(freq[ch]);
				freq[ch] = 0;
				index++;
			}
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

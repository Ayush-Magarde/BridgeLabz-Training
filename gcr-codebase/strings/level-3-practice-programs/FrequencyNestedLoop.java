import java.util.Scanner;
class FrequencyNestedLoop {

	// Method to find frequency of characters using nested loops
	public static String[] frequency (String text) {
		char[] chars = text.toCharArray();
		int[] freq = new int[chars.length];
		// Count frequency of each character
		for (int i = 0; i < chars.length; i++) {
			freq[i] = 1;
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					freq[i]++;
					chars[j] = '0';
				}
			}
		}
		// Count number of unique characters
		int count = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != '0') count++;
		}
		// Store character and its frequency in string array
		String[] result = new String[count];
		int index = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != '0') result[index++] = chars[i] + " : " + freq[i];
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
		String[] result = frequency(text);
		for (String s : result) System.out.println(s);
	}
}

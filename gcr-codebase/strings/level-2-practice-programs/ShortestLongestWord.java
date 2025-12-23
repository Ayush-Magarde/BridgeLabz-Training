import java.util.Scanner;
class ShortestLongestWord {

	// Method to find length of string without using length()
	public static int findLength (String text) {
		int count = 0;
		try {
			while (true) {
				text.charAt(count);
				count++;
			}
		} catch (Exception e) {
			return count;
		}
	}

	// Method to split string into words without using split()
	public static String[] splitManual (String text) {
		int words = 1;
		for (int i = 0; i < findLength(text); i++) {
			if (text.charAt(i) == ' ') words++;
		}
		String[] result = new String[words];
		int start = 0, index = 0;
		for (int i = 0; i <= findLength(text); i++) {
			if (i == findLength(text) || text.charAt(i) == ' ') {
				result[index++] = text.substring(start, i);
				start = i + 1;
			}
		}
		return result;
	}

	// Method to find shortest and longest word length
	public static int[] shortestLongest (String[] words) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (String w : words) {
			int len = findLength(w);
			if (len < min) min = len;
			if (len > max) max = len;
		}
		return new int[] { min, max };
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.nextLine();

		// Call methods to find shortest and longest word length
		int[] result = shortestLongest(splitManual(text));
		System.out.println("Shortest length: " + result[0]);
		System.out.println("Longest length: " + result[1]);
	}
}

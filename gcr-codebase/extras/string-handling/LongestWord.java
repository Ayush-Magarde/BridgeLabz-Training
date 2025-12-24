import java.util.Scanner; 
class LongestWord {
	
	// Method to find the longest word
	public static String longestWordFinder (String text) {
		String[] split = text.split(" ");
		String longestWord = "";
		int length = -1;
		// Here we have an array of strings ["what","is","your","age"]
		// now we will traverse the array
		for (String word : split) {
			// here word is a string
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
	}
	
	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.nextLine();
		String longestWord = longestWordFinder(text);
		System.out.println ("Longest word: " +longestWord);
		System.out.println ("Length of the longest word: " + longestWord.length());
	}
}
import java.util.Scanner;
class WordLengthInTwoDArray {
	
	// Method to find the length of the array
	public static int findLength(String text) {
		int count = 0;
		try {
			while(true) {
				text.charAt(count);
				count++;
			}
		} catch(Exception e) {
			return count;
		}
	}

	// Method to manually split the string
	public static String[] splitManual(String text) {
		int words = 1;
		for(int i = 0; i < findLength(text); i++) {
			if(text.charAt(i) == ' ') words++;
		}
		String[] result = new String[words];
		int start = 0, index = 0;
		for(int i = 0; i <= findLength(text); i++) {
			if(i == findLength(text) || text.charAt(i) == ' ') {
				result[index++] = text.substring(start, i);
				start = i + 1;
			}
		}
		return result;
	}

	// Method to create a 2d array for word and length
	public static String[][] wordWithLength(String[] words) {
		String[][] data = new String[words.length][2];
		for(int i = 0; i < words.length; i++) {
			data[i][0] = words[i];
			data[i][1] = String.valueOf(findLength(words[i]));
		}
		return data;
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.nextLine();
		String[][] table = wordWithLength(splitManual(text));
		for(String[] row : table) {
			System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
		}
	}
}

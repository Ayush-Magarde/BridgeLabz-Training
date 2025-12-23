import java.util.Scanner;
class SplitAndCompare {

	// Method to find length without using length()
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

	// Method to split text using charAt
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

	// Method to compare two string arrays
	public static boolean compareArrays(String[] a, String[] b) {
		if(a.length != b.length) return false;
		for(int i = 0; i < a.length; i++) {
			if(!a[i].equals(b[i])) return false;
		}
		return true;
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String text = input.nextLine();
		String[] manual = splitManual(text);
		String[] builtIn = text.split(" ");
		System.out.println("Same result: " + compareArrays(manual, builtIn));
	}
}

import java.util.Scanner;
class SubstringCount {

    // Method to count how many times a substring occurs in a string
    public static int countSubstringOccurrences (String text, String sub) {
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub)) {
                count++; // match found, increase count
            }
        }
        return count; // return final count
    }
	
	// Main method 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter the main string: ");
        String text = input.nextLine();
        System.out.print("Enter the substring: ");
        String sub = input.nextLine();

        // Call the method
        int result = countSubstringOccurrences(text, sub);

        // Display the result
        System.out.println("Occurrences: " + result);
    }
}

import java.util.Scanner;
class LexicographicalComparison {

    // Method to compare two strings lexicographically
    public static int compareStringsLexicographically (String text1, String text2) {
        int minLength = text1.length() < text2.length() ? text1.length() : text2.length();
        for (int i = 0; i < minLength; i++) {
            // Compare characters one by one
            if (text1.charAt(i) != text2.charAt(i)) {
                return text1.charAt(i) - text2.charAt(i); // difference decides order
            }
        }
        // If all characters match till min length
        return text1.length() - text2.length();
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = input.nextLine();
        System.out.print("Enter second string: ");
        String text2 = input.nextLine();
        int result = compareStringsLexicographically(text1, text2);
        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println("First string comes before second string");
        } else {
            System.out.println("First string comes after second string");
        }
    }
}

import java.util.Scanner;
class AnagramCheck {

    // Method to check whether two strings are anagrams
    public static boolean areAnagrams (String text1, String text2) {
        // If lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }
        int[] freq = new int[256]; // frequency array for ASCII characters
        for (int i = 0; i < text1.length(); i++) {
            freq[text1.charAt(i)]++;
        }
        for (int i = 0; i < text2.length(); i++) {
            freq[text2.charAt(i)]--;
        }
        // If any count is not zero, not an anagram
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String text1 = input.nextLine();
        System.out.print("Enter second string: ");
        String text2 = input.nextLine();
        boolean result = areAnagrams(text1, text2);
        if (result) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}

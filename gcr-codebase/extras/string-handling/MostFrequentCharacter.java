import java.util.Scanner;
class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter (String text) {
        int[] freq = new int[256]; // frequency array for ASCII characters
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++; // count frequency of each character
        }
        int maxCount = 0;
        char mostFrequent = text.charAt(0);
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > maxCount) {
                maxCount = freq[text.charAt(i)];
                mostFrequent = text.charAt(i);
            }
        }
        return mostFrequent; // return most frequent character
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        char result = findMostFrequentCharacter(text);
        System.out.println("Most frequent character: " + result);
    }
}

import java.util.Scanner;
class ReplaceWordInSentence {

    // Method to replace a given word with another word in a sentence
    public static String replaceWord (String sentence, String oldWord, String newWord) {
        String result = "";
        int i = 0;
        while (i < sentence.length()) {
            // Check if oldWord matches starting at index i
            if (i + oldWord.length() <= sentence.length()
                && sentence.substring(i, i + oldWord.length()).equals(oldWord)) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }
        return result;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();
        System.out.print("Enter new word: ");
        String newWord = input.nextLine();
        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Sentence after replacement: " + result);
    }
}

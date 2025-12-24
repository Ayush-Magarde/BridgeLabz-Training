import java.util.Scanner;
class RemoveCharacter {

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacterFromString (String text, char ch) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            // Add character only if it is not equal to given character
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = input.next().charAt(0);
        String result = removeCharacterFromString(text, ch);
        System.out.println("String after removing character: " + result);
    }
}

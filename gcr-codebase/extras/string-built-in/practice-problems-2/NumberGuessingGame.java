import java.util.Scanner;
class NumberGuessingGame {

    // Method to generate computer guess
    public static int generateGuess (int low, int high) {
        return (low + high) / 2;
    }

    // Main method
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int low = 1, high = 100;
        boolean isCorrect = false;
        System.out.println("Think of a number between 1 and 100");
        while (!isCorrect) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high / low / correct)");
            String feedback = input.nextLine();
            if (feedback.equals("correct")) {
                System.out.println("Computer guessed the number!");
                isCorrect = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}

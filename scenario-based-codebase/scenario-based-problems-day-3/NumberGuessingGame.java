import java.util.Scanner;
class NumberGuessingGame {
	public static void main (String[] args) {
		int randomNumber = (int)(Math.random() * 100) + 1;
		Scanner input = new Scanner(System.in);
		int tries = 5;
		while (tries != 0) {
			System.out.println("Choose a number between 1-100");
			int guess = input.nextInt();
			if (guess < 1 || guess > 100) {
				System.out.println("Invalid guess");
				tries--;
				System.out.println("Tries left: " + tries);
			}
			else if (guess == randomNumber) {
				System.out.println("CORRECT ANSWER");
				break;
			}
			else if (guess < randomNumber) {
				System.out.println("Too low");
				tries--;
				System.out.println("Tries left: " + tries);
			}
			else {
				System.out.println("Too high");
				tries--;
				System.out.println("Tries left: " + tries);
			}
		}
		System.out.println("The correct answer was: " + randomNumber );
		System.out.println("GAME OVER");
	}
}
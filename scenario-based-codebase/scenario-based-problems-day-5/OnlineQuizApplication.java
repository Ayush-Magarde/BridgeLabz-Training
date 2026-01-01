/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout. */

import java.util.Scanner;
class OnlineQuizApplication {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int score = 0;
		
		// Array of questions 
		String[] questions = {
			"Q1. Which organ pumps blood throughout the human body?\n",
			"Q2. What is the chemical symbol for Gold?\n",
			"Q3. Which is the largest ocean in the world?\n",
			"Q4. Which planet is known as the Red Planet?\n",
			"Q5. Which country is called the “Land of the Rising Sun?\n"
		};
		// Array of options
		String[] options = {
			"1. Heart \n2. Lungs \n3. Liver \n4. Brain\n",
			"1. Go \n2. Gd \n3. Au \n4. Ag\n",
			"1. Indian Ocean \n2. Atlantic Ocean \n3. Arctic Ocean \n4. Pacific Ocean\n",
			"1. Venus \n2. Mars \n3. Jupiter \n4. Saturn\n",
			"1. China \n2. Thailand \n3. Japan \n4. India\n"
		};
		// Array of correct options
		int[] correctAnswers = {1,3,4,2,3};
		
		System.out.println("\n----------5 MCQs----------\n");
		System.out.println("Choose one: |1|		|2|		|3|		|4|\n");
		
		// for loop to run 5 times
		for (int i = 0; i < 5; i++) {
			System.out.println(questions[i] + "\n");
			System.out.println(options[i] + "\n");
			System.out.print("\nChoose your answer: \n");
			int userChoice = input.nextInt();
			
			switch(userChoice) {
				case 1:
				case 2:
				case 3:
				case 4:
					if (userChoice == correctAnswers[i]) {
						System.out.println("\nCorrect Answer... + 1 point\n");
						score++;
					}
					else {
						System.out.println("\nIncorrect Answer... + 0 points\n");
					}
					break;
				default : {
					System.out.println("\nPlease enter a valid answer\n");
				}
			}
		}
		
		// Display the total score
		System.out.println("QUIZ COMPLETED!");
		System.out.println("Total score: " + score);
	}
}
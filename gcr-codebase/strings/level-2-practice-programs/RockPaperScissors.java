import java.util.Scanner;
class RockPaperScissors {

	// Method to generate computer's random choice
	public static String computerChoice () {
		String[] options = { "Rock", "Paper", "Scissors" };
		return options[(int)(Math.random() * 3)];
	}

	// Method to determine winner based on user and computer choice
	public static String winner (String user, String comp) {
		if (user.equals(comp)) return "Draw";
		if (user.equals("Rock") && comp.equals("Scissors")) return "User";
		if (user.equals("Paper") && comp.equals("Rock")) return "User";
		if (user.equals("Scissors") && comp.equals("Paper")) return "User";
		return "Computer";
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take user's choice as input
		System.out.print("Enter your choice: ");
		String user = input.next();

		// Generate computer choice and display result
		String comp = computerChoice();
		System.out.println("Computer: " + comp);
		System.out.println("Winner: " + winner(user, comp));
	}
}

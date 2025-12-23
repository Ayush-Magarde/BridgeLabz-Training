import java.util.Scanner;
class VotingEligibility {

	// Method to generate random ages for given number of students
	public static int[] generateAges (int n) {
		int[] ages = new int[n];
		for (int i = 0; i < n; i++) {
			ages[i] = (int)(Math.random() * 90);
		}
		return ages;
	}

	// Method to check voting eligibility based on age
	public static String[][] checkVoting (int[] ages) {
		String[][] data = new String[ages.length][2];
		for (int i = 0; i < ages.length; i++) {
			data[i][0] = String.valueOf(ages[i]);
			data[i][1] = (ages[i] >= 18) ? "true" : "false";
		}
		return data;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take number of students as input
		System.out.print("Enter number of students: ");
		int n = input.nextInt();

		// Call methods to generate ages and check voting eligibility
		String[][] table = checkVoting(generateAges(n));
		for (String[] row : table) {
			System.out.println(row[0] + "\t" + row[1]);
		}
	}
}

import java.util.Scanner;
class StudentVoteChecker {

	// Method to check whether a student can vote
	public static boolean canStudentVote(int age) {
		if (age < 0) return false;
		return age >= 18;
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ages = new int[10];

		// Take age input for 10 students and check voting eligibility
		for (int i = 0; i < ages.length; i++) {
			System.out.print("Enter age of student " + (i + 1) + ": ");
			ages[i] = input.nextInt();
			System.out.println(canStudentVote(ages[i]) ? "Can Vote" : "Cannot Vote");
		}
	}
}
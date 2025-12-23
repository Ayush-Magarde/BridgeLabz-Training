import java.util.Scanner;
class StudentGrade {

	// Method to generate random marks for students
	public static int[][] generateMarks (int n) {
		int[][] marks = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				marks[i][j] = (int)(Math.random() * 90) + 10;
			}
		}
		return marks;
	}

	// Method to assign grade based on percentage
	public static char grade (double percent) {
		if (percent >= 90) return 'A';
		if (percent >= 75) return 'B';
		if (percent >= 60) return 'C';
		return 'D';
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		// Take number of students as input
		System.out.print("Enter number of students: ");
		int n = input.nextInt();

		// Generate marks and calculate total, percentage and grade
		int[][] marks = generateMarks(n);
		for (int i = 0; i < n; i++) {
			int total = marks[i][0] + marks[i][1] + marks[i][2];
			double percent = Math.round((total / 3.0) * 100.0) / 100.0;
			System.out.println(total + "\t" + percent + "\t" + grade(percent));
		}
	}
}

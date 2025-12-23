import java.util.Scanner;
class StudentScores {

	// Method to generate random PCM scores
	public static int[][] generateScores(int n) {
		int[][] scores = new int[n][3];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 3; j++) {
				scores[i][j] = (int)(Math.random() * 90) + 10;
			}
		}
		return scores;
	}

	// Method to calculate total, average, percentage
	public static double[][] calculate(int[][] scores) {
		double[][] result = new double[scores.length][3];
		for(int i = 0; i < scores.length; i++) {
			int total = scores[i][0] + scores[i][1] + scores[i][2];
			double avg = total / 3.0;
			double percent = Math.round(avg * 100.0) / 100.0;
			result[i][0] = total;
			result[i][1] = avg;
			result[i][2] = percent;
		}
		return result;
	}
	
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Take input
		System.out.print("Enter number of students: ");
		int n = input.nextInt();
		double[][] res = calculate(generateScores(n));
		// Display result
		for(double[] row : res) {
			System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
		}
	}
}

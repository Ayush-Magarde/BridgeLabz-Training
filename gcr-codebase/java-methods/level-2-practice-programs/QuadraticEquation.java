import java.util.Scanner;
class QuadraticEquation {

	// Method to find roots of the quadratic equation ax² + bx + c = 0
	public static double[] findRoots(double a, double b, double c) {
		double delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) return new double[0];
		if (delta == 0) return new double[] { -b / (2 * a) };

		double root1 = (-b + Math.sqrt(delta)) / (2 * a);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a);
		return new double[] { root1, root2 };
	}

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Take input values for a, b and c
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// Call method to find roots and display them
		double[] roots = findRoots(a, b, c);
		for (int i = 0; i < roots.length; i++) {
			System.out.println("Root: " + roots[i]);
		}
	}
}

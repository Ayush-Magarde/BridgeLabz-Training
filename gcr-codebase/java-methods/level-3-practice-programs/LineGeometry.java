import java.util.Scanner;
class LineGeometry {

	// Method to calculate Euclidean distance
	public static double distance(int x1,int y1,int x2,int y2) {
		return Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
	}

	// Method to calculate slope and intercept
	public static double[] lineEquation(int x1,int y1,int x2,int y2) {
		double m = (double)(y2 - y1) / (x2 - x1);
		double b = y1 - m * x1;
		return new double[]{m,b};
	}
	
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Take user input
		System.out.print("Enter x1 y1 x2 y2: ");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		// Display results
		System.out.println("Distance: " + distance(x1,y1,x2,y2));
		double[] eq = lineEquation(x1,y1,x2,y2);
		System.out.println("y = " + eq[0] + "x + " + eq[1]);
	}
}

import java.util.Scanner;
class  ChoclatesPerStudent {
	// Create a method to find out how many choclates each student will get
	public static int[] numberOfChoclatesPerStudent (int numberOfChildren, int numberOfChoclates) {
		int choclatesPerStudent = numberOfChoclates / numberOfChildren;
		int remainingChoclates = numberOfChoclates % numberOfChildren;
		return new int[] {choclatesPerStudent, remainingChoclates};
	}
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the total number of students: ");
		int students = input.nextInt();
		System.out.print("Enter the total number of choclates: ");
		int choclates = input.nextInt();
		
		// Invoke the method
		int [] choclatesPerStudent = numberOfChoclatesPerStudent(students, choclates);
		
		// Display the results
		System.out.println("Each student will get " + choclatesPerStudent[0] + " choclates");
		System.out.println ("Remaining choclates: " + choclatesPerStudent[1]);		
	}
}
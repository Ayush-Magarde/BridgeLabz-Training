//Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. 

import java.util.Scanner;
class StudentGrades {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] math = new int[students];
        double[] percentage = new double[students];
        String[] grade = new String[students];
		// Run a for loop to take marks in input and assign grades
        for (int i = 0; i < students; i++){
			System.out.println ("Enter for the " + (i+1) + " student");
			System.out.print("Physics marks: ");
            physics[i] = input.nextInt();
			System.out.print("Chemistry marks: ");
            chemistry[i] = input.nextInt();
			System.out.print("Math marks: ");
            math[i] = input.nextInt();
            percentage[i] = (physics[i] + chemistry[i] + math[i])/3.0;
            if(percentage[i] >= 75) grade[i] = "A";
            else if(percentage[i] >= 60) grade[i] = "B";
            else if(percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

		
		//Display the results
        for(int i = 0; i < students; i++){
			System.out.println ("Student" + (i+1));
            System.out.println("Percentage: " + percentage[i] + ", Grade: " + grade[i]);
        }
	}
}
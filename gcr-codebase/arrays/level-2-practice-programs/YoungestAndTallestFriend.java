/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony 
based on their ages and the tallest among the friends based on their heights*/

import java.util.Scanner;
class YoungestAndTallestFriend {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
		// Create 2 arrays for age and height respectively
        int[] age = new int[3];
        double[] height = new double[3];
        for(int i = 0; i < 3; i++){
			// Take age and height as input
			System.out.print("Enter age: ");
            age[i] = input.nextInt();
			System.out.print("Enter height: ");
            height[i] = input.nextDouble();
        }
		// Take 2 variables to compare with array elements
        int youngest = age[0];
        double tallest = height[0];
        for(int i = 1; i < 3; i++){
			// Compare the ages, stores the lesser value
            if(age[i] < youngest){
                youngest = age[i];
            }
			// Compare the heights and store the larger value
            if(height[i] > tallest){
                tallest = height[i];
            }
        }

		//Display the result
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Tallest Height: " + tallest);
    }
}
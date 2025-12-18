/*Create a program to find the youngest friend among Amar, Akbar, and Anthony
   based on age, and the tallest friend based on height */

import java.util.Scanner;
class YoungestTallest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // Take Ages in input
        System.out.println("Enter the age of Amar");
        int ageAmar = input.nextInt();
		System.out.println("Enter the age of Akbar");
        int ageAkbar = input.nextInt();
		System.out.println("Enter the age of Anthony");
        int ageAnthony = input.nextInt();
        // Take Heights in input
        System.out.println("Enter the height of Amar");
        int heightAmar = input.nextInt();
		System.out.println("Enter the height of Akbar");
        int heightAkbar = input.nextInt();
		System.out.println("Enter the height of Anthony");
        int heightAnthony = input.nextInt();


        // Implement the logic to find the youngest friend
        if(ageAmar <= ageAkbar && ageAmar <= ageAnthony){
            System.out.println("Amar is the youngest");
        }else if(ageAkbar <= ageAmar && ageAkbar <= ageAnthony){
            System.out.println("Akbar is the youngest");
        }else{
            System.out.println("Anthony is the youngest");
        }
        // Implement the logic to find the tallest friend
        if(heightAmar >= heightAkbar && heightAmar >= heightAnthony){
            System.out.println("Amar is the tallest");
        }else if(heightAkbar >= heightAmar && heightAkbar >= heightAnthony){
            System.out.println("Akbar is the tallest");
        }else{
            System.out.println("Anthony is the tallest");
        }
    }
}
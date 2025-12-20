/*Write a program FizzBuzz, take a number as user input and if it is a positive integer 
loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead 
of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...*/


import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
		// Take a number as input
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if(number <= 0){
            System.out.println("Invalid number");
            return;
        }
        String[] result = new String[number + 1];
		// Fill the array using the given conditions
        for(int i = 0; i <= number; i++){
            if(i %3 ==0 && i % 5 == 0){
                result[i] = "FizzBuzz";
            } else if(i % 3 == 0) {
                result[i] = "Fizz";
            }else if(i % 5 == 0) {
                result[i] = "Buzz";
            }else{
                result[i] = String.valueOf(i);
            }
        }

        // Display the results
        for(int i = 0; i <= number; i++){
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
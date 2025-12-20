/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 
2D Array into a single dimension array*/

import java.util.Scanner;
public class TwoDToOneDArray {
    public static void main(String[] args){
		
        Scanner input = new Scanner(System.in);
        // Take rows and columns as input
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();
        // Create a 2D array
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        //Create a 1D array
        int[] array = new int[rows * columns];
        int index = 0;
        // Copy the elements from the 2D array to the 1D array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[index] = matrix[i][j];
                index++;
            }
        }

        //Display the 1D array
        System.out.println("1D Array elements: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
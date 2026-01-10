package com.sorting.bubblesort.studentmarks;

public class Main {

    public static void main(String[] args) {

        int[] marksArray = {78, 45, 89, 66, 92, 54};

        StudentMarks studentMarks = new StudentMarks(marksArray);

        System.out.println("Before Sorting:");
        studentMarks.displayMarks();

        BubbleSort.sort(studentMarks.getMarks());

        System.out.println("After Sorting:");
        studentMarks.displayMarks();
    }
}

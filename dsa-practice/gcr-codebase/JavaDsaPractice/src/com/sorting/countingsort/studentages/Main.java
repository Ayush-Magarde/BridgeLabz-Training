package com.sorting.countingsort.studentages;

public class Main {

    public static void main(String[] args) {

        int[] ageArray = {14, 18, 12, 16, 15, 10, 13};

        StudentAges studentAges = new StudentAges(ageArray);

        System.out.println("Before Sorting:");
        studentAges.displayAges();

        CountingSort.sort(studentAges.getAges(), 10, 18);

        System.out.println("After Sorting:");
        studentAges.displayAges();
    }
}

package com.sorting.heapsort.jobsalary;

public class Main {

    public static void main(String[] args) {

        int[] salaryArray = {45000, 60000, 35000, 80000, 50000};

        JobSalaries jobSalaries = new JobSalaries(salaryArray);

        System.out.println("Before Sorting:");
        jobSalaries.displaySalaries();

        HeapSort.sort(jobSalaries.getSalaries());

        System.out.println("After Sorting:");
        jobSalaries.displaySalaries();
    }
}

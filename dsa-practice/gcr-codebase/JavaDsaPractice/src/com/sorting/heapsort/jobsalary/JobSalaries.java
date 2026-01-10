package com.sorting.heapsort.jobsalary;

public class JobSalaries {

    private int[] salaries;

    public JobSalaries(int[] salaries) {
        this.salaries = salaries;
    }

    public int[] getSalaries() {
        return salaries;
    }

    public void displaySalaries() {
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }
}

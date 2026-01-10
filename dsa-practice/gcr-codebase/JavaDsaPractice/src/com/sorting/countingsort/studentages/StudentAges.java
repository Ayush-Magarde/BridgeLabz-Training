package com.sorting.countingsort.studentages;

public class StudentAges {

    private int[] ages;

    public StudentAges(int[] ages) {
        this.ages = ages;
    }

    public int[] getAges() {
        return ages;
    }

    public void displayAges() {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
}

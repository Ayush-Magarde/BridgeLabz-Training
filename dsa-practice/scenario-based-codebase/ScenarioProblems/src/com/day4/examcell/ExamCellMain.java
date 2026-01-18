package com.day4.examcell;

public class ExamCellMain {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Ayush", 99),
                new Student("Neha", 92),
                new Student("Ravi", 75),
                new Student("Aarya", 95),
                new Student("Karan", 85)
        };

        ExamCell examCell = new ExamCell();

        System.out.println("Before Sorting:");
        examCell.displayStudents(students);

        examCell.mergeSort(students, 0, students.length - 1);

        System.out.println("\nState-Level Rank List:");
        examCell.displayStudents(students);
    }
}

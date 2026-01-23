package com.day7.eduresults;

public class EduResultsMain {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Ayush", 88),
                new Student("Neha", 92),
                new Student("Ravi", 75),
                new Student("Aarya", 95)
        };

        EduResults er = new EduResults();
        er.mergeSort(students, 0, students.length - 1);

        System.out.println("State-wise Rank List:");
        for (Student s : students)
            System.out.println(s);
    }
}

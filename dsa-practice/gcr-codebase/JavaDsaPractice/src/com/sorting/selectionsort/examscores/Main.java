package com.sorting.selectionsort.examscores;

public class Main {

    public static void main(String[] args) {

        int[] scoreArray = {78, 92, 65, 88, 74};

        ExamScores examScores = new ExamScores(scoreArray);

        System.out.println("Before Sorting:");
        examScores.displayScores();

        SelectionSort.sort(examScores.getScores());

        System.out.println("After Sorting:");
        examScores.displayScores();
    }
}

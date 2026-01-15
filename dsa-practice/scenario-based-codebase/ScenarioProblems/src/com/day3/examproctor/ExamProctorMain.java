package com.day3.examproctor;

public class ExamProctorMain {

    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.answerQuestion(1, "A");

        exam.visitQuestion(2);
        exam.answerQuestion(2, "B");

        exam.visitQuestion(3);
        exam.answerQuestion(3, "A");

        System.out.println("Final Score: " + exam.evaluate());
    }
}

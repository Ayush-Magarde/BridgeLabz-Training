package com.day4.EduMentor;

public class EduMentorMain {

    public static void main(String[] args) {

        // Users
        Learner learner1 = new Learner("Ayush", "ayush@email.com", 101, true);
        Learner learner2 = new Learner("Aarya", "aarya@email.com", 102, false);

        Instructor instructor = new Instructor("Dr. Sharma", "sharma@email.com", 201);

        instructor.createCourse("Java OOPS Mastery");

        // Quiz
        String[] questions = {
                "What is OOPS?",
                "What is inheritance?",
                "What is polymorphism?"
        };

        int[] correctAnswers = {1, 2, 3};

        Quiz quiz = new Quiz(questions, correctAnswers, 2);

        int[] userAnswers = {1, 2, 1};
        quiz.evaluateQuiz(userAnswers);
        quiz.displayResult();

        // Polymorphism in certificate generation
        learner1.generateCertificate();
        learner2.generateCertificate();
    }
}

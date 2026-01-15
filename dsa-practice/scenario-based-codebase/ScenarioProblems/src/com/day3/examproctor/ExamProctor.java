package com.day3.examproctor;

import java.util.HashMap;
import java.util.Stack;

public class ExamProctor {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();

    public void visitQuestion(int qId) {
        navigationStack.push(qId);
    }

    public void answerQuestion(int qId, String answer) {
        answers.put(qId, answer);
    }

    public int evaluate() {
        int score = 0;

        for (int qId : answers.keySet()) {
            if (answers.get(qId).equals("A")) {   // sample correct logic
                score++;
            }
        }
        return score;
    }
}

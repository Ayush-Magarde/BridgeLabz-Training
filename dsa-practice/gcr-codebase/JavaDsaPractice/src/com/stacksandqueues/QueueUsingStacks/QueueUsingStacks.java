package com.stacksandqueues.QueueUsingStacks;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> stack1; // for enqueue
    private Stack<Integer> stack2; // for dequeue

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int data) {
        stack1.push(data);
        System.out.println("Enqueued: " + data);
    }

    // Dequeue operation
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        int removed = stack2.pop();
        System.out.println("Dequeued: " + removed);
    }

    // Peek front element
    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println("Front Element: " + stack2.peek());
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue Elements: ");

        // Elements in stack2 (front part)
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        // Elements in stack1 (rear part)
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }
}

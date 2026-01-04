package com.stacksandqueues.SortStackUsingRecursion;

import java.util.Stack;

public class StackSorterMain {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        stack.push(40);

        System.out.println("Original Stack: " + stack);

        StackSorter.sortStack(stack);

        System.out.println("Sorted Stack (Ascending): " + stack);
    }
}

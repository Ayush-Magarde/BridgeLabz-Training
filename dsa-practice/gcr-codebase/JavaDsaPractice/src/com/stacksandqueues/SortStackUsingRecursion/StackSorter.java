package com.stacksandqueues.SortStackUsingRecursion;

import java.util.Stack;

public class StackSorter {

    // Public method to sort stack
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty())
            return;

        int top = stack.pop();
        sortStack(stack);
        insertInSortedOrder(stack, top);
    }

    // Helper method to insert element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(top);
    }
}


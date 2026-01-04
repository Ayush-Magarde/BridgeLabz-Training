package com.stacksandqueues.QueueUsingStacks;

public class QueueUsingStacksMain {

    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.dequeue();
        queue.peek();

        queue.enqueue(40);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // underflow check
    }
}

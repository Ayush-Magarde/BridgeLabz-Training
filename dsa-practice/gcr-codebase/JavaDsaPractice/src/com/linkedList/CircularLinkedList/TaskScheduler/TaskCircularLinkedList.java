package com.linkedList.CircularLinkedList.TaskScheduler;

public class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode tail;

    // Add at Beginning
    public void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Add at Specific Position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        if (temp.next == head) {
            addAtEnd(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Task ID
    public void deleteById(int id) {
        if (head == null) {
            System.out.println("No tasks available!");
            return;
        }

        // Single node case
        if (head == tail && head.taskId == id) {
            head = tail = null;
            System.out.println("Task Deleted!");
            return;
        }

        // Deleting head
        if (head.taskId == id) {
            tail.next = head.next;
            head = head.next;
            System.out.println("Task Deleted!");
            return;
        }

        TaskNode temp = head;
        while (temp.next != head && temp.next.taskId != id)
            temp = temp.next;

        if (temp.next == head) {
            System.out.println("Task Not Found!");
            return;
        }

        if (temp.next == tail)
            tail = temp;

        temp.next = temp.next.next;
        System.out.println("Task Deleted!");
    }

    // View Current Task and Move to Next
    public void viewAndMoveNext() {
        if (head == null) {
            System.out.println("No tasks available!");
            return;
        }

        System.out.println(
                "Current Task -> " +
                head.taskId + " | " +
                head.taskName + " | Priority: " +
                head.priority + " | Due: " +
                head.dueDate
        );

        head = head.next;
        tail = tail.next;
    }

    // Search by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available!");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println(
                        temp.taskId + " | " +
                        temp.taskName + " | Priority: " +
                        temp.priority + " | Due: " +
                        temp.dueDate
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks found with given priority!");
    }

    // Display All Tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks available!");
            return;
        }

        TaskNode temp = head;
        System.out.println("\nTaskID | Name | Priority | Due Date");
        System.out.println("------------------------------------");

        do {
            System.out.println(
                    temp.taskId + " | " +
                    temp.taskName + " | " +
                    temp.priority + " | " +
                    temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }
}

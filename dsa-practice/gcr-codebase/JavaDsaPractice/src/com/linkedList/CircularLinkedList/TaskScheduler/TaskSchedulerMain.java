package com.linkedList.CircularLinkedList.TaskScheduler;

public class TaskSchedulerMain {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtEnd(1, "Submit Assignment", 1, "10-04-2026");
        scheduler.addAtEnd(2, "Prepare Presentation", 2, "12-04-2026");
        scheduler.addAtBeginning(3, "Revise DSA", 1, "08-04-2026");
        scheduler.addAtPosition(2, 4, "Team Meeting", 3, "09-04-2026");

        scheduler.displayAll();

        scheduler.viewAndMoveNext();
        scheduler.viewAndMoveNext();

        scheduler.searchByPriority(1);
        scheduler.deleteById(2);

        scheduler.displayAll();
    }
}


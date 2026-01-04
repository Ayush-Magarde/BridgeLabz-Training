package com.linkedList.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinScheduler {

    private ProcessNode head;
    private ProcessNode tail;

    // Add process at end
    public void addProcess(int id, int burst, int priority) {
        ProcessNode newNode = new ProcessNode(id, burst, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Remove process by ID
    private void removeProcess(ProcessNode prev, ProcessNode current) {
        if (current == head && current == tail) {
            head = tail = null;
        } else {
            prev.next = current.next;
            if (current == head)
                head = current.next;
            if (current == tail)
                tail = prev;
        }
    }

    // Display processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue!");
            return;
        }

        ProcessNode temp = head;
        System.out.println("\nPID | Burst | Remaining | Priority");
        System.out.println("-----------------------------------");

        do {
            System.out.println(
                    temp.processId + " | " +
                    temp.burstTime + " | " +
                    temp.remainingTime + " | " +
                    temp.priority
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Simulate Round Robin Scheduling
    public void execute(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule!");
            return;
        }

        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int completedProcesses = 0;

        ProcessNode current = head;
        ProcessNode prev = tail;

        System.out.println("\n--- Round Robin Execution ---");

        while (head != null) {

            if (current.remainingTime > 0) {
                int execTime = Math.min(current.remainingTime, timeQuantum);
                current.remainingTime -= execTime;
                currentTime += execTime;

                System.out.println(
                        "Process " + current.processId +
                        " executed for " + execTime +
                        " units. Remaining: " + current.remainingTime
                );

                if (current.remainingTime == 0) {
                    completedProcesses++;
                    totalTurnAroundTime += currentTime;
                    totalWaitingTime += currentTime - current.burstTime;

                    removeProcess(prev, current);
                    current = prev.next;

                    displayProcesses();
                    continue;
                }
            }

            prev = current;
            current = current.next;
        }

        System.out.println("\n--- Scheduling Complete ---");
        System.out.println("Average Waiting Time: " +
                (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnAroundTime / completedProcesses);
    }
}

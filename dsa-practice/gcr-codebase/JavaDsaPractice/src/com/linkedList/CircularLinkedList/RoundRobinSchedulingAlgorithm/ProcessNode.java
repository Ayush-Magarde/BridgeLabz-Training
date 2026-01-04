package com.linkedList.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class ProcessNode {

    int processId;
    int burstTime;
    int priority;

    int remainingTime;
    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}

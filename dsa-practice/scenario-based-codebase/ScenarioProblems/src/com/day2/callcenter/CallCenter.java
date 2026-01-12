package com.day2.callcenter;

import java.util.*;

public class CallCenter {

    private Queue<String> normalQueue = new LinkedList<>();
    private PriorityQueue<String> vipQueue = new PriorityQueue<>();
    private HashMap<String, Integer> callCount = new HashMap<>();

    public void addCall(String customer, boolean isVIP) {
        if (isVIP) {
            vipQueue.add(customer);
        } else {
            normalQueue.add(customer);
        }

        callCount.put(customer, callCount.getOrDefault(customer, 0) + 1);
    }

    public void serveCall() {
        if (!vipQueue.isEmpty()) {
            System.out.println("Serving VIP: " + vipQueue.poll());
        } else if (!normalQueue.isEmpty()) {
            System.out.println("Serving Customer: " + normalQueue.poll());
        } else {
            System.out.println("No calls in queue.");
        }
    }

    public void displayCallCount() {
        System.out.println(callCount);
    }
}

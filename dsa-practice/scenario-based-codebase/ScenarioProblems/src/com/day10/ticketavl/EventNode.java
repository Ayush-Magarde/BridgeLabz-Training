package com.day10.ticketavl;

public class EventNode {
    int time;
    String eventName;
    int height;
    EventNode left, right;

    public EventNode(int time, String eventName) {
        this.time = time;
        this.eventName = eventName;
        this.height = 1;
    }
}

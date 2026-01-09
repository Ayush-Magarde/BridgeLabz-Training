package com.day4.EventEase;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;        // cannot be modified once assigned
    private static int counter = 1000;

    // Encapsulated pricing
    private double venueCost;
    private double serviceCost;
    private double discount;

    // Constructor without packages
    public Event(String eventName, String location, String date, int attendees,
                 double venueCost) {
        this(eventName, location, date, attendees, venueCost, 0, 0);
    }

    // Constructor with catering / decoration packages
    public Event(String eventName, String location, String date, int attendees,
                 double venueCost, double serviceCost, double discount) {
        this.eventId = ++counter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    public void displayEvent() {
        System.out.println(
                "EventID: " + eventId +
                " | " + eventName +
                " | Location: " + location +
                " | Date: " + date +
                " | Attendees: " + attendees +
                " | Cost: INR" + calculateTotalCost()
        );
    }
}

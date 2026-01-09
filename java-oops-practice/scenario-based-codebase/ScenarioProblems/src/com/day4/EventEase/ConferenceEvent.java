package com.day4.EventEase;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date,
                           int attendees, double venueCost, double serviceCost) {
        super(name, location, date, attendees, venueCost, serviceCost, 1000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}

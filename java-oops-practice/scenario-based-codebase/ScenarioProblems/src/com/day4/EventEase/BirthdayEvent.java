package com.day4.EventEase;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date,
                         int attendees, double venueCost, double serviceCost) {
        super(name, location, date, attendees, venueCost, serviceCost, 500);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with decorations and cake.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}


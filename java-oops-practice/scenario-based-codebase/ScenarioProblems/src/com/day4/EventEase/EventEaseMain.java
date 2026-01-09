package com.day4.EventEase;

public class EventEaseMain {

    public static void main(String[] args) {

        User organizer = new User("Ayush", "ayush@email.com");
        organizer.displayUser();

        Event birthday = new BirthdayEvent(
                "Ayush's Birthday", "Indore", "03-11-2026",
                50, 20000, 8000
        );

        Event conference = new ConferenceEvent(
                "Tech Conference", "Bangalore", "01-10-2026",
                300, 150000, 50000
        );

        birthday.schedule();
        birthday.displayEvent();
        birthday.reschedule("10-11-2026");

        System.out.println();

        conference.schedule();
        conference.displayEvent();
        conference.cancel();
    }
}


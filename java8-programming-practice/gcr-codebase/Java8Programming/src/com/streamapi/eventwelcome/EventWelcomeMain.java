package com.streamapi.eventwelcome;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeMain {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Ayush", "Riya", "Rahul", "Sneha");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}

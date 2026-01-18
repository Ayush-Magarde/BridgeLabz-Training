package com.day4.eventmanager;

public class EventManagerMain {

    public static void main(String[] args) {

        Ticket[] tickets = {
                new Ticket("Concert", 2500),
                new Ticket("Conference", 1500),
                new Ticket("Stand-up Show", 800),
                new Ticket("Workshop", 1200),
                new Ticket("Festival", 3000)
        };

        EventManager manager = new EventManager();

        System.out.println("Before Sorting:");
        manager.displayTickets(tickets);

        manager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting by Price:");
        manager.displayTickets(tickets);

        System.out.println("\nTop 2 Cheapest Tickets:");
        System.out.println(tickets[0]);
        System.out.println(tickets[1]);

        System.out.println("\nMost Expensive Ticket:");
        System.out.println(tickets[tickets.length - 1]);
    }
}

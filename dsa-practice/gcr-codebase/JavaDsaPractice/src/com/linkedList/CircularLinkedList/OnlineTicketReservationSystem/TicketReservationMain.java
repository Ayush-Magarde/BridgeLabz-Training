package com.linkedList.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservationMain {

    public static void main(String[] args) {

        TicketCircularLinkedList system = new TicketCircularLinkedList();

        system.addTicket(1, "Ayush", "Inception", "A1", "10:30 AM");
        system.addTicket(2, "Aarya", "Inception", "A2", "10:32 AM");
        system.addTicket(3, "Ravi", "Interstellar", "B5", "11:00 AM");

        system.displayTickets();

        system.searchTicket("Inception");
        system.countTickets();

        system.removeTicket(2);
        system.displayTickets();

        system.countTickets();
    }
}

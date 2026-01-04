package com.linkedList.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketCircularLinkedList {

    private TicketNode head;
    private TicketNode tail;

    // Add Ticket at End
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Remove Ticket by ID
    public void removeTicket(int id) {
        if (head == null) {
            System.out.println("No tickets booked!");
            return;
        }

        // Single node case
        if (head == tail && head.ticketId == id) {
            head = tail = null;
            System.out.println("Ticket Cancelled!");
            return;
        }

        // Removing head
        if (head.ticketId == id) {
            tail.next = head.next;
            head = head.next;
            System.out.println("Ticket Cancelled!");
            return;
        }

        TicketNode temp = head;
        while (temp.next != head && temp.next.ticketId != id)
            temp = temp.next;

        if (temp.next == head) {
            System.out.println("Ticket Not Found!");
            return;
        }

        if (temp.next == tail)
            tail = temp;

        temp.next = temp.next.next;
        System.out.println("Ticket Cancelled!");
    }

    // Search Ticket by Customer or Movie
    public void searchTicket(String key) {
        if (head == null) {
            System.out.println("No tickets booked!");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {

                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching tickets found!");
    }

    // Display All Tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked!");
            return;
        }

        TicketNode temp = head;
        System.out.println("\nTicketID | Customer | Movie | Seat | Time");
        System.out.println("--------------------------------------------");

        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Count Tickets
    public void countTickets() {
        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets: " + count);
    }

    // Helper Method
    private void displayTicket(TicketNode node) {
        System.out.println(
                node.ticketId + " | " +
                node.customerName + " | " +
                node.movieName + " | " +
                node.seatNumber + " | " +
                node.bookingTime
        );
    }
}

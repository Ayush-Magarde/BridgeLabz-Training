package com.day4.eventmanager;

public class EventManager {

    public void quickSort(Ticket[] tickets, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(tickets, low, high);

            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    private int partition(Ticket[] tickets, int low, int high) {

        double pivot = tickets[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].price <= pivot) {
                i++;

                // swap tickets[i] and tickets[j]
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        // place pivot in correct position
        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }

    public void displayTickets(Ticket[] tickets) {
        for (Ticket t : tickets)
            System.out.println(t);
    }
}

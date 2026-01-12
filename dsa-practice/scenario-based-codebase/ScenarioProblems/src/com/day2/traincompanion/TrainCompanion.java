package com.day2.traincompanion;

public class TrainCompanion {

    private Compartment head;

    public void addCompartment(String name) {
        Compartment c = new Compartment(name);

        if (head == null) {
            head = c;
            return;
        }

        Compartment temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = c;
        c.prev = temp;
    }

    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equals(name)) {
                if (temp.prev != null)
                    temp.prev.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = temp.prev;
                if (temp == head)
                    head = temp.next;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        Compartment temp = head;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayBackward() {
        Compartment temp = head;
        while (temp.next != null)
            temp = temp.next;

        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }
}

package com.linkedList.DoublyLinkedList.MovieManagementSystem;

public class MovieDoublyLinkedList {

    private MovieNode head;
    private MovieNode tail;

    // Insert at Beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Insert at End
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at Specific Position (1-based)
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Delete by Movie Title
    public void deleteByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        MovieNode temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Movie Not Found!");
            return;
        }

        if (temp == head)
            head = head.next;

        if (temp == tail)
            tail = tail.prev;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;

        System.out.println("Movie Deleted!");
    }

    // Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found for this director!");
    }

    // Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with given rating!");
    }

    // Update Rating by Title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating Updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie Not Found!");
    }

    // Display Forward
    public void displayForward() {
        if (head == null) {
            System.out.println("No Movies Available!");
            return;
        }

        MovieNode temp = head;
        System.out.println("\nMovies (Forward):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display Reverse
    public void displayReverse() {
        if (tail == null) {
            System.out.println("No Movies Available!");
            return;
        }

        MovieNode temp = tail;
        System.out.println("\nMovies (Reverse):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // Helper Method
    private void displayMovie(MovieNode node) {
        System.out.println(
                node.title + " | " +
                node.director + " | " +
                node.year + " | Rating: " +
                node.rating
        );
    }
}

package com.linkedList.DoublyLinkedList.MovieManagementSystem;

public class MovieManagementMain {

    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtEnd("Parasite", "Bong Joon-ho", 2019, 8.5);
        movies.addAtPosition(2, "Dunkirk", "Christopher Nolan", 2017, 7.9);

        movies.displayForward();
        movies.displayReverse();

        movies.searchByDirector("Christopher Nolan");
        movies.searchByRating(8.5);

        movies.updateRating("Dunkirk", 8.2);
        movies.deleteByTitle("Parasite");

        movies.displayForward();
    }
}

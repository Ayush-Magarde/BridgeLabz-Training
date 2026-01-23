package com.day9.universitybst;

public class UniversityMain {

    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

        bst.insert(101, "Ayush");
        bst.insert(105, "Neha");
        bst.insert(103, "Ravi");

        System.out.print("Sorted Roll Numbers: ");
        bst.inorder();

        bst.search(103);
    }
}

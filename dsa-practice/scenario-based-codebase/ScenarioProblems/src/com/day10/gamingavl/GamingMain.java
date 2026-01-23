package com.day10.gamingavl;

public class GamingMain {

    public static void main(String[] args) {

        PlayerAVL avl = new PlayerAVL();

        avl.root = avl.insert(avl.root, 3500, "Ayush");
        avl.root = avl.insert(avl.root, 3100, "Neha");
        avl.root = avl.insert(avl.root, 1800, "Ravi");
        avl.root = avl.insert(avl.root, 2900, "Aarya");

        System.out.println("Leaderboard (Top Scores):");
        avl.inorder(avl.root);
    }
}

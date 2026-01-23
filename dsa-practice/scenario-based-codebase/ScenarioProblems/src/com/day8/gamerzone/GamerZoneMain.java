package com.day8.gamerzone;

public class GamerZoneMain {

    public static void main(String[] args) {

        Player[] players = {
                new Player("Ayush", 2400),
                new Player("Neha", 3100),
                new Player("Ravi", 1800),
                new Player("Aarya", 2900)
        };

        GamerZone gz = new GamerZone();
        gz.quickSort(players, 0, players.length - 1);

        System.out.println("Leaderboard:");
        for (Player p : players)
            System.out.println(p);
    }
}

package com.day9.birdsanctuary;

public class BirdSanctuaryMain {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();

        // Add birds
        sanctuary.addBird(new Eagle("E1", "Sky"));
        sanctuary.addBird(new Duck("D1", "Daffy"));
        sanctuary.addBird(new Penguin("P1", "Pingu"));
        sanctuary.addBird(new Seagull("S1", "Sea"));
        sanctuary.addBird(new Kiwi("K1", "Kiko"));
        sanctuary.addBird(new Ostrich("O1", "Ozzy"));

        System.out.println("\n--- Display All Birds ---");
        sanctuary.displayAllBirds();

        System.out.println("\n--- Flying Birds ---");
        sanctuary.displayFlyingBirds();

        System.out.println("\n--- Swimming Birds ---");
        sanctuary.displaySwimmingBirds();

        System.out.println("\n--- Birds that can Fly & Swim ---");
        sanctuary.displayBothFlySwim();

        System.out.println("\n--- Sanctuary Report ---");
        sanctuary.sanctuaryReport();

        System.out.println("\n--- Removing Bird with ID K1 ---");
        sanctuary.removeBirdById("K1");

        System.out.println("\n--- Updated Bird List ---");
        sanctuary.displayAllBirds();
    }
}

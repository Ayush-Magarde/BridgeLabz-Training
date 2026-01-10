package com.day7.Artify;

public class ArtifyMain {

	public static void main(String[] main) {	

		User user = new User ("Ayush", 75000);
		
		Artwork art1 = new DigitalArt("Stars", "Mary", 30000, "Exclusive", user);
		Artwork art2 = new PrintArt("Moon", "James", 90000, "Non-Exclusive", user); 
		
		art1.displayArtInfo();
		art1.purchase();
		art1.license();
		
		System.out.println();
		
		art2.displayArtInfo();
		art2.purchase();		// insufficient wallet balance
		
	}
}

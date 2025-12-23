import java.util.Scanner;
class DeckOfCards {

	// Method to initialize deck using suits and ranks
	public static String[] initializeDeck (String[] suits, String[] ranks) {
		String[] deck = new String[suits.length * ranks.length];
		int index = 0;
		for (String s : suits) {
			for (String r : ranks) {
				deck[index++] = r + " of " + s;
			}
		}
		return deck;
	}

	// Method to shuffle the deck using random swapping
	public static void shuffle (String[] deck) {
		for (int i = 0; i < deck.length; i++) {
			int r = i + (int)(Math.random() * (deck.length - i));
			String temp = deck[i];
			deck[i] = deck[r];
			deck[r] = temp;
		}
	}

	// Method to distribute cards among players
	public static String[][] distribute (String[] deck, int players, int cards) {
		if (players * cards > deck.length) return null;
		String[][] result = new String[players][cards];
		int index = 0;
		for (int i = 0; i < players; i++) {
			for (int j = 0; j < cards; j++) {
				result[i][j] = deck[index++];
			}
		}
		return result;
	}

	// Main method
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		// Initialize suits and ranks
		String[] suits = { "Hearts","Diamonds","Clubs","Spades" };
		String[] ranks = { "2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace" };

		// Create and shuffle deck
		String[] deck = initializeDeck(suits, ranks);
		shuffle(deck);

		// Take number of players and cards as input
		System.out.print("Enter players and cards: ");
		int p = input.nextInt();
		int c = input.nextInt();

		// Distribute cards and display result
		String[][] players = distribute(deck, p, c);
		for (int i = 0; i < players.length; i++) {
			System.out.println("Player " + (i + 1));
			for (String card : players[i]) System.out.println(card);
		}
	}
}

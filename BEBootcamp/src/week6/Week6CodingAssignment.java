package week6;

import java.util.*;

public class Week6CodingAssignment {

	public static void main(String[] args) {
		
		// Start game

		// <DECK SETUP>
		// Create deck of cards
		List<Integer> originalDeck = new ArrayList<>();
		for(int i = 1; i <= 52; i++) {
			originalDeck.add(i);
		}

//		for(int card : originalDeck) {
//			System.out.println(card + ": " + getCardNum(card) + getSuit(card));
//		}
		
		
		// Shuffle deck of cards
		Collections.shuffle(originalDeck);
		System.out.println("Original Deck: " + originalDeck);
		
		// Deal deck to two players
		List<Integer> p1Deck = new ArrayList<>();
		List<Integer> p2Deck = new ArrayList<>();

		while (originalDeck.size() > 0) {
			p1Deck.add(originalDeck.remove(0));
			p2Deck.add(originalDeck.remove(0));
		}
		
		System.out.println("P1 Deck: " + p1Deck);
		System.out.println("P2 Deck: " + p2Deck);
		
		// <WIN CONDITION>
		// Check deck size (0 = loss)
		if(p1Deck.size() == 0) {
			System.out.println("Player 2 wins!");
			// break program
		}
		
		if(p2Deck.size() == 0) {
			System.out.println("Player 1 wins!");
			// break program
		}

		// <BATTLE>
		// Reveal top card (index 0) of each deck
		System.out.println("P1 Card: " + p1Deck.get(0));
		System.out.println("P2 Card: " + p2Deck.get(0));
		
		// Check for WAR (equal values)
		if(p1Deck.get(0)%13 == p2Deck.get(0)%13) {
			System.out.println("WAR!");
		}
		
		// Check for Ace value (Ace = win)
		if(p1Deck.get(0) %13 == 1) {
			System.out.println("P1: Ace!");
		}
		
		if(p2Deck.get(0) %13 == 1) {
			System.out.println("P2: Ace!");
		}



		// <RESULT>
		// Output results
		System.out.println("P1: " + getCardNum(p1Deck.get(0)%13) + getSuit(p1Deck.get(0)) + " (Value: " + getCardValue(p1Deck.get(0)%13) + ")");
		System.out.println("P2: " + getCardNum(p2Deck.get(0)%13) + getSuit(p2Deck.get(0)) + " (Value: " + getCardValue(p2Deck.get(0)%13) + ")");

		// Give winner all cards
			// Cards added to back of deck
		// Return to Check deck size


}
	
	
	
	public static String getSuit(int suitNum) {

		if(suitNum <= 13) {
			return "\u2660";	// Spade
		} else if (suitNum <= 26) {
			return "\u2666";	// Diamond
		} else if (suitNum <= 39) {
			return "\u2663";	// Club
		} else {
			return "\u2764";	// Heart
		}
		
	}

	
	public static String getCardNum(int cardNum) {
		
		if(cardNum %13 == 1) {			// Ace
			return "A";
		} else if(cardNum %13 == 0) {	// King
			return "K";
		} else if(cardNum %13 == 12) {	// Queen
			return "Q";
		} else if(cardNum %13 == 11) {	// Jack
			return "J";
		} else {
			return Integer.toString(cardNum %13);
		}

		
	}

	public static int getCardValue(int cardNum) {
		// Update Ace from 1 to 14
		Map<Integer, Integer> cardValue = new HashMap<>();
		for(int i = 2; i <= 12; i++) {
			cardValue.put(i, i);
		}
		cardValue.put(1, 14);		// Value for Ace
		cardValue.put(0, 13);		// Value for King

		return cardValue.get(cardNum);
	}

	// Seems unnecessary?
	public static int getCardMod(int cardIndex) {
		return cardIndex%13;
	}
	
}

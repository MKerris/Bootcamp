package week6;

import java.util.*;

public class Card {

	private int index;		// Refers to the index of the card from the original deck 1-52
	private int value;		// Refers to the value of the card based on its face value 2-10, J=11, Q=12, K=13, A=14
	private String name;	// Takes the index value and generates the face card value and suit character for display
	private static Map<Integer, Integer> cardValue = new HashMap<>();
	
	public Card() {
		
	}
	
	// Create static HashMap for setValue() method to make handling J, Q, K, and A values easier
	// Static map initialized to avoid repeated generation by having it in the method
	// Deck is based on index 1 = A through K = 13 but Map sets values of 14 for A and 2-13 for 2-K
	// 0, 13 (King)
	// 1, 14 (Ace)
	// 2, 2  (2)
	// 3, 3  (3) ...etc...
	static		
	{			
		for(int i = 2; i <= 12; i++) {
			cardValue.put(i, i);
		}
		cardValue.put(1, 14);		// Value for Ace
		cardValue.put(0, 13);		// Value for King
	}
	
	public void describeCard() {
		System.out.println(getName() + " (Value: " + getValue() + ")");
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = cardValue.get(value);
	}


	public String getName() {
		return name;
	}


	// cardIndex%13 is used to find card face
	// Card suit is divided into four groups of 13 based on cardIndex
	public void setName(int cardInd) {
		this.name = getCardFace(cardInd%13) + getSuit(cardInd);
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		setName(index);
		setValue(index%13);
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

	private String getCardFace(int cardNum) {
		
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

}

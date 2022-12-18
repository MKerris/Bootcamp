package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Integer> cards = new ArrayList<>();
	
	// Constructor: Populate List cards with 52 cards
	public Deck() {
		for(int i = 1; i <= 52; i++) {
			cards.add(i);
		}
	}
	
	// Shuffle method: Randomize cards in List cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	// Draw method: Return and remove top card in List cards
	// removes and returns the top card of the Cards field
	public int draw() {
		return cards.remove(0);
	}
	
//	public void describe() {
//		for(int card : cards ) {
//			System.out.print(card + " ");
//		}
//	}
	
}

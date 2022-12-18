package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Integer> Hand = new ArrayList<>();
	private int score;
	private String Name;
	private Card myCard = new Card();
	
	public Player() {
		this.score = 0;
	}
	
	// prints out information about the player and calls the describe method for each card in the Hand List
	public void describe() {
		for(int card : getHand()) {
			myCard.setIndex(card);
			System.out.print(myCard.getName() + " ");
		}
	
	}
	
	
	// removes and returns the top card of the Hand
	// sets values for p1 and p2 card for battle
	public int flip() {
		return getHand().remove(0);
	}
	
	
	// takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field
	public int draw(Deck odeck) {
		return odeck.draw();
	}
	
	
	public void incrementScore() {
		this.score ++;
	}


	public List<Integer> getHand() {
		return Hand;
	}


	public void setHand(int card) {
		this.Hand.add(card);
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		if(name.length() > 0) {
			this.Name = name;
		} else {
			this.Name = "Player";
		}

	}
	
}

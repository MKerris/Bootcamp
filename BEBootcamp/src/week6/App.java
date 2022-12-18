package week6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck newDeck = new Deck();
		Player p1 = new Player();
		Player p2 = new Player();
		Card p1Card = new Card();
		Card p2Card = new Card();
		Scanner kb = new Scanner(System.in);
			
		// Call shuffle method on deck of cards
		newDeck.shuffle();
		
		// Deal newDeck to p1 and p2 using draw method
		// Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for(int i = 1; i <= 52; i++) {
			if(i%2 == 1) {
				p1.getHand().add(p1.draw(newDeck));
			} else if(i%2 == 0) {
				p2.getHand().add(p2.draw(newDeck));
			}
		}
		

		// Get player names
		System.out.print("Enter the name of player 1: ");
		p1.setName(kb.nextLine());
		
		System.out.print("Enter the name of player 2: ");
		p2.setName(kb.nextLine());

		// Close scanner after getting player names
		kb.close();
		
		// Display starting hand for each player
		System.out.println(); 	// Empty Line for formatting
		System.out.println("Player 1 starting hand: ");
		p1.describe();
		System.out.println(); 	// Empty Line for formatting
		System.out.println("Player 2 starting hand: ");
		p2.describe();
		System.out.println(); 	// Empty Line for formatting
		
		// <BATTLE>
		// Using a traditional for loop, iterate 26 times and call the flip method for each player
		// Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.

		for(int i = 1; i <= 26; i++) {
			System.out.println("\nRound " + i + ":");
			p1Card.setIndex(p1.flip());		// Flip Player 1's top card
			p2Card.setIndex(p2.flip());		// Flip Player 2's top card

			// Print p1's card:
			System.out.print(p1.getName() + "'s card: ");
			p1Card.describeCard();
		
			// Print p2's card:
			System.out.print(p2.getName() + "'s card: ");
			p2Card.describeCard();

			// Compare card values and determine winner or draw
			if(p1Card.getValue() > p2Card.getValue()) {
				System.out.println(p1.getName() + " wins round " + i + "!");
				p1.incrementScore();
			} else if (p2Card.getValue() > p1Card.getValue()) {
				System.out.println(p2.getName() + " wins round " + i + "!");
				p2.incrementScore();
			} else {
				System.out.println("This round is a draw.");
			}

			System.out.println("Score: " + p1.getName() + ": " + p1.getScore() + "  //  " + p2.getName() + ": " + p2.getScore());
		}
		
		// After the loop, compare the final score from each player.
		// Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		System.out.println("\n** GAME OVER **");
		System.out.println(p1.getName() + " (Player 1) has " + p1.getScore() + " points.");
		System.out.println(p2.getName() + " (Player 2) has " + p2.getScore() + " points.");
		
		if(p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " (Player 1) wins the game!");
		} else if (p2.getScore() > p1.getScore()) {
			System.out.println(p2.getName() + " (Player 2) wins the game!");
		} else {
			System.out.println("The game is a draw.");
		}

	
	}

}
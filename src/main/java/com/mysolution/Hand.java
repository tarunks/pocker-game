package com.mysolution;

import java.util.ArrayList;
import java.util.List;

/***
 * The Hands class consists of poker hands ranking
 * 
 * @author tarunsi
 *
 */
public class Hand {

	/**
	 * list of cards in the hand
	 */
	private List<Card> hand = new ArrayList<Card>();

	/**
	 * Adds a card to the hand.
	 * 
	 * @param card the card to be added to the hand
	 */
	public void addCard(Card card) {
		hand.add(card);
	}

	/**
	 * Remove card from hand
	 * 
	 * @param index
	 */
	public void removeCard(int index) {
		hand.remove(index);
	}

	/***
	 * Get the card count in hand
	 * 
	 * @return
	 */
	public int getSize() {
		return hand.size();
	}

	/***
	 * Check the cards are in pair
	 * @return
	 */

	public boolean isPair() {
		Card temp;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			temp = hand.get(i);
			for (int j = 0; j < 5; j++) {
				// dont check the card against itself
				if (i != j)
					// if temp = card(i), a pair exists
					if (temp == hand.get(j))
						counter++;
				if (counter == 2)
					return true;
			}

		}
		return false;

	}

	/***
	 * Check if all of the cards types are same and the counter is 
	 * three
	 * @return
	 */
	public boolean isThreeOfAKind() {
		Card temp;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			temp = hand.get(i);
			for (int j = 0; j < 5; j++) {
				// dont check the card against itself
				if (i != j)
					// if temp = card(i), a pair exists
					if (temp == hand.get(j)) {
						counter++;
					}

				if (counter == 3)
					return true;

			}

		}
		return false;

	}

	/***
	 * Check if the card type is Flush
	 * @return
	 */
	public boolean isFlush() {
		String temp;

		for (int i = 0; i < 5; i++) {
			temp = hand.get(0).getSuit();
			for (int j = 0; j < 5; j++) {
				// dont check the card against itself
				if (i != j)
					// if temp = card(i), a pair exists
					if (temp.equals(hand.get(i).getSuit()))
						return true;
			}
		}
		return false;
	}

	/***
	 * Check the cards of all kinds and match if all four
	 * are of same kind
	 * @return
	 */
	public boolean isFourOfAKind() {
		Card temp;
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			temp = hand.get(i);
			for (int j = 0; j < 5; j++) {
				// dont check the card against itself
				if (i != j)
					// if temp = card(i), a pair exists
					if (temp == hand.get(j))
						counter++;
				if (counter == 4)
					return true;
			}

		}
		return false;

	}

}

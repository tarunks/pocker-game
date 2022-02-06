package com.mysolution;

import java.util.Arrays;

/***
 * Draw Cards per player
 * @author tarunsi
 *
 */
public class CardsDraw {
	
	private String cards;
	private String[] player1 = new String[Constants.HAND_SIZE];
	private String[] player2 = new String[Constants.HAND_SIZE];
	
	
	//Accept cards for draw
	public CardsDraw(String cards) {
		
		this.cards = cards;
		
	}
	
	/***
	 * Game draw
	 */
	public void Draw() {
		
		getPlayers();
		
	}

	/***
	 * Get the each player's card
	 * @param cards
	 */
	private void getPlayers() {

		System.out.println(cards);
		// Check the size of the cards string
		String[] arrInputs = cards.split(" ");
		System.out.println("Total cards: " + arrInputs.length);
		// get the first and second player's cards
		if (arrInputs.length == Constants.CARD_SIZE) {
			player1 = Arrays.copyOfRange(arrInputs, 0, 4);
			System.out.println(" Player1 cards: " + player1);
			player2 = Arrays.copyOfRange(arrInputs, 5, 10);
			System.out.println(" Player2 cards: " + player2);
		}
	}
}

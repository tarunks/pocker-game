package com.mysolution;

import java.util.Objects;

/***
 * This class contains the value and suit of the card
 * @author tarunsi
 *
 */
public class Card {

	//value of the card
	private String value;
	// suit of the card
	private String suit;
	
	//Constructor 
	public Card(String value,String suit) {
		this.value = value;
		this.suit = suit;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [value=" + value + ", suit=" + suit + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(suit, value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(suit, other.suit) && Objects.equals(value, other.value);
	}
	
	
	
}

package com.mysolution;

/***
 * Card Rank enum type
 * 
 * @author tarunsi
 *
 */

public enum CardRank {
	HighCard(1), Pair(2), TwoPair(3), ThreeOfKind(4), Straight(5), Flush(6), FullHouse(7), FourOfAKind(8),
	StraightFlush(9), RoyalFlush(10);

	private int rank;

	private CardRank(int rank) {
		this.rank = rank;
	}
	
}

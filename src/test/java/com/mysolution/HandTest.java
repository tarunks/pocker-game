package com.mysolution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class HandTest {

	private Hand hand;

	@Before
	public void setUp() throws Exception {
		hand = new Hand();
		Card card1 =new Card("A","H");
		hand.addCard(card1);
		Card card2 =new Card("8","S");
		hand.addCard(card2);
		Card card3 =new Card("4","D");
		hand.addCard(card3);
		Card card4 =new Card("8","S");
		hand.addCard(card4);
		Card card5 =new Card("4","H");
		hand.addCard(card5);
	}
	@Test
	public void testHandSize()
	{
		assertEquals("Check the size of the hands",5,hand.getSize());
	}
	
	@Test
	public void testIsPairTrue() {
		
		assertFalse("Check the cards in pair",hand.isPair());
		
	}
	
}

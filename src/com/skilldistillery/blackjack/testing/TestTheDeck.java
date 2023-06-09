package com.skilldistillery.blackjack.testing;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class TestTheDeck {

	public static void main(String[] args) {

		Deck deck = new Deck();
		System.out.println(deck.checkDeckSize());

//		deck.shuffleDeck();
//		Card card = deck.dealCard();
//		System.out.println(card);
		
		
		final int initialDeckSize = deck.checkDeckSize();
		for(int cardNumber = 0; cardNumber < initialDeckSize; cardNumber ++ ) {
			Card card = deck.dealCard();
			
			System.out.println("Cardnumber: " + cardNumber + "  " + card + " " + deck.checkDeckSize());
		}
		
		
		
		
	}

	// for each of the 52 cards in the deck
} // display each card

package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<>();
	private Card card;

	public Hand() {

	}

	public void addCard(Card card) {
		hand.add(card);
	}

	public abstract int getHandValue();

	public void clearHand() {
		hand.clear();
	}


	public List<Card> getHand() {
		return hand;
	}


	@Override
	public String toString() {
		return hand.toString();
	}

}

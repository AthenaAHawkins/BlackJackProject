package com.skilldistillery.blackjack.entities;

import java.util.List;

public class BlackJackHand extends Hand {
	public BlackJackHand blackJackHand;

	public BlackJackHand() {
	}

	@Override
	public int getHandValue() {
		int total = 0;
		for (Card card : hand) {
			total += card.getValue(total);
		}
		return total;
	}

	public boolean isBlackjJack() {
		return getHandValue() == 21;

	}

	public boolean isBust() {
		return getHandValue() > 21;

	}

}

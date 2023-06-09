package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deckOfCards = new ArrayList<>();

	public Deck() {
		Rank[] ranks = Rank.values();
		Suit[] suits = Suit.values();

		for (Suit suit : suits) {
			for (Rank rank : ranks) {

				Card aCard = new Card(suit, rank);
				deckOfCards.add(aCard);
			}
		}
	}

	public int checkDeckSize() {
		return deckOfCards.size();
	}

	public Card dealCard() {
		Card aCard = null;
		aCard = deckOfCards.remove(0);
		return aCard;
	}

	public void shuffleDeck() {
		Collections.shuffle(deckOfCards);
	}
}

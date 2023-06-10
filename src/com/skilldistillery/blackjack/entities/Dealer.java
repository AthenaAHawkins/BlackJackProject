package com.skilldistillery.blackjack.entities;

public class Dealer extends Player {
	private Deck deck;
	protected Hand hand;
	private Card card;
	


	public Dealer() {
		this.deck = new Deck();
	}

	public void shuffledeck() {
		deck.shuffleDeck();
	}

	public void dealInitialRound(Player player) {
		// take card off deck and give to player x2
		Card willBeGiven = deck.dealCard();
		card = willBeGiven;
		player.addCardToHand(willBeGiven);
		Card willBeGivenTheSecond = deck.dealCard();
		player.addCardToHand(willBeGivenTheSecond);
	}

	

	public Card hit() {
		return deck.dealCard();
	}
	
	

	@Override
	public String toString() {
		return card.toString() + " [Hidden Card]";
	}

}

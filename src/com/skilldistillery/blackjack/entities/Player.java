
package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Player {
	Scanner scan = new Scanner(System.in);
	protected Hand hand;

	public void clearHand() {
		hand.clearHand();
	}
	
	public Player() {
		this.hand = new BlackJackHand();
	}
	
	public void addCardToHand(Card isBeingGiven) {
		hand.addCard(isBeingGiven);
	}
	
	public int getHandValue() {
	return hand.getHandValue();
	}
	

	@Override
	public String toString() {
		return hand.toString();
	}
	
}

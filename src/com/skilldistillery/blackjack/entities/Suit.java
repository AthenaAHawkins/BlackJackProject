package com.skilldistillery.blackjack.entities;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	private final String politeName;

	Suit(String politeSuitName) {
		politeName = politeSuitName;
	}

	@Override
	public String toString() {
		return politeName;
	}	
	
	
}

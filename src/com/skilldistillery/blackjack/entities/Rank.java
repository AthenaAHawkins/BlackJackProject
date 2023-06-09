package com.skilldistillery.blackjack.entities;

public enum Rank {
	TWO(3), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
	NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);
	
	
	private final int value;
	
	Rank(int cardValue) {
		value = cardValue;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return value + "";
	}
	
}

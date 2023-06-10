package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;

public class BlackJackApp {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		BlackJackApp blackJack = new BlackJackApp();
		blackJack.run();
	}

	public void run() {
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		System.out.println("It's time for BlackJack! ");
		System.out.println("Select 1 to play or 2 to quit");
		
		boolean isPlaying = true;
		if (scan.nextInt() == 1) {
			dealer.shuffledeck();
		dealer.dealInitialRound(player);
		dealer.dealInitialRound(dealer);
		System.out.println("Player cards are :" + player);
		System.out.println(player.getHandValue());
		if(player.getHandValue() == 21) {
			System.out.println("BLACKJACK");
			run();
		} else {
		System.out.println("Dealers cards are: " + dealer);
		System.out.println("What would you like to do? ");
		}
		System.out.println(dealer.getHandValue());
		}
		else {
			System.out.println("Thanks for playing! Goodbye!");
			isPlaying = false;
		}
		
		
		
		}
		
		
		
			

		// dealer deals the cards
	//dealer deals two face up cards to the player
//dealer deals one face up card to themselves and one face down
		

//		System.out.println(player);
//		System.out.println(dealer);
	}
	
	




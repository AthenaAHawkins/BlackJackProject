package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Dealer;
import com.skilldistillery.blackjack.entities.Player;
import com.skilldistillery.blackjack.entities.BlackJackHand;

public class BlackJackApp {
	private Player player = new Player();
	private Dealer dealer = new Dealer();
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		BlackJackApp blackJack = new BlackJackApp();
		blackJack.run();
	}

	public void run() {
		System.out.println("It's time for BlackJack! ");
		System.out.println("Select 1 to play or 2 to quit");
		boolean isPlaying = true;
		while (isPlaying) {
			if (scan.nextInt() == 1) {
				dealer.shuffledeck();
				
				dealer.dealInitialRound(player);
				dealer.dealInitialRound(dealer);

				System.out.println("Player cards are :" + player);
				System.out.println("Your total value is: " + player.getHandValue());

				if (player.getHandValue() == 21) {
					System.out.println("BLACKJACK");

				} else {
					System.out.println("Dealers cards are: " + dealer);
				}
				// set isPlaying to outcome of playerMakeDecision / dealerMakeDecision
				// wrap winnerwinnner in if check
				// if is playing do xyz otherwise reset
				playerMakeDecision();
				dealerMakeDecision();
				winnerWinnerChickenDinner();

			} else {
				System.out.println("Thanks for playing! Goodbye!");
				isPlaying = false;
			}
		}
	}

	public void playerMakeDecision() {
		System.out.println("What would you like to do? ");
		String choice = scan.next();
		while (choice.toLowerCase().equals("hit")) {
			System.out.println("previous total " + player.getHandValue());
			dealer.dealSingleCard(player);
			System.out.println("New total " + player.getHandValue());
			if (player.getHandValue() >= 21) {
				System.out.println("Your hand value is: " + player.getHandValue());
			}
			System.out.println("What would you like to do? Hit or Stand?");
			choice = scan.next();
		}
		if (choice.toLowerCase().equals("stand")) {
			System.out.println("I will stand. The final hand value is: " + player.getHandValue());
		} else {
			System.out.println("Incorrect input. Please try again.");
		}
	}

	public void dealerMakeDecision() {
		System.out.println("Dealers turn: ");
		if (dealer.getHandValue() <= 17) {
			dealer.dealSingleCard(dealer);
			System.out.println("Dealer Hits");
		} else if (dealer.getHandValue() > 17) {
			System.out.println("The dealer stands");
		}
	}

	public void winnerWinnerChickenDinner() {

		System.out.println("Dealers total value is: " + dealer.getHandValue());
		System.out.println("Your total value is: " + player.getHandValue());
		if (dealer.getHandValue() > player.getHandValue() && dealer.getHandValue() <= 21 || dealer.getHandValue() == 21
				|| player.getHandValue() > 21 && dealer.getHandValue() < 21) {
			System.out.println("House wins");
		} else if (dealer.getHandValue() < player.getHandValue() && player.getHandValue() <= 21
				|| player.getHandValue() == 21) {
			System.out.println("Player wins!");
		} else if (player.getHandValue() == dealer.getHandValue()) {
			System.out.println("Tie");
		} else {
			System.out.println("Nobody Wins");
			
		}
	}
	
}

// dealer deals the cards
// dealer deals two face up cards to the player
//dealer deals one face up card to themselves and one face down

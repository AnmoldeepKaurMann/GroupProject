package com.mycompany.groupproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to represent a player in the Blackjack game.
 */
public class BlackjackPlayer extends Player {

    private final Scanner scanner;
    private final BlackjackGame game;

    public BlackjackPlayer(String name, BlackjackGame game) {
        super(name);
        this.game = game;
        scanner = new Scanner(System.in);
    }

    @Override
public void play() {
    while (true) {
        // Show the player's hand
        showAll();

        // Ask the player to hit or stand
        System.out.println("Hit (H) or Stand (S)?");
        String choice = scanner.nextLine().toUpperCase();
        if (choice.equals("H")) {
            // Player hits
            dealCard();
            int playerScore = calculateScore();
            // Check if player busts
            if (playerScore > 21) {
                System.out.println("Bust! You lose.");
                break;
            }
        } else if (choice.equals("S")) {
            // Player stands
            break;
        } else {
            System.out.println("Invalid choice. Please enter H or S.");
        }
    }
}


    private void dealCard() {
        GroupOfCards deck = game.getDeck();
        ArrayList<Card> cards = deck.getCards();
        if (!cards.isEmpty()) {
            Card drawnCard = cards.remove(0); // Remove the top card from the deck
            getHand().add(drawnCard); // Add the drawn card to the player's hand
        } else {
            System.out.println("Error: Deck is empty. Unable to deal a card.");
        }
    }

    @Override
    public int calculateScore() {
        int score = 0;
        for (Card card : getHand()) {
            score += card.getRank().getValue();
        }
        return score;
    }
    
    public void showSome() {
        System.out.println("\nPlayer's Hand:");
        for (int i = 0; i < getHand().size(); i++) {
            if (i == 0) {
                System.out.println(" " + getHand().get(i));
            } else {
                System.out.println(" <card hidden>");
            }
        }
    }
    
    public void showAll() {
        System.out.println("\nPlayer's Hand:");
        for (Card card : getHand()) {
            System.out.println(" " + card);
        }
        System.out.println("Player's Hand Value: " + calculateScore());
    }
}

package com.mycompany.groupproject;

import java.util.ArrayList;

/**
 * A class to represent the dealer in the Blackjack game.
 */
public class BlackjackDealer extends Player {

    private final BlackjackGame game;

    public BlackjackDealer(String name, BlackjackGame game) {
        super(name);
        this.game = game;
    }

@Override
public void play() {
    int dealerScore = calculateScore();
    while (dealerScore < 17) {
        // Dealer hits if their score is less than 17
        dealCard();
        dealerScore = calculateScore();
    }
    
    // Check if the dealer busts (score exceeds 21)
    if (dealerScore > 21) {
        System.out.println("Dealer busts!");
    }
}






    private void dealCard() {
        GroupOfCards deck = game.getDeck();
        ArrayList<Card> cards = deck.getCards();
        if (!cards.isEmpty()) {
            Card drawnCard = cards.remove(0); // Remove the top card from the deck
            getHand().add(drawnCard); // Add the drawn card to the dealer's hand
        } else {
            System.out.println("Error: Deck is empty. Unable to deal a card.");
        }
    }

    @Override
public int calculateScore() {
    int score = 0;
    ArrayList<Card> hand = getHand();
    int numAces = 0; // Track the number of Aces in the hand
    for (Card card : hand) {
        if (card.getRank() != Rank.ACE) {
            score += card.getRank().getValue();
        } else {
            numAces++; // Increment the count of Aces
        }
    }
    // Add Aces to the score, treating them as 11 if possible, otherwise as 1
    for (int i = 0; i < numAces; i++) {
        if (score + 11 <= 21) {
            score += 11;
        } else {
            score += 1;
        }
    }
    return score;
}

    
    public void showSome() {
        System.out.println("\nDealer's Hand:");
        System.out.println(" <card hidden>");
        System.out.println(" " + getHand().get(1));
    }
    
    public void showAll() {
        System.out.println("\nDealer's Hand:");
        for (Card card : getHand()) {
            System.out.println(" " + card);
        }
        System.out.println("Dealer's Hand Value: " + calculateScore());
    }
}

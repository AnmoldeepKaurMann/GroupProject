package com.mycompany.groupproject;

import java.util.ArrayList;

/**
 * A class to represent the Blackjack game.
 */
public class BlackjackGame extends Game {

    private final GroupOfCards deck;

    public BlackjackGame(String name) {
        super(name);
        deck = new GroupOfCards(52);
        deck.initializeDeck(); // Initialize the deck with cards
        deck.shuffle(); // Shuffle the deck
    }

    public GroupOfCards getDeck() {
        return deck;
    }
    

    @Override
public void play() {
    // Deal two cards to each player
    for (Player player : getPlayers()) {
        dealCard(player);
        dealCard(player);
    }

    // Show the initial hands
    showInitialHands();

    // Player's turn
    for (Player player : getPlayers()) {
        if (player instanceof BlackjackPlayer) {
            ((BlackjackPlayer) player).play();
        }
    }

    // Dealer's turn
    for (Player player : getPlayers()) {
        if (player instanceof BlackjackDealer) {
            ((BlackjackDealer) player).play();
        }
    }

    // Declare the winner
    declareWinner();
}

private void showInitialHands() {
    // Show dealer's hand
    System.out.println("\nDealer's Hand:");
    ((BlackjackDealer) getPlayers().get(1)).showSome();

    // Show player's hand
    System.out.println("\nPlayer's Hand:");
    ((BlackjackPlayer) getPlayers().get(0)).showAll();
}



    @Override
public void declareWinner() {
    int dealerScore = ((BlackjackDealer) getPlayers().get(1)).calculateScore();
    int playerScore = ((BlackjackPlayer) getPlayers().get(0)).calculateScore();

    System.out.println("\nDealer's Hand:");
    ((BlackjackDealer) getPlayers().get(1)).showAll();

    System.out.println("\nPlayer's Hand:");
    ((BlackjackPlayer) getPlayers().get(0)).showAll();

    System.out.println("Dealer's score: " + dealerScore);
    System.out.println("Player's score: " + playerScore);

    if (dealerScore > 21) {
        System.out.println("Dealer busts! Player wins.");
    } else if (playerScore > 21) {
        System.out.println("Player busts! Dealer wins.");
    } else if (dealerScore == playerScore) {
        System.out.println("It's a tie!");
    } else if (dealerScore > playerScore) {
        System.out.println("Dealer wins!");
    } else {
        System.out.println("Player wins!");
    }
}


    private void dealCard(Player player) {
        GroupOfCards deck = getDeck();
        ArrayList<Card> cards = deck.getCards();
        if (!cards.isEmpty()) {
            Card drawnCard = cards.remove(0); // Remove the top card from the deck
            player.getHand().add(drawnCard); // Add the drawn card to the player's hand
        } else {
            System.out.println("Error: Deck is empty. Unable to deal a card.");
        }
    }
}

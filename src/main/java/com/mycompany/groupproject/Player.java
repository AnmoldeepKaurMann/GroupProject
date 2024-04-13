/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package com.mycompany.groupproject;
import java.util.ArrayList;
/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Anmoldeep Kaur
 */
public abstract class Player {

    private String name; //the unique name for this player
    private final ArrayList<Card> hand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }
    
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();
    public int calculateScore() {
    int score = 0;
    int numAces = 0;
    for (Card card : hand) {
        if (card.getRank() == Rank.ACE) {
            numAces++;
        } else {
            score += card.getRank().getValue();
        }
    }
    // Add Ace values dynamically to minimize bust risk
    for (int i = 0; i < numAces; i++) {
        if (score + 11 <= 21 - numAces + 1) {
            score += 11;
        } else {
            score += 1;
        }
    }
    return score;
}

}



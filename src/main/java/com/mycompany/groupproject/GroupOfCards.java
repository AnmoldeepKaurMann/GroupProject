/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */



/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Anmoldeep Kaur April 2024
 */
   
package com.mycompany.groupproject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A class to represent a group of cards in a game.
 */
public class GroupOfCards {

    private final ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList<>();
    }
    public void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            System.out.println("Error: Deck is empty. Unable to deal a card.");
            return null;
        }
    }

    /**
     * Add a card to the deck.
     *
     * @param card the card to add
     */
    public void addCard(Card card) {
        cards.add(card);
    }
}

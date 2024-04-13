/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.groupproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the BlackjackPlayer class.
 */
public class BlackjackPlayerTest {
    
    public BlackjackPlayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of play method, of class BlackjackPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        BlackjackGame game = new BlackjackGame("Blackjack");
        BlackjackPlayer instance = new BlackjackPlayer("Player", game);
        // Simulate player's input for hitting
        instance.getHand().add(new Card(Rank.ACE, Suit.HEARTS));
        instance.getHand().add(new Card(Rank.FOUR, Suit.CLUBS));
        instance.play();
        // Verify that the player's hand has been updated
        assertEquals(3, instance.getHand().size(), "Player should have 3 cards in hand after hitting");
    }

    /**
     * Test of calculateScore method, of class BlackjackPlayer.
     */
    @Test
    public void testCalculateScore() {
        System.out.println("calculateScore");
        BlackjackGame game = new BlackjackGame("Blackjack");
        BlackjackPlayer instance = new BlackjackPlayer("Player", game);
        // Add cards to player's hand to calculate score
        instance.getHand().add(new Card(Rank.JACK, Suit.HEARTS));
        instance.getHand().add(new Card(Rank.SEVEN, Suit.CLUBS));
        // Verify the score calculation
        int expResult = 17;
        int result = instance.calculateScore();
        assertEquals(expResult, result, "Player's score calculation is incorrect");
    }

    /**
     * Test of showSome method, of class BlackjackPlayer.
     */
    @Test
    public void testShowSome() {
        System.out.println("showSome");
        BlackjackGame game = new BlackjackGame("Blackjack");
        BlackjackPlayer instance = new BlackjackPlayer("Player", game);
        // Add cards to player's hand
        instance.getHand().add(new Card(Rank.TEN, Suit.HEARTS));
        instance.getHand().add(new Card(Rank.TWO, Suit.DIAMONDS));
        // Verify that the method shows one card and one card hidden
        instance.showSome();
        assertEquals(2, instance.getHand().size(), "Player's hand should show one card and one card hidden");
    }

    /**
     * Test of showAll method, of class BlackjackPlayer.
     */
    @Test
    public void testShowAll() {
        System.out.println("showAll");
        BlackjackGame game = new BlackjackGame("Blackjack");
        BlackjackPlayer instance = new BlackjackPlayer("Player", game);
        // Add cards to player's hand
        instance.getHand().add(new Card(Rank.TEN, Suit.HEARTS));
        instance.getHand().add(new Card(Rank.TWO, Suit.DIAMONDS));
        // Verify that the method shows all cards
        instance.showAll();
        assertEquals(2, instance.getHand().size(), "Player's hand should show all cards");
    }
    
}

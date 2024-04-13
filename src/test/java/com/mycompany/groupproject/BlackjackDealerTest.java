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
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the BlackjackDealer class.
 */
public class BlackjackDealerTest {
    
    public BlackjackDealerTest() {
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
     * Test of play method, of class BlackjackDealer.
     */
    /**
 * Test of play method, of class BlackjackDealer.
 */
/**
 * Test of play method, of class BlackjackDealer.
 */
@Test
public void testPlay() {
    System.out.println("play");
    BlackjackGame game = new BlackjackGame("Blackjack");
    BlackjackDealer instance = new BlackjackDealer("Dealer", game);
    instance.play();
    int dealerScore = instance.calculateScore();
    assertTrue(dealerScore >= 17 && dealerScore <= 21, "Dealer's score should be between 17 and 21 after playing");
}




    /**
     * Test of calculateScore method, of class BlackjackDealer.
     */
    @Test
    public void testCalculateScore() {
        System.out.println("calculateScore");
        BlackjackGame game = new BlackjackGame("Blackjack");
        BlackjackDealer instance = new BlackjackDealer("Dealer", game);
        // Add cards to dealer's hand to calculate score
        instance.getHand().add(new Card(Rank.EIGHT, Suit.CLUBS));
        instance.getHand().add(new Card(Rank.SEVEN, Suit.HEARTS));
        // Verify the score calculation
        int expResult = 15;
        int result = instance.calculateScore();
        assertEquals(expResult, result, "Dealer's score calculation is incorrect");
    }

    /**
     * Test of showSome method, of class BlackjackDealer.
     */
    @Test
public void testShowSome() {
    System.out.println("showSome");
    BlackjackGame game = new BlackjackGame("Blackjack");
    BlackjackDealer instance = new BlackjackDealer("Dealer", game);
    // Add cards to dealer's hand
    instance.getHand().add(new Card(Rank.EIGHT, Suit.CLUBS));
    instance.getHand().add(new Card(Rank.JACK, Suit.HEARTS));
    // Verify that all cards are shown without hiding any
    instance.showSome();
    assertEquals(2, instance.getHand().size(), "Dealer's hand should not hide any cards");
}


    /**
     * Test of showAll method, of class BlackjackDealer.
     */
    @Test
    public void testShowAll() {
        System.out.println("showAll");
        BlackjackGame game = new BlackjackGame("Blackjack");
        BlackjackDealer instance = new BlackjackDealer("Dealer", game);
        // Add cards to dealer's hand
        instance.getHand().add(new Card(Rank.EIGHT, Suit.CLUBS));
        instance.getHand().add(new Card(Rank.JACK, Suit.HEARTS));
        // Verify that the method shows all cards
        instance.showAll();
        assertEquals(2, instance.getHand().size(), "Dealer's hand should show all cards");
    }
    
}

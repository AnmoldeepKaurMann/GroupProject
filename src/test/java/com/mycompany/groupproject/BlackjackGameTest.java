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
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the BlackjackGame class.
 */
public class BlackjackGameTest {
    
    public BlackjackGameTest() {
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
     * Test of getDeck method, of class BlackjackGame.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        BlackjackGame instance = new BlackjackGame("Blackjack");
        GroupOfCards result = instance.getDeck();
        assertNotNull(result, "Deck should not be null");
        assertEquals(52, result.getCards().size(), "Deck should have 52 cards");
    }

    /**
     * Test of play method, of class BlackjackGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        BlackjackGame instance = new BlackjackGame("Blackjack");
        // Add players to the game
        BlackjackPlayer player = new BlackjackPlayer("Player", instance);
        BlackjackDealer dealer = new BlackjackDealer("Dealer", instance);
        instance.getPlayers().add(player);
        instance.getPlayers().add(dealer);
        // Ensure that playing the game does not throw any exceptions
        assertDoesNotThrow(() -> instance.play(), "Playing the game should not throw any exceptions");
    }

    /**
     * Test of declareWinner method, of class BlackjackGame.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        BlackjackGame instance = new BlackjackGame("Blackjack");
        // Add players to the game
        BlackjackPlayer player = new BlackjackPlayer("Player", instance);
        BlackjackDealer dealer = new BlackjackDealer("Dealer", instance);
        instance.getPlayers().add(player);
        instance.getPlayers().add(dealer);
        // Ensure that declaring a winner does not throw any exceptions
        assertDoesNotThrow(() -> instance.declareWinner(), "Declaring a winner should not throw any exceptions");
    }
    
}

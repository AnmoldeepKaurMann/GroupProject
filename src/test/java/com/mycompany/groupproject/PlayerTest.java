/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.groupproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * Test class for the Player class.
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new BlackjackPlayer("TestPlayer", new BlackjackGame("TestGame"));
        String expResult = "TestPlayer";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = new BlackjackPlayer("TestPlayer", new BlackjackGame("TestGame"));
        assertNotNull(instance.getHand(), "Player's hand should not be null");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "NewName";
        Player instance = new BlackjackPlayer("TestPlayer", new BlackjackGame("TestGame"));
        instance.setName(name);
        assertEquals(name, instance.getName(), "Player's name should be updated");
    }

    /**
     * Test of calculateScore method, of class Player.
     */
    @Test
    public void testCalculateScore() {
        System.out.println("calculateScore");
        // Creating a player with known cards to test score calculation
        Player instance = new BlackjackPlayer("TestPlayer", new BlackjackGame("TestGame"));
        instance.getHand().add(new Card(Rank.TWO, Suit.HEARTS));
        instance.getHand().add(new Card(Rank.THREE, Suit.DIAMONDS));
        assertEquals(5, instance.calculateScore(), "Player's score should be 5");
    }
    
}

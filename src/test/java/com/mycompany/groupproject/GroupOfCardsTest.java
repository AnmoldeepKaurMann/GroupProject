/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.groupproject;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the GroupOfCards class.
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
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
     * Test of initializeDeck method, of class GroupOfCards.
     */
    @Test
    public void testInitializeDeck() {
        System.out.println("initializeDeck");
        GroupOfCards instance = new GroupOfCards(52);
        instance.initializeDeck();
        assertEquals(52, instance.getCards().size(), "Deck should contain 52 cards");
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards(52);
        instance.initializeDeck();
        ArrayList<Card> originalOrder = new ArrayList<>(instance.getCards());
        instance.shuffle();
        assertNotEquals(originalOrder, instance.getCards(), "Shuffling should change the order of cards");
    }

    /**
     * Test of dealCard method, of class GroupOfCards.
     */
    @Test
    public void testDealCard() {
        System.out.println("dealCard");
        GroupOfCards instance = new GroupOfCards(52);
        instance.initializeDeck();
        int originalSize = instance.getCards().size();
        Card dealtCard = instance.dealCard();
        assertNotNull(dealtCard, "Dealt card should not be null");
        assertEquals(originalSize - 1, instance.getCards().size(), "Deck size should decrease after dealing a card");
    }

    /**
     * Test of addCard method, of class GroupOfCards.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        GroupOfCards instance = new GroupOfCards(52);
        instance.addCard(card);
        assertTrue(instance.getCards().contains(card), "Deck should contain the added card");
    }
    
}

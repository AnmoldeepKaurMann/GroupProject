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
import java.util.ArrayList;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the Game class.
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Game instance = new GameImpl("TestGame");
        String expResult = "TestGame";
        String result = instance.getName();
        assertEquals(expResult, result, "Name should be 'TestGame'");
    }

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        Game instance = new GameImpl("TestGame");
        ArrayList<Player> expResult = new ArrayList<>();
        ArrayList<Player> result = instance.getPlayers();
        assertEquals(expResult, result, "Players should be empty initially");
    }

    /**
     * Test of setPlayers method, of class Game.
     */
    @Test
    public void testSetPlayers() {
        System.out.println("setPlayers");
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Player1") {
            @Override
            public void play() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        players.add(new Player("Player2") {
            @Override
            public void play() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        Game instance = new GameImpl("TestGame");
        instance.setPlayers(players);
        assertEquals(players, instance.getPlayers(), "Players should be set correctly");
    }

    /**
     * Test of play method, of class Game.
     * Since play method is abstract, it cannot be tested directly.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        // No need to test this abstract method directly
    }

    /**
     * Test of declareWinner method, of class Game.
     * Since declareWinner method is abstract, it cannot be tested directly.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        // No need to test this abstract method directly
    }

    public class GameImpl extends Game {

        public GameImpl(String name) {
            super(name);
        }

        @Override
        public void play() {
        }

        @Override
        public void declareWinner() {
        }
    }
    
}

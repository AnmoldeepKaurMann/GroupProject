/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.groupproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SuitTest {

    @Test
    public void testValues() {
        Suit[] expResult = Suit.values();
        Suit[] result = {Suit.CLUBS, Suit.DIAMONDS, Suit.HEARTS, Suit.SPADES};
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testValueOf() {
        String string = "CLUBS";
        Suit expResult = Suit.CLUBS;
        Suit result = Suit.valueOf(string);
        assertEquals(expResult, result);
    }
}

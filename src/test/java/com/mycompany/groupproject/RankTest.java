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

public class RankTest {

    @Test
    public void testValues() {
        Rank[] expResult = Rank.values();
        Rank[] result = {Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN,
                         Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testValueOf() {
        String string = "ACE";
        Rank expResult = Rank.ACE;
        Rank result = Rank.valueOf(string);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetValue() {
        Rank instance = Rank.ACE;
        int expResult = 11;
        int result = instance.getValue();
        assertEquals(expResult, result);
    }
}

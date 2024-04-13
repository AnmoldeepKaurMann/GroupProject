/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.groupproject;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

/**
 * Test class for the MainClass class.
 */
public class MainClassTest {
    
    public MainClassTest() {
    }

    /**
     * Test of main method, of class MainClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        // No need to provide any arguments or simulate input for this basic test
        assertDoesNotThrow(() -> GroupProject.main(new String[]{}), "Main method should not throw any exceptions");
    }
    
}

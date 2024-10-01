package com.swiggy.As;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MagicalAreaTest {

    private Player playerA;
    private Player playerB;
    private MagicalArea arena;
    private Dice dice;

    @Before
    public void setUp() {
    	dice=new Dice();
        playerA = new Player("Player A", 50, 5, 10,dice);
        playerB = new Player("Player B", 100, 10, 5,dice);
        arena = new MagicalArea(playerA, playerB);
    }
        
    
    @Test
    public void testPlayerAWins() {
        // Reduce playerB's health to a very low value to ensure playerA wins
        playerB.reduceHealth(100);

        // Start the match
        arena.startMatch();

        // Verify playerA is the winner
        assertTrue(playerA.isAlive());
        assertFalse(playerB.isAlive());
    }

    @Test
    public void testPlayerBWins() {
        // Reduce playerA's health to a very low value to ensure playerB wins
        playerA.reduceHealth(50);

        // Start the match
        arena.startMatch();

        // Verify playerB is the winner
        assertTrue(playerB.isAlive());
        assertFalse(playerA.isAlive());
    }
    @Test
    public void testMultipleTurns() {
        playerA.reduceHealth(10); // Ensure player A is not at full health
        playerB.reduceHealth(20); // Ensure player B is not at full health
        arena.startMatch();

        // Check that health changes indicate the match has progressed
        assertTrue(playerA.getHealth() < 50);
        assertTrue(playerB.getHealth() < 100);
    }



	@Test
    public void startMatch() {
        arena.startMatch();
        assertTrue(playerA.isAlive() || playerB.isAlive()); // Either playerA or playerB should be Alive after the fight
        arena.startMatch();
        assertFalse(playerA.isAlive() && playerB.isAlive()); // Either playerA or playerB should be dead after the fight
    }
	
}

package com.swiggy.As;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Player playerA;
    private Player playerB;

    private Dice dice;

    @Before
    public void setUp() {
    	dice =new Dice();
        playerA = new Player("PlayerA", 50, 5, 10,dice);
        playerB = new Player("PlayerB", 100, 10, 5, dice);

    }

    @Test
    public void testPlayerAInitialization() {
        assertEquals("PlayerA", playerA.getName());
        assertEquals(50, playerA.getHealth());
        assertEquals(5, playerA.getStrength());
        assertEquals(10, playerA.getAttack());
    }
    @Test
    public void testPlayerBInitialization() {
        assertEquals("PlayerB", playerB.getName());
        assertEquals(100, playerB.getHealth());
        assertEquals(10, playerB.getStrength());
        assertEquals(5, playerB.getAttack());
    }
    @Test
    public void testReduceHealth() {
        playerA.reduceHealth(10);
        assertEquals(40, playerA.getHealth());
    }
    @Test
     public void testAttackingMachism()
     {
    	 int attackRoll = playerA.getAttack() * 5; // Simulating a roll of 5 for attack
         int defenseRoll = playerB.getStrength() * 3; // Simulating a roll of 3 for defense
         int damage = attackRoll - defenseRoll;

         // Test the damage calculation
         assertEquals(50 - 30, damage); // attackRoll = 50, defenseRoll = 30, damage = 20
         playerB.reduceHealth(damage);
         assertEquals(80, playerB.getHealth());

     }
    @Test
     public void attackingWithNoDamage()
     {
    	int attackingRoll=playerA.getAttack()*5;
    	int defenderRoll=playerB.getStrength()*3;
    	int damage=attackingRoll-defenderRoll;
    	if(damage<=0)
    		playerB.reduceHealth(0);
    	assertEquals(100, playerB.getHealth());
     }
    @Test
     public void testMaxBoundaryOfHealth()
     {
    	playerA.reduceHealth(100);
    	assertEquals(0, playerA.getHealth());
     }
    @Test
    public void testIsAlive() {
        assertTrue(playerA.isAlive());
        playerA.reduceHealth(50);
        assertFalse(playerA.isAlive());
    }

    @Test
    public void testGetAttackingDie() {
        for (int i = 0; i < 100; i++) {
            int roll = playerA.getAttackingDie();
            assertTrue("Attack roll should be between 1 and 6",roll >= 1 && roll <= 6);

        }
    }

    @Test
    public void testGetDefendingDie() {
        for (int i = 0; i < 100; i++) {
            int roll = playerA.getDefendingDie();
            assertTrue("Defend roll should be between 1 and 6",roll >= 1 && roll <= 6);
        }
    }

}

package com.swiggy.As;


import java.util.Random;

public class Player {
	// private variables used for Security reasons 
    private String name;
    private int health;
    private int strength;
    private int attack;
//    private int attackingDie;
//    private int defendingDie;
    private Dice dice;
   // inject all dependencies 
    public Player(String name, int health, int strength, int attack,Dice dice) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
//        this.attackingDie=attackingDie;
//        this.defendingDie=defendingDie;
        this.dice=dice;
       
    }


    public void reduceHealth(int damage) {
    	
        health -= damage; 
    }
    
    public boolean isAlive() {
    	
        return health > 0;
    }
    
    // Below all are Getter methods
    public int getHealth() {
    	if(health<0)
    		return 0;
        return health;
    }

    public String getName() {
        return name;
    }

	public int getAttack() {
		return attack;
	}


	public int getStrength() {
		return strength;
	}


	public int getAttackingDie() {
		return dice. AttackingDice();
	}


	public int getDefendingDie() {
		return dice.DefendingDice();
	}
}


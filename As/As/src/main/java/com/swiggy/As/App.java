package com.swiggy.As;

import java.util.Random;

public class App {
    public static void main(String[] args) {
    	Dice dice=new Dice();
    	// Player name,health,strength,attack
        Player playerA = new Player("Player A", 50, 5, 10,dice);
        Player playerB = new Player("Player B", 100, 10, 5,dice);

        MagicalArea arena = new MagicalArea(playerA, playerB);
        arena.startMatch();
    }
}

package com.swiggy.As;

public class MagicalArea {
	//Loose Coupling Concept (Player class)
    private Player player1;
    private Player player2;
  
    public MagicalArea(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
           
    }
    int remainConstantHealth=0;
    public void startMatch() {
    	//Game Starting with Player having low Health
    	System.out.println("Game starting......\n");
        Player attacker = player1.getHealth() < player2.getHealth() ? player1 : player2;//"attacker" store lower Health player Object
        Player defender = attacker == player1 ? player2 : player1;//"defender" store higher Health player Object

        while (player1.isAlive() && player2.isAlive()) {
            System.out.println(attacker.getName() + " attacks " + defender.getName());
            System.out.print(defender.getName()+" health "+defender.getHealth());
        	 remainConstantHealth=defender.getHealth();
             // if(Math.random()>0.066)//Crital Hit condition
               attack(attacker, defender);
            if (!defender.isAlive()) // defender player having Health is zero then game is over
            {
            	System.out.println("-----------------------------------------");
            	System.out.println(attacker.getName()+" Health : "+attacker.getHealth()+"\n"+ defender.getName()+" health : "+defender.getHealth());
                System.out.println(attacker.getName() + " wins!");
                
                break;
            }
            // Swap roles Attacker < = > Defender
            Player temp = attacker;
            attacker = defender;
            defender = temp;
            System.out.println("-------------------------------------------");
        }
       
    }

	private void attack(Player attacker, Player defender) {
		int defendRoll=0;
		int attackRoll=attacker.getAttack();
		if(Math.random() > 0.066) {
		 defendRoll=defender.getStrength();}
		else
			defendRoll=0;
		
		int damage=Math.max(attackRoll * attacker.getAttackingDie() - defendRoll * defender.getDefendingDie(),0);
		
		defender.reduceHealth(damage);
		if(defender.getHealth()==remainConstantHealth)
			System.out.println("No Reduction Here");
		else
		System.out.println(" reduced to  : "+defender.getHealth());
		System.out.println("Damage is : "+damage);
	}
		
	
}


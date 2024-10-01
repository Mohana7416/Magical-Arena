package com.swiggy.As;
public class Dice {
	 int numberOfDiceforAttacking=2;
	 int numberOfDiceforDefending=3;
	   public int AttackingDice()
	   {
		   int result=0;
		   for(int i=1;i<=numberOfDiceforAttacking;i++)
		   {
			   result=Math.max(result, (int)(( Math.random() * 6 ) + 1));
		   }
		   return result;
	   }
	   public int DefendingDice() {
		   int result=0;
		   for(int i=1;i<=numberOfDiceforAttacking;i++)
		   {
			   result=Math.max(result, (int)(( Math.random() * 6 ) + 1));
		   }
		   return result;
		   
	   }
	  public int diceroll() {
		  return (int)(( Math.random() * 6 ) + 1);//// 6 sides of Die are used in these game  
	  }
}


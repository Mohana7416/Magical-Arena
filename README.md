# Magical Arena


This is a simple Java implementation of the Magical Arena game.


## Introduction


The Magical Arena is a turn-based battle game where two players engage in combat until one of them loses all their health points.

## Features

- Players have attributes such as health, strength, and attack.
- Players take turns attacking and defending using dice rolls.
- Damage calculation is based on attack and defense rolls.
- The game ends when one player's health reaches 0.

## Requirements
- Java Development Kit (JDK)
- Eclipse IDE
- JUnit 4

## Project Structure
- src/main/java:Contains the main source code files.
- src/
└── com/
    └── SwiggyAssigment/
        └── AttackerGame/
            ├── MagicalArea.java
            ├── App.java
            ├── Player.java
            

 -src/test/java :Contains the test source code files.
 src/
└── com/
    └── SwiggyAssigment/
        └── AttackerGame/
            ├── AppTest.java
            ├── MagicalAreaTest.java
            ├── PlayerTest.java
 
- pom.xml: Maven project configuration file.

## Graphical User Interface/UML diagram
## Class Diagram Show the Structure of the Game
+-------------------+
|      Dice         |
+-------------------+
| - sides           |
+-------------------+
| + roll(): int     |
+-------------------+

                         

+--------------------+         
|      Player        | 		->'Player' Class        
+--------------------+          
| - health: int      |          
| - strength: int    |      -> private variable,'-' represent Private  
| - attack: int      |         
| - attackingDie: int|
| - defendingDie:int |
| - Random :random   |
| -  name :String    |
+--------------------+          
| + getHealth(): int |          
| + getStrength(): int|         
| + getAttack(): int |          
| + isAlive(): boolean|      ->methods and return types."+" respresent Public methods 
| + attack(): int  
| +attackingDie();int |
| +defendingDie();int |     
| + reducedHealth(int): void|         
+--------------------+  
+--------------------+         
|      Player        | 		->'Player' Class        
+--------------------+          
| - health: int      |          
| - strength: int    |      -> private variable,'-' represent Private  
| - attack: int      |         
| - attackingDie: int|
| - defendingDie:int |
| - Random :random   |
| -  name :String    |
+--------------------+          
| + getHealth(): int |          
| + getStrength(): int|         
| + getAttack(): int |          
| + isAlive(): boolean|      ->methods and return types."+" respresent Public methods 
| + attack(): int  
| +attackingDie();int |
| +defendingDie();int |     
| + reducedHealth(int): void|         
+--------------------+         

        ^
        |
        | 1
        |    -one to one Relation
        | 1
+---------------------+
|      MagicalArea    |		-> 'MagicalArea' class 
+---------------------+
| - player1: Player   |
| - player2: Player   |		->object creation(Loose Coupling),
+---------------------+
| + MagicalArea(player1: Player, player2: Player)
|startMatch(): void|
| + attack(attacker:Player,    |
|      defender: Player): void | ->methods and return types."+" respresent Public methods   
|                     |
+---------------------+
        ^
        |
        | 
        |
        | 
+---------------------+
|       App           |				-> 'App' class
+---------------------+
| - main(args: String[]) : void |
                      |              ->Main/Client Class
+---------------------+
|                     |
|
+---------------------+

## How to Build and Run

=>To import the project into Eclipse:
1. Open Eclipse IDE.
2. Select "File" -> "Import" -> "Existing Maven Projects".
3. Browse to the project directory and select it.
4. Click "Finish".

## How to Run

To run the game, follow these steps:

Run the 'App.java'(src/main/java) file as a Java application to start the game.

Right click on App.java class => Run as => select Java Application

## How to Play

1. Two players are created with initial attributes (name,health, strength, and attack).
2. Players take turns attacking and defending.
3. Each player rolls a 6-sided die for attack and defense.
4. Damage is calculated based on the dice rolls and player attributes.
5. The game continues until one player's health reaches 0.

## Example Output
The game will print the results of each turn, showing the dice rolls, damage dealt, and the remaining health of each player. The match continues until one player's health is reduced to zero.

Example:
Game starting......

Player A attacks Player B
Player B health 100 reduced to  : 100
Damage is : 0
-------------------------------------------
Player B attacks Player A
Player A health 50 reduced to  : 40
Damage is : 10
-------------------------------------------
Player A attacks Player B
Player B health 100 reduced to  : 100
Damage is : 0
-------------------------------------------
Player B attacks Player A
Player A health 40 reduced to  : 30
Damage is : 10
-------------------------------------------
Player A attacks Player B
Player B health 100 reduced to  : 80
Damage is : 20
-------------------------------------------
Player B attacks Player A
Player A health 30 reduced to  : 30
Damage is : 0
-------------------------------------------
Player A attacks Player B
Player B health 80 reduced to  : 80
Damage is : 0
-------------------------------------------
Player B attacks Player A
Player A health 30 reduced to  : 30
Damage is : 0
-------------------------------------------
Player A attacks Player B
Player B health 80 reduced to  : 50
Damage is : 30
-------------------------------------------
Player B attacks Player A
Player A health 30 reduced to  : 30
Damage is : 0
-------------------------------------------
Player A attacks Player B
Player B health 50 reduced to  : 0
Damage is : 50
-----------------------------------------
Player A Health : 30
Player B health : 0
Player A wins!

## Unit Tests
Unit tests are provided to ensure the correctness of the code. JUnit 4 and Hamcrest libraries are used for testing.

##Steps to do Unit Testing:
Right click on Testing class Name => Run as => select Junit Test Case =>It will show Unit Test cases

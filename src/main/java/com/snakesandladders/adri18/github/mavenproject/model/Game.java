package com.snakesandladders.adri18.github.mavenproject;

import java.util.Random;

public class Game {
	// All instances of the game
	private int numberSnake;
    private int numberLadder;
    private int numberPlayer;
    private int[] head;
    private int[] tail;
    private int[] start;
    private int[] end;
    private Players[] player;
    
    // Game constructor
    public Game(int numberSnake, int[] head, int[] tail, int numberLadder, int[] start, int[] end, int numberPlayer, Players[] player) {
        this.numberSnake = numberSnake;
        this.head = head;
        this.tail = tail;
        this.numberLadder = numberLadder;
        this.start = start;
        this.end = end;
        this.numberPlayer = numberPlayer;
        this.player = player;
    }
    
    // Creating a random dice number for game
 		Random rand = new Random();    
 		
 	// Creating the moves of the game	
    public void play() {
        boolean gameWon = false;
        while (!gameWon) {
            for (int i = 0; i < numberPlayer; ++i) {
                int currentPosition = player[i].getPosition();
                String name = player[i].getName();
                
                // Adding dice roll to player position
                int diceNumber = rand.nextInt(6) + 1;
                int newPosition = currentPosition + diceNumber;
                
                // If dice goes past 100, player stays at position
                if (newPosition > 100) {
                    newPosition = currentPosition;
                }
                
                // Check for snakes
                for (int x = 0; x < numberSnake; ++x) {
                    if (newPosition == head[x]) {
                        newPosition = tail[x];
                        break;
                    }
                }
                
                // Check for ladders
                for (int x = 0; x < numberLadder; ++x) {
                    if (newPosition == start[x]) {
                        newPosition = end[x];
                        break;
                    }
                }
                
                // Print 
                System.out.println(name + " rolled a " + diceNumber + " and moved from "
                        + currentPosition + " to " + newPosition);
                
                player[i].setPosition(newPosition);
                
                // Win condition
                if (newPosition == 100) {
                    System.out.println(name + " wins the game!");
                    gameWon = true;
                    break;
                }
            }
        }
    }
}

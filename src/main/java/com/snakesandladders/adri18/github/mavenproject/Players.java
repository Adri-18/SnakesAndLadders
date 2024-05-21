package com.snakesandladders.adri18.github.mavenproject;

public class Players {
	// Constant
    public static final int INITIAL_POSITION = 0;

    // The private instance variables
    private String name;
    private int position;

    // Construct a Player instance with inputs
    public Players(String name, int position) { // Constructor 1
        this.name = name;
        this.position = position;
    }

    public Players(String name) { // Constructor 2
        this.name = name;
        this.position = INITIAL_POSITION;
    }

    // Public getters and setters
    // Player name will not change, no setter needed
    // Returns name of player 
    public String getName() {
        return name;
    }

    // Returns position of player
    public int getPosition() {
        return position;
    }

    // Sets the position of player
    public void setPosition(int position) {
        this.position = position;
    }

    // Returns a self descriptive String
    public String toString() {
        return name;
    }
}

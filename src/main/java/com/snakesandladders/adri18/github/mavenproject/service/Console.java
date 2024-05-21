package com.snakesandladders.adri18.github.mavenproject;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // To retrieve number of snakes
        int numberSnake = in.nextInt();
        int[] head = new int[numberSnake];
        int[] tail = new int[numberSnake];
        for (int i = 0; i < numberSnake; ++i) {
            head[i] = in.nextInt();
            tail[i] = in.nextInt();
        }
        
        // To retrieve number of ladders
        int numberLadder = in.nextInt();
        int[] start = new int[numberLadder];
        int[] end = new int[numberLadder];
        for (int i = 0; i < numberLadder; ++i) {
            start[i] = in.nextInt();
            end[i] = in.nextInt();
        }

        // To retrieve number of players
        int numberPlayer = in.nextInt();
        in.nextLine();
        Players[] player = new Players[numberPlayer];
        for (int i = 0; i < numberPlayer; ++i) {
            String playerInstance = in.nextLine();
            player[i] = new Players(playerInstance);
        }
        in.close();

        // Initializing the game
        Game game = new Game(numberSnake, head, tail, numberLadder, start, end, numberPlayer, player);
        game.play();
        
	}

}

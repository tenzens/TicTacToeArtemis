package bonn.uni.games;

// Import classes of bonn.uni.alpro

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean finished = false;

        // Create instance of Class Board and store it in a variable

        System.out.println("Welcome to TicTacToe. Player1: "+ Cell.PLAYER_1+", Player2: "+Cell.PLAYER_2);
        while(!finished){
            // 1. print Board

            // 2. Read from Commandline row and column of next move

            // 3. Update finished-Variable of while-loop in case of a winner or draw
        }

        // print Board one last time :)

        // Handle winner/draw
    }
}

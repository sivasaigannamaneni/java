package com.wipro.java.game;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';
    private static boolean gameOver = false;

    public static void main(String[] args) {
        // Initialize the board with empty spaces
        initializeBoard();
        
        // Game loop
        while (!gameOver) {
            printBoard();
            playerMove();
            checkWin();
            switchPlayer();
        }
        
        printBoard();
        System.out.println("Game Over!");
    }

    // Initialize the game board with empty spaces
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Print the current state of the game board
    private static void printBoard() {
        System.out.println("\n---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n---------");
        }
    }

    // Handle the player's move
    private static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        
        // Repeat until a valid move is made
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 0-2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            
            // Validate the move
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Switch players after every move
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check if the current player has won or if the game is a draw
    private static void checkWin() {
        // Check for win in rows, columns, and diagonals
        if (checkRows() || checkColumns() || checkDiagonals()) {
            System.out.println("Player " + currentPlayer + " wins!");
            gameOver = true;
        }
        // Check for a draw (no empty spaces left)
        else if (isBoardFull()) {
            System.out.println("It's a draw!");
            gameOver = true;
        }
    }

    // Check if any player has won in any row
    private static boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    // Check if any player has won in any column
    private static boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    // Check if any player has won in any diagonal
    private static boolean checkDiagonals() {
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    // Check if the board is full (no empty spaces)
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

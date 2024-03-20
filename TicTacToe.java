/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tictactoe;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class TicTacToe {
    private static final char EMPTY = '-';
    private static final char PLAYER1 = '0'; //Computer
    private static final char PLAYER2 = 'X'; // User
    private static final int SIZE = 3; //Size of the board
    private static final char[][] board = new char[SIZE][SIZE];
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        
        while (true) {
            //Player 1 (Computer) moves
            computerMove();
            printBoard();
            
            if (checkWin(PLAYER1)) {
                System.out.println("Computer wins!");
                break;
            }
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
            
            //Player2 (User) moves
            userMove();
            printBoard();
            if (checkWin(PLAYER2)) {
                System.out.println("You win!");
                break;
            }
            
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }
        }
    }
    
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }
    
    private static void printBoard() {
        System.out.println("----------");
        for(int i = 0; i < SIZE; i++) {
            System.out.println("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.println(board[i][j] + " | ");
            }
            System.out.println("\n-----------");
        }
    }
    
    
    private static void computerMove() {
        int row, col;
        do { 
            row = random.nextInt(SIZE);
            col = random.nextInt(SIZE);
        } while (board[row][col] != EMPTY);
        
        board[row][col] = PLAYER1;
        System.out.println("Computer's move: Row " + (row + 1) + ", Column " + (col + 1));
    }
    
    private static void userMove() {
        int row, col;
        do {
            System.out.println("Enter your move (row column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != EMPTY) {
                System.out.println("Invalid move. Try again.");
            }
        }while (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != EMPTY);
        
        board[row][col] = PLAYER2;
    }
    
    private static boolean checkWin(char player) {
        //Check rows & columns
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || 
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        
        //Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) || 
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)){
            return true;
        }
        return false;
    }
    
    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY) {
                    return false;                  
                }
            }
        }
        return true;
    }
}

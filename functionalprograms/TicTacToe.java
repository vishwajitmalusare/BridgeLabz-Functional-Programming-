/**
 * @PriblemStatement:Cross Game or Tic­Tac­Toe Game. Write a Program to play a Cross Game or Tic­Tac­Toe Game. 
 * Player 1 is the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row.
 * Take User Input for the Cell i.e. Col and Row to Mark the ‘X’The User or the Computer can only take the 
 * unoccupied cell. The Game is played till either wins or till draw. Print the Col and the Cell after every step.
 * @author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import java.util.Scanner;
/**
 * This class is written to Implement tic-tac-toe game module */
public class TicTacToe {
	public static int row,col;
	static Scanner sc=new Scanner(System.in);
	public static char[][]board=new char[3][3];
	public static char turn='x';
	public static void main(String[] args) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
	//This Variable is actually assigning values to array elements
				board[i][j]='_';	
				}
			}
	/**
	 * this method is used to start the game
	 * */
	play();
		}
	/**
	 * This function is written to print the board
	 * */
	public static void printBoard() {

	
	for(int i=0;i<3;i++) {
		//this block is only assigning values
		System.out.println();
		System.out.print("| ");
		for(int j=0;j<3;j++) {
			//This block is actually printing values
			System.out.print(board[i][j]+" | " );		
			}
		}
	System.out.println();
	}


/**
 * This methos is used strat to play the game*/
	public static void play() {
		boolean playing=true;
		printBoard();
		while(playing) {
			System.out.println(" enter row&col");
			row=sc.nextInt()-1;
			col=sc.nextInt()-1;
			board[row][col]=turn;
			if(gameOver(row,col)) {
				playing=false;
				System.out.println("Game Over "+turn+" Wins");
				}
		printBoard();
			
		if(turn=='x') {
				turn='o';
			}
		else {
				turn='x';
		}
		
	}
	
}

/**This methos have checking the win and lose condition */
public static boolean gameOver(int rmove,int lmove) {
	if(board[0][lmove]==board[1][lmove] && board[0][lmove]==board[2][lmove])
		return true;
	if(board[rmove][0]==board[rmove][1] && board[rmove][0]==board[rmove][2])
	    return true;
	
	
	if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[1][1] != '_')
		return true;
	if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1] != '_')
		return true;
	
	//try to give draw condition
	return false;
}

}

package com.bridgelabz.functionalprogram;

import java.util.Scanner;

public class TicTacToe {
public static int row,col;
static Scanner sc=new Scanner(System.in);
public static char[][]board=new char[3][3];
public static char turn='x';





public static void main(String[] args) {
		
	for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
	//actually assigning values to array elements
				board[i][j]='_';	
			}
			}
	//	printBoard();
	play();
		}



public static void printBoard() {

	
	for(int i=0;i<3;i++) {
		//only assigning values
		System.out.println();
		System.out.print("| ");
		for(int j=0;j<3;j++) {
			//actually printing values
System.out.print(board[i][j]+" | " );		
	}
	}
	System.out.println();
}

//play game

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

//game over
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

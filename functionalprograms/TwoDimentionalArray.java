/**
 * @ProblemStatement: 2D Array A library for reading in 2D arrays of integers, doubles, or booleans from
 * standard input and printing them out to standard output. M rows, N Cols, and M * N inputs for 2D Array. 
 * Use Java Scanner Class.create 2 dimensional array in memory to read in M rows and N cols. Print function 
 * to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
@author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import java.util.Scanner;
import java.io.PrintWriter;
/**This program is written to print two dimentional array 
 */
public class TwoDimentionalArray{
 private static Scanner sc;
 public static PrintWriter pw;
	public static void main(String[] args) {
		try {
		int i=0,j=0;
		sc=new Scanner(System.in);
		System.out.println("enter the row and column ");
		//This variables is storing the row and column 
		int row=sc.nextInt();
		int col=sc.nextInt();

		Object array[][]=new Object[row][col];
		PrintWriter pw= new PrintWriter(System.out);

		/** This block is written to Inserting elements*/
		System.out.println("Enter the elements :");

		for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				array[i][j]=sc.nextLine();	
				}
			}


		/**This block is written to Inserting elements*/
System.out.println("Elements in Array are ");

for(i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		pw.print(array[i][j]+" ");
		pw.flush();
		}
	System.out.println();
}
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	}
}
/**
 * @Problemstatement:Sum of three Integer adds to ZERO.A program with cubic running time. Read in N integers and 
 * counts the number of triples that sum to exactly 0.  N number of integer, and N integer input array Find distinct 
 * triples (i, j, k) such that a[i] + a[j] + a[k] = 0. One Output is number of distinct triplets as well as the second
 *  output is to print the distinct triplets.
 * @author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import java.util.Scanner;
/** 
 * This class is written to find Sum of three integers zero
 * */
public class Triplatets {

	private static Scanner sc;
	public static void main(String[] args) {
		/**
		 * This block accepts only integer values
		 * */
		try {	
int n=0,i,j,k;
//Accepting number of elements
sc=new Scanner(System.in);		
System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int array[]=new int[n];
boolean result=false;
	
if(n>=3) {
System.out.println("Enter the elements: ");

/**
 * This block is use to get elements
 *  */
for(i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
	/**
	 * This block is use to calculate the treiplates
	 * */
		for(i=0;i<n-2;i++) {
		for(j=i+1;j<n-1;j++){
			for(k=j+1;k<n;k++){
				if(array[i]+array[j]+array[k]== 0) {
					System.out.println("["+array[i]+ " "+array[j]+" "+array[k]+"]");
					result=true;
				}
			}
		}
	}
		if(result== false) {
			System.out.println("Not found..");
		}	
	}
else {
	System.out.println("Enter Minimum 3 elements ");
}
}catch(Exception e) {
	e.printStackTrace();
}
}

	}

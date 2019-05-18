/**
 * @ProblemStatement:Power of 2 This program takes a command­line argument N and prints a table of the 
 * powers of 2 that are less than or equal to 2^N.The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows 
 * an int repeat until i equals N.Print the year is a Leap Year or not.
 * @author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;
/**
 * This program written to find Power of two series
 * */
public class PowOfTwoSeries {

	public static void main(String[] args) {
	
		/**
		 * This block accepts only positive integers
		 * */
		try {
		System.out.println("Enter the number :");
		//This variable stores the length upto series is going to be calculated
		int seriesCount=Utility.scan.nextInt();
		/**
		 * This function return the power of two series
		 * */
		Utility.powerOfTwoSeries(seriesCount);
	}catch(Exception e) {
		System.out.println("Only accepts the positive integers its returns"+e);
	}
	}
}
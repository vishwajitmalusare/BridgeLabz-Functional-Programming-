/**
 * Problem Statement: Write a program Distance.java that takes two integer command-line argument x and y and
 *  return the distance in between x and y by using given formula
 * @author : Vishwajeet Malusare
 **/
package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;
/**
 * This class is written to calculate Distance
 * */
public class Distance {


	public static void main(String[] args) {

		/**
		 * Only taking positive integer as an input*/
		try {
		System.out.println("Enter the Point a And b: ");
		int x=Utility.scan.nextInt();
		int y=Utility.scan.nextInt();
		/**
		 * This function is calculate distance from point x to y
		 * */
		Utility.calculateDistance(x,y);
		
		}catch(Exception e) {
			System.out.println("Enter the Positive Integer value only.."+e);
		}
		
	}

}

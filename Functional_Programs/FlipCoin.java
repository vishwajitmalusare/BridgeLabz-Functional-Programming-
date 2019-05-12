/**
 *@Problem Sattement: Flip Coin and print percentage of Heads and Tails.
 *The number of times to Flip Coin. Ensure it is positive integer.
 *Percentage of Head vs Tails
 * @author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;

/**
 * This class is written to find the Flip coin percentile
 * */
public class FlipCoin {

	public static void main(String[] args) {
		/**Only taking positive integer as an input*/
		try {
		/**
		 * flipCoin() method is gives the total number and percentage of heads and tails
		 * */
		Utility.flipCoin();
		}catch(Exception e) {
			System.out.println("Enter positive integers only"+e);
		}
	}

}

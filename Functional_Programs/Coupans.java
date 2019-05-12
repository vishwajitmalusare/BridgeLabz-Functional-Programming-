/**
 * Problem Statement: Given N distinct coupon numbers how many random numbers do you need to generate distinct 
 * coupon numbers ? This program simulates this random process.
 * 
 * author :Vishwajeet V. Malusare 
 **/
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

/**This class is written to Find a unique number of coupons*/
public class Coupans {
	
	public static void main(String[] args) {

		/**Only taking positive integer as an input*/
		try {
		System.out.println("Enter number of coupons you want: (1-10)");
		
		//variable size store the number of coupon user want
		int size=Utility.scan.nextInt();
		
		//variable count stores value of how many time we call random function for collecting coupons
		int count=Utility.collect(size);

System.out.println(" Random function is called : "+count+" times, \nFor generating "+size+" Distinct coupons.");
		}catch(Exception e) {
			System.out.println("Enter Positive integer value only: "+e);
				}
		}
}

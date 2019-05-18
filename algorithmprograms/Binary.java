/*
 * Problem statement:Write Binary.java to read an integer as an Input, convert to Binary using toBinary
function and perform the following functions.
i. Swap nibbles and find the new number.
ii. Find the resultant number is the number is a power of 2.

@author: Vishwajeet V. Malusare
 * */
package com.bridgelabz.algorithms;//Exception is handelded........................

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {
try {
		//useful variables
		int power=0;
		int count=0;
		
		System.out.println("Enter number: ");
		int mNumber=Utility.scan.nextInt();

		//utility function calling
		int array[]=Utility.toBinary(mNumber);
		int arr[]=Utility.swapNibble(array);
		
		System.out.print("\n\nFind the resultant number is the number in a power of 2 = ");

		/* Printing a resultant number in a poer of 2*/
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==1) {
				System.out.println();
				power=(int)Math.pow(2,count);
				
								System.out.print("2^"+count+" = "+power);	

				}
			count++;
	}
		System.out.println();
	}catch(Exception e) {
		System.out.println("Exception is : "+e);
		
	}

	}
}

/**
 * @Problem Statement:Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N. The Harmonic Value N. Ensure N != 0
 *compute 1/1 + 1/2 + 1/3 + ... + 1/N. Print the Nth Harmonic Value.
 * @author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;;
public class HarmonicNumber {


	public static void main(String[] args) {
		/**Only accept positive integers*/
		try {
// Used to store the result value
		float number=1f,result=1f;


		System.out.println("Enter number: ");
		number=Utility.scan.nextInt();

		//checking condition until number getting 0
		if(number>0) {
			//loop until i not get value same as number varable
			for(int i=2;i<=number;i++) {
				result +=(float)1/i;
			}
			System.out.println(result);
		}
		else {
	
			System.out.println("Enter number greater than Zero");
		}
		
		}catch(Exception e) {
			System.out.println("Accepts only positive integers "+e);
		}
		}
}
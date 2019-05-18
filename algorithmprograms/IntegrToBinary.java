/**
 *Problem statement: Write a static function toBinary that outputs the binary(base 2)
 * representation of the decimal number typed as the input
 * 
 * @author: Vishewajeet V. Malusare
 * */
package com.bridgelabz.algorithms;

import com.bridgelabz.utility.Utility;;
public class IntegrToBinary {

	public static void main(String[] args) {

		//int i=0;
		System.out.println("Enter number: ");
		int mNumber=Utility.scan.nextInt();
		Utility.toBinary(mNumber);

	}


}

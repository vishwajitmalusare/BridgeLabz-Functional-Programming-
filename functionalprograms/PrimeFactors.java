/**
 * @ProblemStatement: Factors, Computes the prime factorization of N using brute force.Number to find the prime factors
 * Print the prime factors of number N.
 * */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;
/**
 * This class written to find out the prime factors of the given number
 * */
public class PrimeFactors {

	public static void main(String[] args) {
		//number variable store the integer which factors we are going to be calculate
		int i,number=0;
System.out.println("Enter Number: ");
number=Utility.scan.nextInt();

//This loop is iterate upto the given number
for(i=2;i<=number;i++) {
	while(number%i==0) {
		System.out.println(i);
		number=number/i;
	}
		}
	}

}

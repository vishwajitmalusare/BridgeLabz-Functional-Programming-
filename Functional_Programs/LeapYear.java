/**
 * @Problem Statement: Leap Year Year, ensure it is a 4 digit number.Determine if it is a Leap Year.
 * Print the year is a Leap Year or not.
 * @author : Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;
/**
 * This class is written for finding leap year
 * */
public class LeapYear {

		public static void main(String[] args) {

			//varibales are used to store year and count
			int year=0,digit=0;
			System.out.println("Enter the Year:");
			year=Utility.scan.nextInt();
			int number=year;



			//Checking where the entered year is 4 digit or not
			while(number!=0){
				number=number/10;
				digit++;
				}
			//Checking for Leap Year

			if(digit==4) {
				if((year%4==0 && year%100!=0)||year%400==0){	
					System.out.println("Leap Year..");
				}

				else{
					System.out.println("not leap year...");
				}
			}
			
			else {
				System.out.println("Enter Four digit year only !!!");
			}
		}
}

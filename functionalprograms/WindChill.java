/**
 *@ProblemStatement: Write a program WindChill.java that takes two double command­line arguments t and v and prints 
 *the wind chill. Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and the wind speed v 
 *(in miles per hour),the National Weather Service defines the effective temperature (the wind chill) to be:
 *@author: Vishwajeet malusare
 * */
package com.bridgelabz.functionalprogram;
/**
 * This class is written to find WindChill
 * */
public class WindChill {

	public static void main(String[] args) {
		//This variables store value of tempreature and wind
		double t= Integer.parseInt(args[0]);
		double v =Integer.parseInt(args[1]);
		
		if(t<=50 && (v<=120&&v>3)) {
		//result in different by this formula->double windchill=35.74+Math.pow(0.62151, t)+((Math.pow(0.4275,t)+35.75)*(Math.pow(v,0.16)));
		
			double windchill=35.74 + 0.62151* t + ((0.4275*t)+35.75) * (Math.pow(v,0.16));
	System.out.println("Windchill is = "+windchill);
		}
		else {
			System.out.println("Enter t in betwen1-50 or v in between 3-120");
		}
		}

}

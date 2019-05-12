/**
 * @ProblemStatement: Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. 
 * Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula 
 * delta = b*b ­ 4*a*c 
 * Root 1 of x = (­b + sqrt(delta))/(2*a)
 * Root 2 of x = (­b ­ sqrt(delta))/(2*a)
 * Take a, b and c as input values to find the roots of x.
 * @author : Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;
/**
 * This class is written to findout the root of Quadratic equation
 * */
public class Quadratic {

	public static void main(String[] args) {
		double b=0,c=0,a=0;
	
		System.out.println("Enter the a,b & c ");
		//Variable a,b,c store the value which used in formulas
		a=Utility.scan.nextDouble();
		b=Utility.scan.nextInt();
		c=Utility.scan.nextInt();
	
	double delta=b*b-4*(a*c);
	double root1_of_x = ((-b)+Math.sqrt(delta))/(2*a);
	double root2_of_x = ((-b)-Math.sqrt(delta))/(2*a);
	System.out.println("Root 1 :"+root1_of_x);
	System.out.println("Root 2 :"+root2_of_x);
	}

}

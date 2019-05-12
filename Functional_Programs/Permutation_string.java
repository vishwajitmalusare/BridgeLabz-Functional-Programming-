/**
 * @problem statement: Write static functions to return all permutation of a String using iterative method and
 * Recursion method. Check if the arrays returned by two string functions are equal.
 * @author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;
import com.bridgelabz.utility.Utility;
/**
 * Thie class is written to find permutation of the given String
 * */
public class Permutation_string {

	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		String str=Utility.scan.nextLine();
//This function is returns the permutation of the string
		permute(str.toCharArray(),0);
}

	
	
	/**
	 * This function is written to calculate the permutation of the given string
	 */
	public static void permute(char ch[],int current) {
		
		if(current == ch.length-1) {
			System.out.println(ch);
		}
		else {
			//compare the stings by converting into the character...
			for(int i=current;i<ch.length;i++) {
				swap(ch,current,i);
				permute(ch,current+1);
				swap(ch,current,i);
			}
		}}
		
	/**This function is written for swapping the strings*/
		public static void swap(char[] ch1,int i,int j) 
		{
			char temp=ch1[i];
			ch1[i]=ch1[j];
			ch1[j]=temp;
		}
	}


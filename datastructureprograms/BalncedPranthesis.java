/*
 * Problem statement: Simple balance parentheses 
 * Take an Arithimatic Expression such as (5*6)*(7+6)/(7+8) where parentheses are used to order the performance of operation.
 * Ensure parentheses must appear in a balanced fashion. True or false to show Arithmatic Expression is balanced or not.
 * 
 * @author : Vishwajeet V. Malusare
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.Stack;
import com.bridgelabz.utility.Utility;
public class BalncedPranthesis {

	public static void main(String[] args) {

		/*
		 * Exception handling
		 * */
		try {
			
			Stack<Character> stk=new Stack<Character>();
			System.out.println("Equation: ");
			String str=Utility.scan.next();
			
			int len=str.length();
			System.out.println(len);
			
			for(int i=0;i<len;i++) {
				char ch=str.charAt(i);
				if(ch=='(') {
					/*
					 * calling stack push method
					 * */
					stk.push(ch);
					
				}
				else if(ch==')') {
					/*
					 * calling stack push method
					 * */
					stk.pop();
					
				}
			}
			
			//Check for Arithmatic expression is balanceds or not
			if(stk.isEmpty()==true) {
				System.out.println("Arithmatic expression is Balanced.  ");
			}
			else {
				System.out.println("Arithmatic expression is Not Balanced. ");
			}
		
		}catch(Exception e) {System.out.println("Message "+e);}
	}

}

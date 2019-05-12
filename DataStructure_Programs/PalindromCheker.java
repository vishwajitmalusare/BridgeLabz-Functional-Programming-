package com.bridgelabz.datastructure;

import java.util.Scanner;

public class PalindromCheker {

	public static void main(String[] args) {

		UtilityDataStructure util=new UtilityDataStructure();			//creating utility class object
		Scanner scan=new Scanner(System.in);	//to scan input data
		System.out.println("Enter the String....!!!");
		String input=scan.next();		
		char[] data=input.toCharArray();		//variable for convertion from string to charecters
		
		for (int i = 0; i < data.length; i++) { 	//loop to add the data to deque
			util.deq.addrear(data[i]);
		}
			util.deq.print();
			boolean check=util.deq.polindrome();	//to check wether the given string is polindrome or not
			if(check==true)
			{
				System.out.println(" String is Polindrome");
			}else
			{
				System.out.println(" String is Not Polindrome");
			}
			scan.close();
	}

}

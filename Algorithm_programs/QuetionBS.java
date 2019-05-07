package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class QuetionBS {
//public static Scanner sc;
	
	public static void main(String[] args) {
		//Utility.sc=new Scanner(System.in);
		System.out.println("Enter the range to serach the element : ");
		int range=Utility.scan.nextInt();
		int l=0,r=range,mid;
	 
	System.out.println("Think a number in between range 0 to "+range);
	mid=Utility.findMid(l,r);
	Utility.binarySearch_algo(l,r,mid);
	
	}
	
		

		
	}
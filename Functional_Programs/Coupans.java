package Functional_program;

import java.util.Scanner;

public class Coupans {

	private static Scanner scan;
	
	//random function
	public static int getCoupon(int n)
	{
		return (int)(Math.random()*n);
	}
	
	public static int Collect(int n) {
		boolean[] isCollected= new boolean[n];
		int count=0;
		int distinct=0;
		
		while(distinct<n) {
			int value=getCoupon(n);
			System.out.println("Values given by random function: "+value);
			count++;
				
			if(!isCollected[value]) {
				distinct++;
				isCollected[value]=true;
				System.out.println("Unique coupon values: "+value);
			}
		}
		return count;
	}

	public static void main(String[] args) {
	//input
		System.out.println("Enter number of coupons you want: ");
		scan=new Scanner(System.in);
		int size=scan.nextInt();
		int count=Collect(size);
System.out.println("Number of time random function is called: "+count);
}
}
//Make it run for 100 or 1000 inputs
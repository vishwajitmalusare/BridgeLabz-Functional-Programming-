package Functional_program;

import java.util.Scanner;
public class Prime_factors {

	private static Scanner sc;

	public static void main(String[] args) {
		
		int i,number=0;
System.out.println("Enter Number: ");
sc = new Scanner(System.in);
number=sc.nextInt();

//try it as per statement wit i*i
for(i=2;i<=number;i++) {
	while(number%i==0) {
		System.out.println(i);
		//number/=i; Its used at i*i
		number=number/i;
	}
		}
	}

}

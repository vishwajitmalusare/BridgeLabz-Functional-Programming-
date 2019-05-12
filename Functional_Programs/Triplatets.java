package com.bridgelabz.functionalprogram;

import java.util.Scanner;
public class Triplatets {

	private static Scanner sc;
	public static void main(String[] args) {
		
int n=0,i,j,k;
//Accepting number of elements
sc=new Scanner(System.in);		
System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int array[]=new int[n];
boolean result=false;
	
if(n>=3) {
System.out.println("Enter the elements: ");

//Entering elements
for(i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
	//Calculation
		for(i=0;i<n-2;i++) {
		for(j=i+1;j<n-1;j++){
			for(k=j+1;k<n;k++){
				if(array[i]+array[j]+array[k]== 0) {
					System.out.println("["+array[i]+ " "+array[j]+" "+array[k]+"]");
					/*System.out.print("["+array[i]+" ");
					System.out.print(array[j]+" ");
					System.out.print(array[k]+"]"); */
					result=true;
				}
			}
		}
	}
		if(result== false) {
			System.out.println("Not found..");
		}	
	}
else {
	System.out.println("Enter Minimum 3 elements ");
}
}

	}

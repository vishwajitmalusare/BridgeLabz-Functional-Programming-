 package com.bridgelabz.algorithms;
import java.util.Scanner;

public class VendingMachine {

		private static Scanner sc;

		public static void main(String[] args) {
				sc= new Scanner(System.in);
				int array[]={1000,500,100,50,10,5,2,1};
				System.out.println("Enter the Cash: ");
				int c=sc.nextInt();
				Notes(array,c);

			}

				public static void Notes(int array[],int cash) {
					int count=0;
					int res=0;
					
				//main execution
					for(int i=0;i<array.length&&cash>0;i++) {
						//if(i==array.length-1)
							//System.out.println("Cash before the Operation: "+cash); 
						
						//its a number of note
						res=(cash/array[i]);
						//to get remaining cash
						 cash=cash-array[i]*res;
						 
						 //output printing
						 if(array[i]>0 && res!=0) {
						 System.out.println("Note of "+array[i]+" Rs."); 
						 System.out.println(" Number of notes: "+res);
						 System.out.println();
						 }
						 count+=res;
					}
					
					System.out.println("Total number of notes : "+count);
				
				}

	}

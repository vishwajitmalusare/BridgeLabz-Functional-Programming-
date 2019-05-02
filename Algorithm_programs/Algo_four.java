package com.Algorithm;
import java.util.Scanner;

import com.utility.Utility;

public class Algo_four {
private static Scanner sc;

	public static void main(String[] args) {

		sc=new Scanner(System.in);
	
int ch;
do {
		System.out.println("\n-----------------MENU----------------------------");
		System.out.println("\t1.Binary Search for integer \n\t2.Binary search for string \n\t3.Insertion sort for Integer");
		System.out.println("\t4.Insertion Sort for String \n\t5.Bubble Sort for Integer \n\t6.Bubble sort for String");
		
		System.out.println("Enter Your Choice: ");
		 ch=sc.nextInt();
		
	
		
		
		
switch(ch) {
		//binary  for integer
		case 1:
			System.out.println("Enter the search key : ");
			int arr[]=new int[]{1,2,3,4,5,6};
			int element=sc.nextInt();
			Utility.binarySearch_string(arr,element);
			
			break;
	//Binary Search for String....................		
		case 2:
		
sc=new Scanner(System.in);
			String str[]= {"akay","bobby","chetan","kunal","raviraj","Sunny"};
			System.out.println("Enter the Search key: ");
			String key=sc.nextLine();
			
			//Utility function calling......
			int result=Utility.binarySearch(str,key);
			
			if(result==-1) {
				System.out.println("Element not found in List.....");
			}
			else {
				System.out.println("Element found at position : "+result);
			}
			
			break;
		//insrtion integer
			case 3:
				
				int arr1[]=new int[] {12,5,24,62,2};
				//function calling
					Utility.insertionsort(arr1);
					System.out.println("Array After Sort : ");
					Utility.printArray(arr1);
				break;
		
				
				
		//Insertion sort for String
			case 4:
			
			String str1[]= {"Atlanta","New York","Los Angalese","Omaha","SanFrancisco"};
			int count=str1.length;
		//Uitlity function calling
			String[] sortedArray=Utility.sort_stub(str1,count);	
		System.out.println("After Sorting: ");	
		for(int i=0;i<sortedArray.length;i++) {
				System.out.println(sortedArray[i]);
		}
			break;
		//bubble
		case 5:
			Utility.bubbleSort();
			break;
		
		case 6:
			//Bubble sort for String
			Utility.bubbleSort_string();
			break;
		
		}
	}while(ch!=7);

}
}


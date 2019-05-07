package com.bridgelabz.algorithms;
//import java.util.Scanner;
//Understand the overall program
public class Merge {
//Input values
//private static Scanner sc;
public static int Array[];
public static int tempArray[];
	
	public static void main(String[] args) {
		int arr[]=new int[]{84,95,78,12,45,65,5};
		int len=arr.length;
		//sc=new Scanner(System.in);
		System.out.print("Array is = ");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]+" ");
		}
System.out.println("Length = "+len);
sort(arr);
System.out.println("Sorted array..");
for(int u:arr) {
	System.out.print(u+", ");
}
	}
	
//Sorting function
private static void sort(int[]Input) {
		Array=Input;
		int len1=Input.length;
		tempArray=new int[len1];
		divide(0,len1-1);
	}

//Divide function
public static void divide(int low,int high) {
		if(low<high) {
			int mid=(high+low)/2;
			divide(low,mid);
			divide(mid+1,high);
			merge_array(low,mid,high);
		}
	}
//merge arary
	public static void merge_array(int lower,int mid1,int high1) {
		for(int i=lower;i<=high1;i++) {
			tempArray[i]=Array[i];
		}
		int i= lower;
		int middle=mid1+1;
		int k=lower;
		//for(int u:Array)
		while(i<=mid1 && middle<=high1) {
			if(tempArray[i]<tempArray[middle]) {
				Array[k]=tempArray[i];
				i++;
			}
			else {
				Array[k]=tempArray[middle];
				middle++;
			}
			k++;
		}
		while(i<=mid1) {
			Array[k]=tempArray[i];
			i++;
			k++;
		}
			
	}

}

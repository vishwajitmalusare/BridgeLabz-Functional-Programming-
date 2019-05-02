package com.Algorithm;
import java.util.Scanner;

public class Anagram {
private static Scanner sc;
	
	//Main function
	public static void main(String[] args) {
		String str,str1;
		sc=new Scanner(System.in);
		System.out.println("Enter the strings to check anagram : ");
		str=sc.nextLine();
		str1=sc.nextLine();
		isAnagram(str,str1);
}
	
	//Anagram function
	public static void isAnagram(String str2,String str3) 
	{
		int size1=str2.length();
		int size2=str3.length();
		char []arr=str2.toUpperCase().toCharArray();
		char []arr1=str3.toUpperCase().toCharArray();
if(size1==size2) {
			sort(arr,size1);
			sort(arr1,size2);
			String x=new String(arr);
			String y= new String(arr1);
			System.out.println("String after sorting : "+x);
			System.out.println("String after sorting : "+y);
			
			int is_anagram=x.compareTo(y);
			if(is_anagram==0) {
				System.out.println("\nStrings are anagram.......");
			}
			else {
				System.out.println("\nString is not an anagram...!!");
			}
		}
else {
			System.out.println("Length is differrent its definatly not an anagram......");
		}

	}
	
	//bubble sort function for string
	public static void sort(char[] arr3,int size) {
		char temp;
		for(int i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr3[i]>arr3[j]) {
					temp=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=temp;
				}
			}
		}
	}

}

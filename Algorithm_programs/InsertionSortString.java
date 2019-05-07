package com.bridgelabz.algorithms;
import com.bridgelabz.utility.Utility;
public class InsertionSortString {

	public static void main(String[] args) {
String str[]= {"Atlanta","New York","Los Angalese","Omaha","SanFrancisco"};
	int count=str.length;
String[] sortedArray=Utility.sort_stub(str,count);	
System.out.println("After Sorting: --->>");	
for(int i=0;i<sortedArray.length;i++) {
		System.out.println(sortedArray[i]);
	}
	}
}

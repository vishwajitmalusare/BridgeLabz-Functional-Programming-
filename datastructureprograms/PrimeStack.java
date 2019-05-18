package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.UtilityDataStructure;
import com.bridgelabz.datastructure.UtilityDataStructure.Stack;
public class PrimeStack {

	public static void main(String[] args) {
		
		UtilityDataStructure util=new UtilityDataStructure();
		Stack<Integer> stack1=util.new Stack<Integer>();
		int[] arr1=util.isPrime();
		char[] anag=util.isAnagram(arr1);
		for (int i = 0; i < anag.length; i++) {
			
			stack1.push(anag[i]);
		}
		int size=stack1.size();
		for (int i = 0; i < size; i++) {
			{
			System.out.println(stack1.pop());
			}
		}
	}

}

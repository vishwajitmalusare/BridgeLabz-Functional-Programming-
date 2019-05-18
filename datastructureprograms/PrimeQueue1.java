package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.UtilityDataStructure.Queue;
import com.bridgelabz.datastructure.UtilityDataStructure;

public class PrimeQueue1 {

	public static void main(String[] args) {
		try {
		Queue<Integer> q= new Queue<Integer>();
		boolean t=false;
		int[] arrn =new int[200];
		int count=0;
		int[] arr=UtilityDataStructure.isPrime();
		for(int i=0;i<arr.length;i++) {
			String s=Integer.toString(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
			
			if(arr[j]==arr[i]) {
				continue;
			}
			String s1=Integer.toString(arr[j]);
			t=UtilityDataStructure.isAnagram(s,s1);
			if(t==true) {
				arrn[count]=arr[i];
				count++;
				arrn[count]=arr[j];
				count++;
			}
			}
			};
			for(int i=0;i<arrn.length;i++) {
				q.enqueue(arrn[i]);
			}
			System.out.println(q);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

}

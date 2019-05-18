package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.UtilityDataStructure;

public class PrimeQueue {

	public static void main(String[] args) {
		try {
		boolean t=false;
		int count = 0;
		int[] arrn = new int[168];//to store

		UtilityDataStructure util=new UtilityDataStructure(); // creating utility class object
		int[] arr=util.isPrime();// collecting prime numbers
// Printing prime		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		for (int i = 0; i < arrn.length; i++) {	//loop to add elements to queue
			util.queue.enqueue(arrn[i]);		// adding elements to queue
		}
		System.out.println(util);
//		for (int i = 0; i < arrn.length; i++) {
//			util.queue.dequeue();			// removing elements from queue
//	}
		}catch(Exception e) {
		e.printStackTrace();
		}
		}

}

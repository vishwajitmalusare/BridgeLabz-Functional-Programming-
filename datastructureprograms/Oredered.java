package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelabz.utility.Utility;

public class Oredered {

	public static <T> void main(String[] args) {
		
		
		try {
			/*
			 * taking file as input
			 */
			BufferedReader br = new BufferedReader(new FileReader("/home/user/eclipse-workspace/Functional_Programs/src/com/bridgelabz/datastructure/vwx.txt"));
			try {
				/*
				 * reading data
				 */
				   String str=br.readLine();
				   /*
				    * split the file string 
				    */
				   
				   String []obj=str.split(" ");
				   int array[] = new int[obj.length];
				   /*
				    * converting string array as integer array 
				    */
				 for(int i=0;i<obj.length;i++) {
					 array[i]=Integer.parseInt(obj[i]);
				 }
				 
				    int n=array.length;
				    System.out.println("File Input");
				   for(Object p:array) {
					   System.out.print(p+" ");
				   }
				   /*
				    * Here we are sorting the array 55
				    */
				   int temp;
					for(int i=0;i<n-1;i++) {
						for(int j=i+1;j<n;j++) {
							if(array[i]>array[j]) {
								temp=array[i];
								array[i]=array[j];
								array[j]=temp;
							}
						}
					}
					System.out.println();
					System.out.println("Order Linked List ....!!!");
					
					/*
					 * here we are creating obj
					 */
					List <Integer>Al=new List<Integer>();
					
					for(int i=0;i<array.length;i++) {
						Al.Add1(array[i]);
					}
					br.close();
					Al.Show();
					System.out.println("Linked List Size is : "+Al.Size());
					System.out.println();
					System.out.println("Search the Number...!!! ");
					int Number=Utility.scan.nextInt();
					
					
					if(Al.Search((Integer)Number)) {
						int rem=Al.Index((Integer) Number);
						System.out.println("Position of Element In list "+rem);
						Al.Remove(rem);
						Al.Show();
						System.out.println("Remove Number is : "+Number);
						System.out.println();
						System.out.println("Linked List Size is : "+Al.Size());
						Al.OrderedList();
						
					}else {
						System.out.println("Number Added : "+Number);
						
						Al.Add1(Number);
						Al.Show();
						System.out.println("Linked List Size is : "+Al.Size());
						System.out.println();
						Al.OrderedList();
					}
					
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

package com.Algorithm;

import com.utility.Utility;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BinarySearch {
	
	static Scanner sc;
	
	
	
	public static void main(String[] args) throws IOException {
		//Reading File 
	int count=0;
		File file=new File("/home/user/xyz.txt");
		sc=new Scanner(System.in);
		sc=new Scanner(file);
		int len=(int)file.length();
		String words[]=new String[len];
		
		while(sc.hasNext()) {
			String str=sc.next();
			words[count]=str;
			count++;
		}
		System.out.println("Words from Wordlist ");
		for(int i=0;i<count;i++) {
			System.out.println(""+words[i]);
		}
		//Binary search for String.................
		
		System.out.println("Enter the Search key: ");
		String key1=sc.nextLine();
		
		//Utility function calling......
		int result=Utility.binarySearch(words,key1);
		
		if(result==-1) {
			System.out.println("Element not found in List.....");
		}
		else {
			System.out.println("Element found at position : "+result);
		}
		}
	
	}
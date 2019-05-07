package com.bridgelabz.algorithms;

public class ExtendedPrimeNo {

	public static void main(String[] args) {
//Input data 
		//understand it very well................................
		int i,l,g,j,k=0;
		int arr[]=new int[1000];
		boolean isPrime=false;
		
		//Prime number
		for(i=2;i<=1000;i++) {
			for(j=2;j<i;j++){
				if(i%j==0) {
					isPrime=false;
					break;
					}
				else {
					isPrime=true;
				}
			}
			if(isPrime==true){
				System.out.println("prime numbers: "+i);
				g=isPallindrom(i);
				if(g==0) {
				continue;
				}
				else {
				arr[k]=g;	
				k++;
			}
			}
		}
		for (l = 0; l < k; l++) {
			//functionality to print only 2 digit number as pallindrom
			int count=0,number=arr[l];
			while(number!=0){
				number=number/10;
				count++;
			}
			//to print pallindrome 
			if(count>1) {
		System.out.println(" (Prime)Pallindrome--> "+arr[l]);
			}
		}
	}

	//Pallindrom finding
	private static int isPallindrom(int i) {
		int temp,n=0,rem;
		temp=i;
		while(i>0) {
			rem=i%10;
			i/=10;
			n=n*10+rem;
		}
		if(temp==n)
		return n;
		else 
			return 0;
	}

}


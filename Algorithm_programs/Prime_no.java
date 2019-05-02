package com.Algorithm;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
boolean isPrime=false;

//functionality
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
		System.out.println(i);
	}
}
	}

}

package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {
public static Scanner scan=new Scanner(System.in);

//---------------------------------Binary Search for String method---------------------------------------------------
	public static int binarySearch(String words1[],String key) {
		int l=0,r=words1.length-1;
	
		
		while(l<=r) {
	int	mid=l+(r-l)/2;
			int res=key.compareTo(words1[mid]);
			if(res==0) {
				return mid+1;//i adjusted the result
			}
			if(res>0) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return -1;
	}

	
	
//-------------------------------Binary Search for Integers------------------------------------------
	
public static void binarySearch_string(int list[],int key1) {
		
		int l=0,r=list.length-1;
	
		while(l<=r) {
	int	mid=l+(r-l)/2;
	
			if(list[mid]==key1) {
				System.out.println( "Element found at pos : "+mid);
			}
			if(list[mid]<key1) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
			}
	
	

//---------------------------------Insertion sort for String -----------------------------------------
public static String[] sort_stub(String arr[],int f) {
	String temp="";
	for(int i=0;i<f;i++) {
		for(int j=i+1;j<f;j++) {
			if((arr[i].compareToIgnoreCase(arr[j])>0)) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}



//---------------------------------------------Insertion Sort  for Integer------------------------------------

public static void insertionsort(int arr2[]) { 
    { 
        int n = arr2.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr2[i]; 
            int j = i - 1; 
/* Move elements of arr[0..i-1], that are  greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && arr2[j] > key) { 
                arr2[j + 1] = arr2[j]; 
                j = j - 1; 
            } 
            arr2[j + 1] = key; 
        } 
    } 
  
}
public static void printArray(int arr1[]) 
{ 
    int n = arr1.length; 
    for (int i = 0; i < n; ++i) 
        System.out.print(arr1[i] + " "); 

    System.out.println(); 
} 


//----------------------------------Bubble Sort for Integer-----------------------------------------
public static void bubbleSort() {
int j,i,n=0,temp=0;

System.out.println("Enter Number of elements:");

scan= new Scanner(System.in);
n=scan.nextInt();
int arr[]=new int[n];
//Number of elements

System.out.println("Enter the elements:");
for(i=0;i<n;i++){
arr[i]=scan.nextInt();
}

//Accepting elements
System.out.println("Elements after sorting: ");
for(i=0;i<n;i++) {
System.out.println(arr[i]+" ");
}

//Sorting logic

for(i=0;i<n;i++) {
for(j=i+1;j<n;j++) {

if(arr[i]>arr[j]) {
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
}
}

//output printing
System.out.println("Array after Sorting :");
for(i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
}


//-------------------Bubble sort function for string-----------------------------
public static void bubbleSort_string() {
String str[]= {"Akay","Nilesh","Lalit","Omkar","Sachin"};
int len=str.length;



//Sorting logic
String temp="";
//int j=1;
for(int i=0;i<len;i++) {
	for(int j=i+1;j<len;j++) {
		if((str[i].compareTo(str[j])<0)) {
			temp=str[i];
			str[i]=str[j];
			str[j]=temp;
		}
	}
}
System.out.println("After Sorting: ");	
for(int i=0;i<len;i++) {
	System.out.println(str[i]);
}
}


//------------------------------------Temperature Conversion-------------------------------------------
public static void tepreatureConversion(int ch1) {

	if(ch1==0) {
		System.out.println("Enter tempreature in Celsious : ");
		double a=scan.nextDouble();
		double  fahr=a*1.8+32;
		System.out.println("Tepreature in Fahrenhiet: "+fahr);

	}
	else{
		System.out.println("Tempreature in Fahrenheit : ");
		double a=scan.nextDouble();
		double  cel=a-32*0.5556;
		System.out.println("Tepreture in Degree Celsious: "+cel);
	}
}



//-----------------------------------Binary Search for Question asking ---------------------------
public static void binarySearch_algo(int l1,int r1,int mid1) {
	char ch;
	System.out.println(mid1+" Is the number you are thinking about ?(Y/N)");
	ch=scan.next().charAt(0);
	if(ch=='y'||ch=='Y') {
		System.out.println("So number you are thinking is : "+mid1+" ! ! !");
	}
	else if(ch=='n'||ch=='N'){
		
	System.out.println("Number you are thinking is Greater ? (Y/N)");
	ch=scan.next().charAt(0);
	
	if(ch=='Y'||ch=='y') {
		l1=mid1+1;
		mid1=findMid(l1,r1);
		binarySearch_algo(l1,r1,mid1);
	}
	else if(ch=='N'||ch=='n'){
		r1=mid1-1;
		mid1=findMid(l1,r1);
		binarySearch_algo(l1,r1,mid1);

	}

		}
}

public static int findMid(int l,int r) {
	int mid=l+(r-l)/2;
	return mid;
}

//-----------------------------------------------------------------------------------------

/*
Coupon Collection programs
functionality to collect the unique coupons
*/	
public static int collect(int n) {
	boolean[] isCollected= new boolean[n];
	int count=0;
	int distinct=0;
	
	while(distinct<n) {
		int value=getCoupon(n);
		//System.out.println("Values given by random function: "+value);
		count++;
			
		if(!isCollected[value]) {
			distinct++;
			isCollected[value]=true;
			//System.out.println("Unique coupon values: "+value); //onl printing
		}
	}
	return count;
}

/* Random function
*/
public static int getCoupon(int n)
{
	int ran= (int)(Math.random()*n);
	return ran;
}

//------------------------------------------------------------------------------------------
/*
 * Distance calculation
 * */
public static void calculateDistance(int a,int b) {
	
	
	//Calculating the Distance 
	double res=Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
//display output
System.out.println("Distance= "+res );
	}



//-----------------------------------------------Flip Coin----------------------------------------
public static void flipCoin() {
	//variable declaration and initialization
	int heads=0,tails=0,trails,i;
	float per_heads=0f,per_tails=0f;
	
	//accepting the trails
	System.out.println("Number of trails are= ");
	trails=scan.nextInt();
	
	//generate heads and tails and calculate the count and percentage
	for(i=0;i<trails;i++) {
		if(Math.random()<0.5) {
			tails++;
		}
		else{
			heads++;
		}
		
	}
	per_heads=(heads*100)/trails;
	per_tails=(tails*100)/trails;
	System.out.println("Number of Heads= "+heads);
	System.out.println("Number of Tails= "+tails);
	System.out.println();
	//Work on percentage calculation!!!!!!
	System.out.println("Percentage of head= "+per_heads+"%");
	System.out.println("Percentage of tails= "+per_tails+"%");
	}


//--------------------------------Day of Week---------------------------------------------------------
public static int dayOfWeek(int d,int m,int y) {

	int x= y + y/4 - y/100 +y/400;
	y= y-(14-m)/12;
	m= m+12*((14-m)/12)-2;
	d=(d+x+(31*m)/12)%7;
	//System.out.println(d);
	String days[]= {"Sunday","Monday","Tuseday","Wendesday","Thursday","Friday","Saturday"};
	System.out.println(days[d]);
	return d;
}
//--------------------------------Monthly Payment--------------------------------------------
public static void monthlyPayment(){
	System.out.println("Enter P: ");
int P=scan.nextInt();
System.out.println("Enter Y ");
int Y=scan.nextInt();
System.out.println("Enter R");
int R=scan.nextInt();

int r=R/12*100;
System.out.println("Value of r = "+r);
int n=12*Y;
System.out.println("Value of n = "+n);

int payment=(P*r)/((1-(1+r))^(-n));

System.out.println("Payment = "+payment);
}
//---------------------------------------square root----------------------------------
public static void sqrt() {
	System.out.println("Enter value :");
	double c=scan.nextDouble();
	double t=c;
	double epsilon=1e-15;
	while(Math.abs(t-c/t)>epsilon*t) {
	
		t =	(c/t + t)/2.0;
	}
	System.out.println(t);
}

//--------------------------------------------toBinary---------------------------------------
public static int[] toBinary(int mNumber) {
	int i=0;
	int mInteger=mNumber;

	int array[]=new int[8];
	int array1[]=new int[8];
	
	while(mInteger>0) {
	 array[i]=mInteger%2;
		mInteger/=2;
		i++;
	}
	System.out.println("Binary number is : ");
	for(int j=0;j<array.length;j++) {
		System.out.print(array[array.length-j-1]);
		array1[j]=array[array.length-j-1];
	}
return array1;
	}

//-------------------------------------Swap Nibbles---------------------------
public static int[] swapNibble(int array[]) {
	int temp,j=array.length-4;
	for(int i=0;i<4;i++) {
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		j++;
	}
	System.out.println("\n\nAfter Swapping: ");
	for(int i=0;i<8;i++) {
	System.out.print(array[i]);	
	}
	//powerOfTwoSeries(array);
	return array;
}

//-------------------------------------Power of two series----------------------
public static void powerOfTwoSeries(int number) {
//declare and accept command line input
int i;

//checking the condition and apply function
if(number>0 && number<=31) {
	
for(i=1;i<=number;i++) {

int power=(int)Math.pow(2,i);
System.out.println("2^"+i+" = "+power);	
int len=String.valueOf(power).length();
//System.out.println("inside"+digit);
if(len==4) {

if(power%4==0 || power%400==0) {
	System.out.println("Its leap year number : "+power);
}
}
}

}
}

//-------------------------------------Prime----------------------------
public static void isPrime() {
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

//------------------Number anagram-----------------

public static boolean isAnagram(String s, String s1) {
	int l,l1;
	boolean x=false;
	l=s.length();
	l1=s1.length();
	char s2[]=new char[l+1];
	char s3[]=new char[l1+1];
	if(l!=l1) {
		return false;
	}
	else{
		s2=s.toCharArray();
		s3=s1.toCharArray();
		Arrays.sort(s2);
		Arrays.sort(s3);
		
		for(int i=0;i<l;i++) {
			if(s2[i]==s3[i]) {
				x=true;
			}
			else {
				x=false;
				break;
			}
		}
		if(x==true) {
			System.out.println("Is anagram ");
			//Print the number in the format
			for(int i=0;i<l;i++) {
				System.out.print("num1="+s2[i]);
			}
			System.out.println();
			for(int j=0;j<l1;j++) {
				System.out.print("num2="+s3[j]);
			}
			return true;
		}
		else {
			System.out.println("Is not an anagram... ");
			return false;
		}
	}
}

//class s bracket	
}

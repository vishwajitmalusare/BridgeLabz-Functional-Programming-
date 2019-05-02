package Functional_program;

import java.util.Scanner;
public class LeapYear {
	private static Scanner sc;

		public static void main(String[] args) {

	int year=0,digit=0;

System.out.println("Enter the Year:");
sc = new Scanner(System.in);
year=sc.nextInt();

int number=year;


//Checking where the entered year is 4 digit or not
while(number!=0){
	number=number/10;
	digit++;
}



//Checking for Leeap Year
if(digit==4) {
if((year%4==0 && year%100!=0)||year%400==0){
	
	System.out.println("Leap Year..");
	
}

else{
	System.out.println("not leap year...");
}
}
else {
	System.out.println("Enter Four digit year only !!!");
}
	}
}

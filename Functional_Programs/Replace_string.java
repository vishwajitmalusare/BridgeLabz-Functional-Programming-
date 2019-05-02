package Functional_program;

import java.util.Scanner;
public class Replace_string {

	private static Scanner scanner1;

	public static void main(String[] args) {
		
		//Declare and initialize variables
		String username,replacedString="";
		String input_string="Hello UserName, How are you ? ";
		
		//Print the messages if you want
		System.out.println("The String before replace : "+ input_string);
		System.out.println("Enter Name here:");
		
		scanner1 = new Scanner(System.in);
		username=scanner1.nextLine();
	
		//check the condition
		if(username.length()<=3){
			System.out.println("enter string which have length at least 3...");
		}
		
		//replace the string
		else {
replacedString=input_string.replace("UserName",username);
	System.out.println(""+replacedString);
	}
}
}

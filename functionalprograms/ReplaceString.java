/**
 * @ProblremSatatement: User Input and Replace String Template “Hello <<UserName>>, How are you?”
 * Take User Name as Input. Ensure UserName has minimum 3 character Replace <<UserName>> with the proper name
 * Print the String with User Name
 * @author : Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;
/**
 * This class is written to perform the string replace operation*/
public class ReplaceString {

	public static void main(String[] args) {
		
		//input_String stores the string on replace operation is performed
		String username,replacedString="";
		String input_string="Hello UserName, How are you ? ";
		
		System.out.println("The String before replace : "+ input_string);
		System.out.println("Enter Name here:");
		
		username=Utility.scan.nextLine();
	
		//This condition statement is check the digit length
		if(username.length()<=3){
			System.out.println("enter string which have length at least 3...");
		}
		
		else {
replacedString=input_string.replace("UserName",username);
	System.out.println(""+replacedString);
	}
}
}

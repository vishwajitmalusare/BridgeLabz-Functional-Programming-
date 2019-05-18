/**
 * Problem Statement:Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our 
 * system. your contact number is 91­xxxxxxxxxx.Please,let us know in case of any clarification Thank you BridgeLabz
 *  01/01/2016.Use Regex to replace name, full name, Mobile#, and Date with proper value.
 *  
 *  Author: Vishwajeet Malusare
 **/
package com.jsonprograms;

import java.util.regex.Pattern;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
/**
 * This class is written for replace object using regex in java  
 * */
public class RegexDemonstration {

	public static void main(String[] args) {
		//This variable store the input string
		String mInputString = "Hello <<name>>, We have your full name as <<fullname>> in our system. your contact "
				+ "number is +91 xxxxxxxxxx.Please, let us\nknow in case of any clarification Thank You BridgeLabz"
				+ " 01/01/2016.";
		System.out.println(mInputString);
		
		System.out.println("Enter name: ");
		String firstName=JsonUtil.scan.next();
		
		System.out.println("Enter last name: ");
		String lastName=JsonUtil.scan.next();
		
		String fullName= firstName+" "+lastName;
		
	
		if(Pattern.matches("[a-zA-Z]+", firstName)) {
			mInputString=mInputString.replaceAll("<<name>>", firstName);
			mInputString=mInputString.replaceAll("<<fullname>>", fullName);
		}
		System.out.println("Enter the mobile number: ");
		String mobileNo=JsonUtil.scan.next();
		
		if(Pattern.matches("[789][0-9]{9}", mobileNo)) {
			mInputString=mInputString.replaceAll("x{10}", mobileNo);
		}
		System.out.println("Enter Date: ");
		String Date=JsonUtil.scan.next();
		//work on curren date.....................Its not done
//		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("DD/MM/YYYY");
//		LocalDate currentDate=LocalDate.now();
		String day=Date;
		//System.out.println(day=dtf.format(currentDate));
		
		if(Pattern.matches("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?([0-9][0-9])", day)) {
			mInputString=mInputString.replaceAll("01/01/2016",day);
		}
		System.out.println(mInputString);

	}

}
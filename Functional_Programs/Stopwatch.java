/**
 * @ProblremStatement: Simulate Stopwatch Program Write a Stopwatch Program for measuring the time that elapses 
 * between the start and end clicks. Start the Stopwatch and End the Stopwatch Measure the elapsed time between 
 * start and end Print the elapsed time.
 * @author: Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;
/**
 * This class is written to simulate stopwatch 
 * */
public class Stopwatch {
	//Variables used to store start and end time
	static long starttime;
	static long stoptime;
	public static void main(String[] args) {
		//Stopwatch sw=new Stopwatch();
		System.out.println("enter 1 to start the time");
		Utility.scan.nextInt();
		starttime=starttime();
		System.out.println("enter 2 to stop the time");
		Utility.scan.nextInt();
		stoptime=stoptime();
		Utility.scan.close();
		System.out.println("elapsed time is");
		System.out.println((Stopwatch.stoptime-Stopwatch.starttime)/1000);
	}
	/**
	 * This method is written to find the start time
	 * */
	public static long starttime()							//to start a time 
	{
		
		return System.currentTimeMillis();
	}
	/**
	 * This method is written to find the end time */
	public static long stoptime()							//to stop the time
	{
		
		return System.currentTimeMillis();
	}
}

/**
 * @problem statement: Simulates a gambler who start with $stake and place fair $1 bets until 
 * he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins 
 * and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out. 
 * $Stake, $Goal and Number of times Play till the gambler is broke or has won 
 * Print Number of Wins and Percentage of Win and Loss.
 * @author : Vishwajeet Malusare
 * */
package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;;
/**
 * This class is written for showing a bit of gambler game
 * */
public class Gambler {
	
	/**
	 * This function return a value in between 1-6
	 * */
	public static int random() {
		double ran=Math.random();
		int ran_int=(int)(ran*6.0)+1;
		return ran_int;
	}
		
	public static void main(String[] args) {

		/**Only taking a positive integer as an input*/
		try {
		//This variable stores value of stake goal and trails
		int stake,goal,trails;
		int wins=0,bets=0,lose=0;
		
		
		System.out.println("Enter Stake, Goal, trails ");
		stake=Utility.scan.nextInt();
		goal=Utility.scan.nextInt();
		trails=Utility.scan.nextInt();
		
	
		// loop is running till trails given by user is getting 0
	
		while(trails!=0) {
			System.out.println("Enter Your Dice Number:-> ");
			int ch=Utility.scan.nextInt();
			
			if(ch<=6) {
			// variable r stores the value return by random() method
			int r = random();
			
			//Checking  for win or lose
			if(r==ch) {
				System.out.println("Winner....");
				wins++;
				stake++;
				
			}
			else {
				System.out.println("Lose...!!");
				lose++;
				stake--;
			}
			trails--;
			bets++;
			//Check for the all conditions of Game over
			if(stake==goal||stake==0||trails==0) {
				System.out.println("\nGame Over....");
				break;
			}
		}
			else {
				System.out.println("Enter Value in between 1 to 6");
				
			}
		}
		
		
		//Output Section
//System.out.println("Percentage of Wining: "+100*wins/ trails);
System.out.println("\nNumber of bets: "+bets);
System.out.println("Percentage of Wins:"+(wins/trails)*100);//Percentages are not calculated...showing nothing
System.out.println("Number of lose "+lose);
System.out.println("Number of Wins:"+wins);

		}catch(Exception e) {
			System.out.println("Aceepts only positive integers: "+e);
		}
		}


}
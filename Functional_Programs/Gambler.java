package Functional_program;

import java.util.Scanner;

public class Gambler {
  static Scanner sc;
		
	public static void main(String[] args) {

		//Input related work
		int stake,goal,trails;
		int wins=0,bets=0,lose=0;
		sc=new Scanner(System.in);
		
		System.out.println("Enter Stake, Goal, trails ");
		stake=sc.nextInt();
		goal=sc.nextInt();
		trails=sc.nextInt();
		
	
		//Actual functioning
		//main loop
		while(trails!=0) {
			System.out.println("Enter Your Dice Number:-> ");
			int ch=sc.nextInt();
			
			if(ch<=6) {
			//return value
			int r = Randm();
			System.out.println("Random values="+r);
			
			//Checking choice with random value
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
			if(stake==goal||stake==0||trails==0) {
				System.out.println("Game Over....");
				break;
			}
		}
			else {
				System.out.println("Enter Value in between 1 to 6");
				
			}
		}
		
		
		//Output Section
//System.out.println("Percentage of Wining: "+100*wins/ trails);
System.out.println("Number of bets: "+bets);
System.out.println("Percentage of Wins:"+(wins)/trails);//Percentages are not calculated...showing nothing
System.out.println("Number of lose "+lose);
System.out.println("Number of Wins:"+wins);

	}

	//redefine function
	public static int Randm() {
		double ran=Math.random();
		int ran_int=(int)(ran*6.0)+1;//try calculation for generate values 1-6..IMP
		return ran_int;
	}
}



//Lookout for real gambler game...??
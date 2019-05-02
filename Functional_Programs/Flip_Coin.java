package Functional_program;

import java.util.Scanner;
public class Flip_Coin {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable declaration and initialization
		int heads=0,tails=0,trails,i;
		float per_heads=0f,per_tails=0f;
		
		//accepting the trails
		System.out.println("Number of trails are= ");
		sc = new Scanner(System.in);
		trails=sc.nextInt();
		
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

}

/**
 *@ProblemStatement: Write a Program DeckOfCards.java , to initialize deck of cards having suit ("Clubs",
 *"Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace").
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by 
 * the 4 Players using 2D Array...
 * @author :Vishwajeet Malusare
 * */
package com.jsonprograms;

/**
 * This class is written to get the deck of cards
 * */
public class DeckOfCards {

	public static void main(String[] args) {
		/**
		 * This block gives the total cards
		 * */
		String suits[]= {"Diamond","Hearts","Spades","Club"};
		String ranks[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		
		int count=0;
		//len variable is store the length calculated by multiplying suits and cards
		int length=suits.length*ranks.length;
		String deck[]=new String[length];
		
		//This block written to find the total cards of each type
		for(int i=0; i<ranks.length;i++) {
			System.out.println();
			for(int j=0;j<suits.length;j++) {
				deck[suits.length*i+j]=ranks[i]+" of "+suits[j];
				System.out.println(deck[suits.length * i+j]);
				count++;
			}
		}
		System.out.println("\nTotal cards are : "+count);
	
		//This block is written shuffled cards
		System.out.println();
		System.out.println();
		for(int i=0;i<length-1;i++) {
			int r= i+(int)(Math.random()*(length-i));
			
			String temp=deck[r];
			deck[r]=deck[i];
			deck[i]=temp;
		}
		//This block is written to get the suite and rank value in deck[]
		String[][]p=new String[13][4];
		int count1=0;
		for(int i=0;i<13;i++) {
			for(int j=0;j<4;j++) {
				if(count1==deck.length)
					break;
				p[i][j]=deck[count1];
				count1++;
			}
		}
		//This block is used to distribute the card in between 4 players
		int play=1;
		while(play<5) {
			for(int i=0;i<4;i++) {
				System.out.println("\nFor player "+play+" --->>");
			for(int j=0;j<9;j++) {
				System.out.println(p[j][i]);
			}
			play++;
			}
			}
			
	}

}

/**
 *@ProblemSatatement: Extend the above program to create a Player Object having Deck of Cards, and having ability 
 *to Sort by Rank and maintain the cards in a Queue implemented using Linked List. Do not use any Collection Library.
 * Further the Player are also arranged in Queue. Finally Print the Player and the Cards received by each Player.
 * @author : Vishwajeet Malusare
 * */
package com.jsonprograms;



public class DeckOfCard2 {

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
		bubbleSort_string(ranks);
	}
		
	public static void bubbleSort_string(String[] ranks) {
		String str[]= ranks;
		int len=str.length;



		//Sorting logic
		String temp="";
		//int j=1;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if((str[i].compareTo(str[j])>0)) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println("\nAfter Sorting: ");	
		for(int i=0;i<len;i++) {
			System.out.print("["+str[i]+"]");  //Print the sorted array
			//String str2=str[i];
		}
		}

			
		

}

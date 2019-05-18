/**
 *@ProblemSatatement: Extend the above program to create a Player Object having Deck of Cards, and having ability 
 *to Sort by Rank and maintain the cards in a Queue implemented using Linked List. Do not use any Collection Library.
 * Further the Player are also arranged in Queue. Finally Print the Player and the Cards received by each Player.
 * @author : Vishwajeet Malusare
 * */
package com.jsonprograms;

import com.jsonprograms.QueueList;


public class DeckOfCard2 extends DeckOfCards { 			//extending the DeckOfCards class

	public static void main(String args[]) {
		DeckOfCards deck = new DeckOfCard2();
		
		deck.getCards();
		deck.shuffleCard();

		String playerCards[][] = deck.distribute(4, 9);
		
		int i = 1;
	
		for (String[] playerCard : playerCards) {

			System.out.println();
			System.out.print("player :" + (i++) + "\n cards : ");
			for (String card : playerCard) {

				QueueList<Object> q = new QueueList<Object>();
				q.enqueue(card);//store it into the queue
				System.out.print("["+card+"]");
			}
			System.out.println();

		}
		

	}

}

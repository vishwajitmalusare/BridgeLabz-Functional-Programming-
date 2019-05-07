package com.bridgelabz.datastructure;

//import com.bridgelabz.datastructure.Queue;

import com.bridgelabz.utility.Utility;

public class Cashcounter {

	public static void main(String[] args) {
		Queue cash=new Queue();
		int ch=0;
		do {
			System.out.println("1.Deposite \n2.Withdraw \n3.Number of people in queue \n4.exit");
			System.out.println("Enter your choice: ");
			ch=Utility.scan.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("deposit amount ?");
				cash.insert(Utility.scan.nextInt());
				break;
			case 2:
				System.out.println("Withdraw amount");
				Utility.scan.nextInt();
				cash.remove();
				break;
			case 3:
				int num =cash.getSize();
				System.out.println("Number of people;");
				break;
			case 4:
				System.exit(0);
				break;
			}
		}while(ch<5);
	}

}

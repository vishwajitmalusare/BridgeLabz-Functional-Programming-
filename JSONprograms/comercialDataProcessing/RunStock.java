/**
 * @ProblemStatemment: Commercial data processing ­ StockAccount.java implements a data type that might be used by 
 * a financial institution to keep track of customer information. The StockAccount class implements following methods
 * The StockAccount class also maintains a list of CompanyShares object which has Stock Symbol and Number of Shares 
 * as well as DateTime of the transaction. When buy or sell is initiated StockAccount checks if CompanyShares are 
 * available and accordingly update or create an Object.
 * 
 * @author: Vishwajeet malusare
 * */

package comercialDataProcessing;

import java.util.Scanner;

/**
 * This class is written to implement real time comercial data processing
 * */
public class RunStock {

	public static void main(String[] args) {
		boolean value=true;
		while(value)
		{
		System.out.println("!!!!.....Welcome To The Financial Institution.....!!!!");
		System.out.println("Choice the Operation What You want to do....!!!\n 1 > Add Customer Detail \n 2 > Add Company Info & Share \n 3 > Sell Share \n 4 > Buy Share \n 5 > Check Value Of Share \n 6 > Print Customer And Share Detail \n 7 > Exit  ");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Choice....!!!");
		int n=in.nextInt();
		//int i=0;
	
		
		switch(n) {
		case 1: System.out.println("Welcome to the Customer Detail Add System...!!!");
				StockAccount.add();
				break;
		case 2: System.out.println("Welcome to the Company Shares Panel....!!! ");
				StockAccount.addCompany();
				break;
		case 3: System.out.println("Welcome to the Seller Panel....!!! ");
			
				System.out.println("Enter the shares");
				int shares1 = in.nextInt();
				System.out.println("Enter the Symbol");
				String symbol1 = in.next().toUpperCase();
				BuyyerAndSeller.sell(shares1, symbol1);
				break;
		case 4: System.out.println("Welcome to the Buyer Panel....!!! ");
				System.out.println("Enter the shares");
				int shares = in.nextInt();
				System.out.println("Enter the Symbol");
				String symbol = in.next().toUpperCase();
				BuyyerAndSeller.buy(shares, symbol);
		        break;		
		case 5: System.out.println("Welcome to the Check Value Of Share....!!! ");
				double totalValue = StockAccount.valueOf();
				if(totalValue >= 0)
				{
					System.out.println(totalValue);
				}
				break;	
		case 6: System.out.println("Welcome to the Display The All Customer And Share Penale....!!!");
				StockAccount.printReport();
				break;
		case 7: System.out.println("................EXit.................");
		value = false;
		break;
		default:System.out.println("Please Select Right Option....! ");
		in.close();
		}

		}
}
}
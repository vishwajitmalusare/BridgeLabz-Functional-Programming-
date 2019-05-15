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

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class BuyyerAndSeller {
	static Scanner in=new Scanner(System.in);
	static ObjectMapper objectmapper=new ObjectMapper();
	static File customerfile=new File("/home/user/JSONFiles/Customer.json");
	static File companySharefile=new File ("/home/user/JSONFiles/CompanyShares.json");
	
	public static LinkedList<Object>linkedlist=new LinkedList<Object>();
	public static StackList<Object>stackList=new StackList<Object>();
	public static QueueList<Object> queue=new QueueList<Object> ();

	/*****************************************************
	 * 
	 * 
	 */

	public static void list() {

		try {
			List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,new TypeReference<List<CompanyShares>>() {});
			@SuppressWarnings("unused")
			List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {});

			String str = "";
			
			for (int i = 0; i < companySharesList.size(); i++) {
				str = companySharesList.get(i).toString();
				// System.out.println(""+set);
				linkedlist.add(str);

			}

		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}

	}
	
	public static void buy(int amount, String symbol) {
		try {
			List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,new TypeReference<List<CompanyShares>>() {});
			List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {});
			System.out.println("Enter The Person Name ");
			String searchName = in.nextLine().toUpperCase();
			int custIndex = StockAccount.searchCustomerIndex(searchName, customerList);
			int stockIndex = StockAccount.searchSharesBySymbol(symbol, companySharesList);
			String stackSymbol = null;
			CompanyShares companyShares = null;
			if (custIndex != -1) {

				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares - amount);
				stackSymbol = companyShares.getStockSymbol();
				// ls.add(companyShares);

				// System.out.println(stockIndex);
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) {
					int value = customer.getTcsShares();
					customer.setTcsShares(value + amount);
				}
				if (stockIndex == 1) {
					int value = customer.getMahendraShares();
					customer.setMahendraShares(value + amount);
				}
				if (stockIndex == 2) {
					int value = customer.getTataShares();
					customer.setTataShares(value + amount);
				} else {
					System.err.println("Stock Not Found ");
				}
			}
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(companySharefile, companySharesList);
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(customerfile, customerList);

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company_Name", "NO._of Stocks", "Price");
			System.out.println(companySharesList.get(stockIndex).toString());
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "TCS(Shares)", "TATA(Shares)",
					"MAHENDRA(Shares)");
			System.out.println("-------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("Q 6) Here We are Adding CompanyShares Into LinkList");
			System.out.println("==================In LIST==================");
			linkedlist.add(companyShares);
			System.out.println("Company Shares in LIST:");
		     BuyyerAndSeller.list();
		     linkedlist.print();
		     System.out.println("---------------------------------------------");
		     System.out.println("Q 7) Here We are Adding StockSymbol Into Stack");
		     stackList.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST:");
			stackList.print();
			System.out.println("-----------------------------------------------------------------");
			 System.out.println("Q 8) Here We are Adding Date Into Queue");
			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			queue.print();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		/**************************************************************************
		 * 
		 * 
		 * 
		 */
		public static void sell(int amount1,String symbol1) 
		{
			try {
					//companySharesList USE FOR READIING DATA FROM FILE AND STORING IN TO THE LIST
				List<CompanyShares> companySharesList = objectmapper.readValue(companySharefile,new TypeReference<List<CompanyShares>>() {});
				// customerList USE FOR READIING DATA FROM FILE AND STORING IN TO THE LIST
				List<Customer> customerList = objectmapper.readValue(customerfile, new TypeReference<List<Customer>>() {});
				
				

				int stockIndex = StockAccount.searchSharesBySymbol(symbol1, companySharesList);
				System.out.println("Enter The Person Name");
				String searchName =in.nextLine().toUpperCase();
				int custIndex = StockAccount.searchCustomerIndex(searchName, customerList);
				String stackSymbol = "";
				CompanyShares companyShares = null;
				if (custIndex != -1) {
					companyShares = companySharesList.get(stockIndex);
					int noOfShares = companyShares.getNoOfShares();
					companyShares.setNoOfShares(noOfShares + amount1);

					System.out.println("");
					stackSymbol = companyShares.getStockSymbol();
					// ls.add(companyShares);

					// System.out.println(stockIndex);
					Customer customer = customerList.get(custIndex);
					if (stockIndex == 0) {
						int value = customer.getTataShares();
						customer.setTataShares(value - amount1);;
					}
					if (stockIndex == 1) {
						int value = customer.getTcsShares();
						customer.setTataShares(value - amount1);
					}
					if (stockIndex == 2) {
						int value = customer.getMahendraShares();
						customer.setMahendraShares(value - amount1);
					}
				} else {
					System.err.println("stock not found!");
				}

				objectmapper.writerWithDefaultPrettyPrinter().writeValue(companySharefile, companySharesList);
				objectmapper.writerWithDefaultPrettyPrinter().writeValue(customerfile, customerList);

				System.out.println("\n----------Stock Details----------");
				System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
				System.out.println("---------------------------------------------------------------------");
				System.out.println(companySharesList.get(stockIndex).toString());

				System.out.println("\n----------Customer Details----------");
				System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "TCS(Shares)", "TATA(Shares)",
						"MAHENDRA(Shares)");
				System.out.println("----------------------------------------------------------------------");
				System.out.println(customerList.get(custIndex).toString());
				System.out.println("Q 6) Here We are Adding CompanyShares Into LinkList");
				System.out.println("==================In LIST==================");
				linkedlist.add(companyShares);
				System.out.println("Company Shares in LIST:");
			     BuyyerAndSeller.list();
			     linkedlist.print();
			     System.out.println("---------------------------------------------");
			     System.out.println("Q 7) Here We are Adding StockSymbol Into Stack");
			     stackList.push(stackSymbol);
				System.out.println("Company Symbol in STACK LIST:");
				stackList.print();
				System.out.println("-----------------------------------------------------------------");
				 System.out.println("Q 8) Here We are Adding Date Into Queue");
				String str = "";
				Date currentDate = new Date();
				str = currentDate.toString();
				queue.enqueue(str);
				queue.print();
			} catch (IOException e) {
				e.printStackTrace();
			}

		

	}
}

package com.jsonprograms;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;


public class StockAccount  {
	static Scanner in=new Scanner(System.in);
static ObjectMapper objectmapper=new ObjectMapper();
static File customerDetail=new File("/home/user/JSONFiles/Customer.json");
static File customerShare=new File ("/home/user/JSONFiles/CompanyShares.json");

/*****************************************************
 * DESCRIPTION : This Method To add account if dosen't exits
 * return:void
 ******************************************************/
	public static int add() {
		try {
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust Name", "TCS(Shares)", "TATA(Shares)","MAHENDRA(Shares)");
			/******
			 * HERE WE ARE READING OUR FILE IF IT IS HAVING ANY DATA INSIDE THEN WE ARE GOING TO PUT IT ON LIST COLLECTION ARRAY
			 */
			List<Customer> customerList = objectmapper.readValue(new File("/home/user/JSONFiles/Customer.json"),new TypeReference<List<Customer>>() {});
			/**
			 * HERE WE ARE TESTING(PRINTING) IS DATA ARE STORE OR NOT INSIDE THE LIST ARRAY
			 */
			
			for(Object obj:customerList) {
				System.out.println(obj);
			}
			System.out.println("======================================================================");
			
			System.out.println("Enter Customer Name ");
			String customerName = in.nextLine().toUpperCase();
			/**
			 * HERE WE ARE CREATING STOCK ACCOUNT CLASS OBJ FOR ACCESSING INSIDE METHOD OF CLASS STOCK A\C
			 */
			
			/*****
			 * IF SEARCH CUSTOMER INDEX CONDITION IS TRUE THEN WE ARE ADDING NEW CUSTOMER IN FILE 
			 */
			int indexNumber=searchCustomerIndex(customerName, customerList);
			if (indexNumber== -1) {
				/**
				 * HERE WE ARE PASSING THE CUSTOMER NAME & ALL Share Detail
				 * LIKE newCustomer.setCustomerName("Sunil");
				 */
				System.out.println("Enter The TCS Share");
				int tcs=in.nextInt();
				System.out.println("Enter The TATA Share");
				int tata=in.nextInt();
				System.out.println("Enter The Mahendra Share");
				int mahendra=in.nextInt();
				/****************************************************************************************************************
				 * HERE WE ARE ADDING DATA 
				 * we are created one constructor for assign the value for every ,method becoz list having customer class parameter
				 */
				Customer newCustomer = new Customer(customerName,tcs,tata,mahendra);
				
				customerList.add(newCustomer);
				
				
				System.out.println("\nNew Customer added : " + customerName + "\n");
				/***
				 * HERE WE ARE SAVING DATA
				 */
				StockAccount.save("/home/user/JSONFiles/Customer.json", customerList);
				System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "TCS(Shares)", "TATA(Shares)","MAHENDRA(Shares)");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println(customerList.get(searchCustomerIndex(customerName, customerList)).toString());
			} 
			else {
				System.out.println("\nCustomer Already Exist!");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		return 0;
	}
	
	/******************************************************
	 * perpose: To search by name  of CustomerName 
	 * return:int
	 ******************************************************/

	public static int searchCustomerIndex(String searchName, List<Customer> customerList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < customerList.size(); i++)
		{
			count = 0;
			//HERE WE ARE FETCHING ALL INDEX OF LIST 
			String custName = customerList.get(i).getName();
			if(searchName.equals(custName))
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			//System.err.println("Customer not found!");
		}
		//RETURNING THE POSITION  OF INDEX 
		return index;
	}

	public static double valueOf() {
		try {

			//customerList USE FOR READIING DATA FROM FILE AND STORING IN TO THE LIST
			List<Customer> customerList = objectmapper.readValue(customerDetail, new TypeReference<List<Customer>>() {});
			//companySharesList USE FOR READIING DATA FROM FILE AND STORING IN TO THE LIST
			List<CompanyShares> companySharesList = objectmapper.readValue(customerShare,new TypeReference<List<CompanyShares>>() {});
			
			@SuppressWarnings("unused")
			boolean flag=true;
			while(true) {
						System.out.println("Select The Menu Option.....!!!");
						System.out.println("1)Company\n2)Customer\n3)Exit");
	
						System.out.println("Enter Choice....!!!");
							int select=in.nextInt();
							switch (select) {
							/**************************************************************************************************
							 * THIS IS FOR STOCK MARKET
							 */
							case 1:System.out.println("Welcome to the Stock Market...!!!");
								
							System.out.println("Enter Company Symbol :");
							String searchSymbol = in.nextLine().toUpperCase();
							int index = StockAccount.searchSharesBySymbol(searchSymbol, companySharesList);
							if (index != -1) {
								
								
								CompanyShares companyShare = new CompanyShares();
								//here we are providing value to the customer setter and getter method to get share count
								companyShare= companySharesList.get(index);
								/****
								 * @param we are taking all share into the variable for count
								 */
								int noOfShare=companyShare.getNoOfShares();
								int price=companyShare.getPrice();
								int totalShare = noOfShare+ price;
								
								System.out.print("Company\t \t Number Of Shares \t Price  \t\t\t\t\t Date \n"+companyShare.toString());
								System.out.println("Totalshare : "+totalShare);
								System.out.print("\nTotal Value of Stock: ");
								return (double) totalShare*71;
							} else {
								break;
							}
							/**************************************************************************************************
							 * THIS FOR CUSTOMER SHARE INFORMATION
							 */
							case 2:System.out.println("Welcome To the Customer Panel ");
							
							System.out.println("Enter Customer/Person Name :");
							String searchName = in.nextLine().toUpperCase();
							int index1 = StockAccount.searchCustomerIndex(searchName, customerList);
							if (index1 != -1) {
								
								Customer customer = new Customer();
								//here we are providing value to the customer setter and getter method to get share count
								customer = customerList.get(index1);
								/****
								 * @param we are taking all share into the variable for count
								 */
								int tcsShare = customer.getTcsShares();
								int tataShare =  customer.getTataShares();
								int mahendraShare =  customer.getMahendraShares();
								int totalShare = tcsShare+ tataShare + mahendraShare;
								
								System.out.print("Customer\t Share 1 \t  Share 2 \t\t Share 3\n"+customer.toString());
								System.out.println("Totalshare : "+totalShare);
								System.out.print("\nTotal Value of Stock: ");

								return (double) totalShare*71;
							} else {
								break;
							}
							
							case 3:System.out.println("................EXit.................");
							flag = false;		
							default:
								break;
							}
		
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return 0;
	}

	
/**********************************************************************************************************
 * Here we are adding new Company and share detail	
 * @return
 */
	
	public static int addCompany() {
		try {
			System.out.printf("\n%-15s %-20s %-20s %-25s %-20s\n", "Company Name", "\tStock Symbol", "Number of Shares","Price","DateTime");
			/******
			 * HERE WE ARE READING OUR FILE IF IT IS HAVING ANY DATA INSIDE THEN WE ARE GOING TO PUT IT ON LIST COLLECTION ARRAY
			 */
			List<CompanyShares> companyList = objectmapper.readValue(new File("/home/user/JSONFiles/CompanyShares.json"),new TypeReference<List<CompanyShares>>() {});
			/**
			 * HERE WE ARE TESTING(PRINTING) IS DATA ARE STORE OR NOT INSIDE THE LIST ARRAY
			 */
			
			for(Object obj:companyList) {
				System.out.println(obj);
			}
			System.out.println("===============================================================================================");
			
			System.out.println("Enter Stock Symbol ");
			String companySymbol = in.nextLine().toUpperCase();
			/**
			 * HERE WE ARE CREATING STOCK ACCOUNT CLASS OBJ FOR ACCESSING INSIDE METHOD OF CLASS STOCK A\C
			 */
		
			/*****
			 * IF SEARCH CUSTOMER INDEX CONDITION IS TRUE THEN WE ARE ADDING NEW CUSTOMER IN FILE 
			 */
			int indexNumber=searchSharesBySymbol(companySymbol, companyList);
			if (indexNumber== -1) {
				/**
				 * HERE WE ARE PASSING THE CUSTOMER NAME & ALL Share Detail
				 * LIKE newCustomer.setCustomerName("Sunil");
				 */
				System.out.println("Enter The Company Name");
				String companyName=in.nextLine();
				System.out.println("Enter Number Of Share");
				int numberOfShare=in.nextInt();
				System.out.println("Enter Share Price");
				int sharePrice=in.nextInt();
				
				/***
				 * HERE WE ARE ADDING DATA 
				 * we are created one constructor for assign the value for every ,method becoz list having customer class parameter
				 */
				 CompanyShares companyShare=new CompanyShares(companyName,companySymbol,numberOfShare,sharePrice);
				
				
			companyList.add(companyShare);
				
				
				System.out.println("\nNew Company added : " + companyName + "\n");
				/***
				 * HERE WE ARE SAVING DATA
				 */
				StockAccount.saveCompany("/home/user/JSONFiles/CompanyShares.json", companyList);
				
				System.out.printf("\n%-15s %-20s %-20s %-25s %-20s\n", "Company Name", "\tStock Symbol", "Number of Shares","Price","Auto Date");
				System.out.println("-------------------------------------------------------------------------------------");
				System.out.println(companyList.get(searchSharesBySymbol(companySymbol, companyList)).toString());
			} 
			else {
				System.out.println("\nCompany Already Exist!");
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
		return 0;
	}
	

	/*****************************************************
	 * perpose: To search by symbol of comany share
	 * return:int
	 ******************************************************/
	public static int searchSharesBySymbol(String symbol, List<CompanyShares> companySharesList)
	{
		int count = 0;
		int index = -1;
		for(int i = 0; i < companySharesList.size(); i++)
		{
			count = 0;
			String companySymbol = companySharesList.get(i).getStockSymbol();
			if(symbol.compareTo(companySymbol) == 0)
			{
				index = i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count != 0)
		{
			//System.out.println("Customer not found!");
		}
		
		return index;
	}

	/*******************************************************************************************************
	 * HERE WE ARE SAVING THE NEW DATA
	 * @param WE ARE PROVIDING FILE LOCATION AND LIST ARRAY
	 */
	public static void save(String fileName, List<Customer> customerList) {
		try {
			/***
			 * writerWithDefaultPrettyPrinter() 
			 * USING THIS MATHOD WE CAN ABLE TO WRITE FILE LIKE FOLLOWING FORMAT
			 * [ {
  					"name" : "SHIVA",
  					"shivaShares" : 57,
  					"jokerShares" : 68,
  					"ravanaShares" : 30
				}, {
  					"name" : "RAVANA",
  					"shivaShares" : 70,
  					"jokerShares" : 41,
  					"ravanaShares" : 28
			}]
			 */
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), customerList);
		} catch (IOException e) {
			// e.printStackTrace();
		}
	}

	/*******************************************************************************************************
	 * HERE WE ARE SAVING THE NEW DATA of company
	 * @param WE ARE PROVIDING FILE LOCATION AND LIST ARRAY
	 */
	public static void saveCompany(String fileName, List<CompanyShares> companyList) {
		try {
			/***
			 * writerWithDefaultPrettyPrinter() 
			 * USING THIS MATHOD WE CAN ABLE TO WRITE FILE LIKE FOLLOWING FORMAT
			 * [ {
  					"name" : "SHIVA",
  					"shivaShares" : 57,
  					"jokerShares" : 68,
  					"ravanaShares" : 30
				}, {
  					"name" : "RAVANA",
  					"shivaShares" : 70,
  					"jokerShares" : 41,
  					"ravanaShares" : 28
			}]
			 */
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), companyList);
		} catch (IOException e) {
			// e.printStackTrace();
		}
	}

	
	
	/******************************************************************************************
	 * THIS METHOD ARE USE TO PERINT ALL CUTOMER AND STOCK INFORMATION 
	 */
	
	public static void printReport() {
		try {

			List<Customer> customerList = objectmapper.readValue(customerDetail, new TypeReference<List<Customer>>() {});
			List<CompanyShares> companyList = objectmapper.readValue(customerShare, new TypeReference<List<CompanyShares>>() {});
			System.out.println("\n-----------------------------------------Stock Details-----------------------------------------");
			System.out.printf("\n%-15s %-20s %-20s %-25s %-20s\n", "Company Name", "\tStock Symbol", "Number of Shares","Price","DateTime");
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			for(Object obj:companyList) {
				System.out.println(obj);
			}
			System.out.println("===============================================================================================");
			


			System.out.println("\n---------------------------------------Customer Details--------------------------------------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "TCS(Shares)", "TATA(Shares)","MAHENDRA(Shares)");
			System.out.println("-----------------------------------------------------------------------------------------------------------");
			
			for(Object obj:customerList) {
				System.out.println(obj);
			}
			System.out.println("================================================================================================");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

/**
 * Problem Statement: Write a program to read in Stock Names number of share, Share price, Print a stock report with
 * total value of each stock and the total value of stock.
 * 
 * author: Vishwajeet Malusare
 * **/
package com.jsonprograms;

import java.io.File;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * This class is written to maintain the Stock Inventory details
 * */
public class StockInventory {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String path="/home/user/JSONFiles/stock.json";
		ObjectMapper mapper=new ObjectMapper();
		File file=new File(path);
		try {
			JsonNode node=mapper.readTree(file);
			JsonNode value=node.get("Stock");
			System.out.println(" --------------------------------- Stock Report -------------------------------");
			System.out.println();
			for (JsonNode nod : value) {
				String stock_name=nod.get("Stock_Name").asText();
				int no_of_stocks=nod.get("Number_of_Share").asInt();
				int share_price=nod.get("Share_Price").asInt();
				System.out.println("Stock Name\t\t:"+stock_name);
				System.out.println("Number of Shares Are\t:"+no_of_stocks);
				System.out.println("Each Share Price\t:"+share_price);
				System.out.println("total price\t\t:"+(no_of_stocks*share_price));
				System.out.println();
				
			}
		} catch (JsonProcessingException e) {
			
			System.out.println("Error Occured during parsing the Data from file");
		} catch (IOException e) {
			
			System.out.println("Error Occured during parsing the Data from file");
		}
		scan.close();
	}
}
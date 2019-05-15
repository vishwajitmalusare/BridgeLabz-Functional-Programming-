/**
 * @ProblemStetement:Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report 
 * with total value of each Stock and the total value of Stock. N number of Stocks, for Each Stock Read In the 
 * Share Name, Number of Share, and Share Price Calculate the value of each stock and the total value 
 *  Print the Stock Report.
 * @author:Vishwajeet Malusare
 * */
package StockInventry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Scanner;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
/**
 * This class is written for generating Stock report
 * */
public class StockReport {
	public static void main(String[] args) {
		//variable is stores the path of input and output files
		String pathresult="/home/user/JSONFiles/StockOutput.json";
		String path="/home/user/JSONFiles/StockInput.json";
		
		ObjectMapper mapper=new ObjectMapper();
		File file=new File(path);
		File file1=new File(pathresult);
		ArrayList<Object> stock=new ArrayList<>();
		
		try {
			//
			JsonNode node=mapper.readTree(file);
			JsonNode value=node.findPath("Stock");
			
			System.out.println(" --------------------------------- stock report -------------------------------");
			System.out.println();
			for (JsonNode nod : value) {
				String Stock_Name=nod.findPath("Stock_Name").asText();
				stock.add(Stock_Name);
				int Number_of_Share=nod.findPath("Number_of_Share").asInt();
				stock.add(Number_of_Share);
				int Share_Price=nod.findPath("Share_Price").asInt();
				stock.add(Share_Price);
				System.out.println("stock name\t\t:"+Stock_Name);
				System.out.println("number of shares are\t:"+Number_of_Share);
				System.out.println("each share price\t:"+Share_Price);
				long total_price=Number_of_Share*Share_Price;
				stock.add(total_price);
				mapper.writeValue(file1, stock);
				
				System.out.println("total price\t\t:"+(Number_of_Share*Share_Price));
				System.out.println();
				
			}
		} catch (JsonProcessingException e) {
			
			System.out.println("error occured during parsing the data from file");
		} catch (IOException e) {
			
			System.out.println("error occured during parsing the data from file");
		}
	}
}


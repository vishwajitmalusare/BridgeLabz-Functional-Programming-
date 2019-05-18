/**
 * Problem Statement: Create a JSON file having Inventory Details for Rice, Pulses and Wheats
with properties name, weight, price per kg.

Author: Vishwajeet Malusare
 **/

package com.jsonprograms;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
/*Jackson realated packages*/
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
@SuppressWarnings("serial")
/**
 * This class is written for maintain the inventory details 
 * */
public class GrainInventory implements Serializable{

	public static void main(String[] args)  {
	
	ObjectMapper mapper=new ObjectMapper();	// creation of object mapper reference
									// for file reference 
	int choice=0;// for choice in selection of inventry

	
	try {
		JsonNode root=mapper.readTree(new File("/home/user/JSONFiles/grains.json"));// reading data of json 

		do {
			
			System.out.println("Enter Your Choice");			
			System.out.println("1.Rice   2.Pulses   3.Wheat  ");
			try {
			choice=JsonUtil.scan.nextInt();								// reading the choice input
			}
			catch(Exception e)
			{
				System.out.println("type missmatch ");			
			}
		
		
		String inventryproduct="";								// the string which has choice data
		
		
		switch(choice)
		{
		case 1:
			inventryproduct="Rice";
			break; 
			
		case 2:
			inventryproduct="Pulses";
			break;
			
		case 3:
			inventryproduct="Wheat";
			break;
		case 4:
			System.out.println("Thank You....!!!");
			break;
		default:
				System.out.println("invalid input");
				break;
		}
		
		
		JsonNode inventry = root.get(inventryproduct);		// searching for specific data
		System.out.println(" --------------------------------- "+inventryproduct+" -------------------------------");
		System.out.println();
		for (JsonNode node : inventry) {
			String name=node.get("name").asText();				// accessing name value 
			int weight=node.get("weight").asInt();				// accessing weight value
			int price=node.get("price").asInt();				// accessing price value
			
			System.out.println("name\t:"+name+"\nprice\t:"+price+"\nweight\t:"+weight);//printing the accessed value
			System.out.println("total price "+(price*weight));
			System.out.println();
		}}while(choice!=4);
	} catch (IOException e) {
		
		System.out.println("error occured while parsing a file");
		e.printStackTrace();
	}
	JsonUtil.scan.close();
	}
}
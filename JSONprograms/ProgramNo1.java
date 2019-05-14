/**
 * @ProblemStatement: JSON Inventory Data Management of Rice, Pulses and Wheats. Create a JSON file having Inventory 
 * Details for Rice, Pulses and Wheats with properties name, weight, price per kg. Use Library : Java JSON Library
 *  for parsing the JSON. read in JSON File Get JSON Object in Java. Create Inventory Object from JSON. 
 *  Calculate the value for every Inventory.Create the JSON from Inventory Object and output the JSON String
 * @Author:Vishwajeet malusare
 * */
package com.jsonprograms;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
/**
 * This class is written to get inventory details
 * */
public class ProgramNo1{
static Program1getset meal[];
public static void main(String[] args) throws JsonProcessingException, IOException {
	
	ObjectMapper mapper=new ObjectMapper();
	File file=new File("/home/user/JSONFiles/grains.json");
	JsonNode node=mapper.readTree(file);
	JsonNode node1=node.get("Rice");
	meal=mapper.readValue(node1, Program1getset[].class);
	System.out.println("-----------Rice------------------------------");
	for(Program1getset meal1:meal)
	{
		System.out.println(meal1);
	}
	System.out.println("-----------Pulses------------------------");
	node1=node.get("Pulses");
	meal=mapper.readValue(node1, Program1getset[].class);
	for(Program1getset pulses:meal)
	{
		System.out.println(pulses);
	}

	System.out.println("-----------Wheats------------------------");
	node1=node.get("Wheat");
	meal=mapper.readValue(node1, Program1getset[].class);
	for(Program1getset wheats:meal)
	{
		System.out.println(wheats);
	}
	
}
}
package com.jsonprograms;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.node.JsonNodeFactory;

public class JsonUtil {
	public static Scanner scan=new Scanner(System.in);
	/*
	 * Scanning mechanism
	 * */
		
	public static void main(String[] args) throws JsonProcessingException, IOException {
		user user1[];
		ObjectMapper mapper=new ObjectMapper();
		
		String pathname="/home/user/eclipse-workspace/JsonProject/data.json";
		File file=new File(pathname);
		JsonNode node=mapper.readTree(file);//readTree
		
		JsonNode node1=node.get("rice");
		user1=mapper.readValue(node1, user[].class);
		for(user user2:user1)
		{
			System.out.println(user2);
		}
	
//		JsonNode node2 =node.get("Rice");
//		user2 = mapper.readValue(node2,user[].class);
	}
	
	

}

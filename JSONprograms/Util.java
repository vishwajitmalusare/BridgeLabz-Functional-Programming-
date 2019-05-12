/**
 * This is a utility class which contains Useful Functionality which used in JOSN related programs
 * author: Vishwajeet Malusare
 * **/

package com.jsonprograms;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Util {
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static String javaToJson(Object obj) {
		String jsonResult="";
		try {
			jsonResult=mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			System.out.println("Exception during the Java to json conversion");
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Exception during the Java to json conversion");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception during the Java to json conversion");
			e.printStackTrace();
		}
		return jsonResult;
	}
	
	public static <T> T jsonToJava(String jsonString,Class<T> cls) {
		T result=null;
		try {
			result=mapper.readValue(jsonString,cls);
		} catch (IOException e) {

			System.out.println("Exception during the json to java"+e);
			e.printStackTrace();
		}
		return result;
	}

}

/**
 * This is a utility class which contains Useful Functionality which used in JOSN related programs
 * author: Vishwajeet Malusare
 * **/

package com.jsonprograms;
import java.util.Scanner;
import java.io.IOException;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.util.*;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Util {
	Scanner scanner=new Scanner(System.in);
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	//java to json---------------------------------------------------
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
	
	//jsonToJava------------------------------------
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

	//-------------------------------------------------
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	
	//---------------------------------------------------Cdp utility------------------

//
	
	Random random;

	public Util() {
		scanner = new Scanner(System.in);
		random = new Random();
	}

	
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}


	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

		

	
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}


	

	
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	
	public static boolean checkAnagram(String word1, String word2) {

		word1 = sort(word1.replaceAll("\\s+", "").toLowerCase().toCharArray());
		word2 = sort(word2.replaceAll("\\s+", "").toLowerCase().toCharArray());

		if (word1.equals(word2))
			return true;
		else
			return false;
	}

	
	private static String sort(char[] charArray) {
		String s = "";
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length - 1; j++) {
				if (charArray[j] > charArray[j + 1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < charArray.length; i++) {
			s = s + charArray[i];
		}
		return s;
	}

	
	public static String toLowerCase(char[] charArray) {
		String s = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 91) {

				charArray[i] = (char) (charArray[i] + 32);
				s = s + charArray[i];
			} else {
				s = s + charArray[i];
			}
		}
		return s;
	}

	
	public static String removeSpace(char[] charArray) {
		String s = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				s = s + charArray[i];
			}

		}
		return s;
	}

	
	public boolean isPrimeNumber(int number) {
		int count = 0;
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			return true;
		} else
			return false;
	}

	
	public static boolean isPalindrome(int number) {
		int sum = 0, r;
		int numberCopy = number;
		while (number > 0) {
			r = number % 10;
			sum = sum * 10 + r;
			number = number / 10;
		}
		if (numberCopy == sum)
			return true;
		else
			return false;
	}

	
	public Integer[] getInputInt(int size) {
		Integer[] array = new Integer[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			array[i] = inputInteger();
		}
		return array;
	}


	public String[] getInputString(int size) {
		String[] array = new String[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			array[i] = inputString();
		}
		return array;
	}

	public static <T extends Comparable<T>> T[] insertionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			T ne = array[i];
			int j;
			for (j = i; j > 0 && (array[j - 1].compareTo(ne)) > 0; j--) {
				array[j] = array[j - 1];
			}
			array[j] = ne;
		}
		return array;
	}

	
	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
		T temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if ((array[j]).compareTo(array[j + 1]) > 0) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * Generic Binary Search algorithm
	 * 
	 * @param <T>
	 * @param array
	 * @param value
	 * @return Check whether element is present or not via Binary Search.
	 */
	public static <T extends Comparable<T>> boolean binarySearch(T[] array, T value) {
		int start = 0;
		int end = array.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (array[midp].equals(value)) {
				return true;
			} else if (((array[midp]).compareTo(value)) < 0) {
				start = midp + 1;
			} else {
				end = midp;
			}
		}
		return false;
	}

	/**
	 * Generic method to display array
	 * 
	 * @param array
	 * @param size
	 */
	public static <T> void displayArray(T[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.printf("%s ", array[i]);
		}
	}

	/**
	 * Calculating power of a number
	 * 
	 * @param exponent
	 * @param number
	 * @return power of number to the given exponent
	 */
	public static int power(int exponent, int number) {
		int sum = 1;
		for (int j = 0; j < exponent; j++) {
			sum = sum * number;
		}
		return sum;
	}


}
	

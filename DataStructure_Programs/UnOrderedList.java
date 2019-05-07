/*
 * Problem statement: Read the text from a file, split it into words and arrange it as Linked List.
 * Take a user input to search a word in the list. If the word is not found then add it to the list,
 * and if it found then remove it from the list. In teh end save the list into a file.
 * 
 * @author: Vishwajeet V. Malusare
 * */

/*
 *Import the important packages 
 */
package com.bridgelabz.datastructure;
import java.io.BufferedReader;
import java.io.FileReader;
import com.bridgelabz.utility.Utility;

public class UnOrderedList {

	
	public static <T> void main(String[] args) {
		List<String>Al=new List<String>();
		Object a;
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/user/eclipse-workspace/Functional_Programs/src/com/bridgelabz/datastructure/xyz.txt"));
			try {
				// read line from file
				a = br.readLine();
				// split line into words when you get comma and store words in array
				Object arr[] = ((String) a).split(" ");
				for(int i=0;i<arr.length;i++) {
					Al.Add1(arr[i]);
				}
				br.close();
				Al.Show();
				System.out.println("Linked List Size is : "+Al.Size());
				System.out.println();
				System.out.println("Search the Word...!!! ");
				T word=(T) Utility.scan.next();
				
				
				if(Al.Search((String) word)) {
					int rem=Al.Index((String) word);
					System.out.println("Position of Element In list "+rem);
					Al.Remove(rem);
					Al.Show();
					System.out.println("Remove Word is : "+word);
					System.out.println();
					System.out.println("Linked List Size is : "+Al.Size());
					Al.effect();
					
				}else {
					
					Al.Add1(word);
					Al.Show();
					System.out.println("Linked List Size is : "+Al.Size());
					System.out.println();
					Al.effect();
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	
		
	}
	  
}




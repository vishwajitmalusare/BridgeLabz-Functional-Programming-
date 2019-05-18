/**
 * @ProblemStatement: Create Object Oriented Analysis and Design of a simple Address Book Problem.
 * 
 * @author: Vishwajeet Malusare
 * */
package addressBook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * This class is written to  file related functionality
 * */
public class FileSystem implements IAddress {
	public static List<Person> personList = null;
	public static ObjectMapper objM = new ObjectMapper();

	/**
	 * This method is Setter method for List
	 * */
	public static void setList(List<Person> personList) {
		FileSystem.personList = personList;
	}

	/**
	 * This method is Getter method for List
	 * */
	public static List<Person> getList() {
		return personList;
	}

	/**
	 * This method is written to create file operation
	 * */
	public static File createNewFile(String fileName, String fileExtension) {
		File file = IAddress.getPathOfFile(fileName, fileExtension);
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileWriter newFileWritten = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return file;
	}
}

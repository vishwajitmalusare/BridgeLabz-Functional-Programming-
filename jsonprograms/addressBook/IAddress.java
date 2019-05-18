/**
 * @ProblemStatement: Create Object Oriented Analysis and Design of a simple Address Book Problem.
 * 
 * @author: Vishwajeet Malusare
 * */
package addressBook;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * This interface is written to implements save file and read file functionality 
 * */
public interface IAddress 

{
	ObjectMapper objectmapper =new ObjectMapper();
	public static File getPathOfFile(String fileName, String fileExtension)
	{
		fileName = "/home/user/JSON/"+ fileName + fileExtension;
		
		File file = new File(fileName);
		
		return file;
	}
	/**
	 * This method is written to file saving operation*/
	public static void saveFile(File file)
	{
		List<Person> updatedList =FileSystem.getList();
		try {
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(file, updatedList);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * This method is written to perform read file operation*/
	public static void readFile(File file)
	{
		try 
		{
			FileSystem.setList(objectmapper.readValue(file, new TypeReference<List<Person>>() {}));
		} 
		catch (IOException e) 
		{
			System.out.println("\nFile Not Found!\n");
		}
	}
	
}
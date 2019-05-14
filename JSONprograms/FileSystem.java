package com.jsonprograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;


public class FileSystem implements IAddress {
	public static List<Person> personList = null;
	public static ObjectMapper objM = new ObjectMapper();

	public static void setList(List<Person> personList) {
		FileSystem.personList = personList;
	}

	public static List<Person> getList() {
		return personList;
	}

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

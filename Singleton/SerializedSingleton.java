package com.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SerializedSingleton implements Serializable{
		public static void main(String[] args) {			
			EnumSingleton singleton = EnumSingleton.Instance;
			singleton.setValue(1);
			//Serialize
			try {
				FileOutputStream fileOut = new FileOutputStream("out.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.close();
				fileOut.close();
			}catch(IOException e) {
				System.out.println("Exceptio is "+e);
			}
			singleton.setValue(2);
			
			//Desrialized
			
			EnumSingleton singleton2 = null;
			try {
				FileInputStream fileIn = new FileInputStream("out.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);
				singleton2 =(EnumSingleton)in.readObject();
				in.close();
				fileIn.close();
			}catch(IOException i) {
				System.out.println("Exception is "+i);
			}catch(ClassNotFoundException c) {
				System.out.println("singletons.EnumSingleton class not found"+c);
				//c.printStackTrace();
			}
			if(singleton==singleton2) {
				System.out.println("Objects are same....");
			}
			else {
				System.out.println("Objects are not Same ");
			}
			System.out.println(singleton.getValue());
			System.out.println(singleton2.getValue());

		}
	}


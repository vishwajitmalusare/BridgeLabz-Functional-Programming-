package com.factorypattern;

import com.factorypattern.Computer;
/**
 * This class is written to implement ComputerFactory for Factory Design pattern
 * */
public class ComputerFactory {
	/**
	 * This method is written to get the computer details
	 * */
public static Computer getComputer(String type,String ram,String hdd,String cpu) {
	if("PC".equalsIgnoreCase(type)) 
		return new PC(ram,hdd,cpu);
	
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram,hdd,cpu);
			return null;
		
	}

}

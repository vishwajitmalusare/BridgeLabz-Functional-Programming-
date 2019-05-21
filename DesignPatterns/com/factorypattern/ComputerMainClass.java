package com.factorypattern;

import com.factorypattern.Computer;
import com.factorypattern.ComputerFactory;
/**
 * This class is written to implement Factory Design pattern
 * */
public class ComputerMainClass {

	public static void main(String[] args) {
		//pc and server variables use to return the details of computer
		Computer pc= ComputerFactory.getComputer("PC","2GB","500GB","2.4GHz");
		Computer server = ComputerFactory.getComputer("Server", "8GB", "1TB", "6GHz");
		System.out.println("Factory PC Configuaration : "+pc);
		System.out.println("Factory Server Configuaration : "+server);
	}

}

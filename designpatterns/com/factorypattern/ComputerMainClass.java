package com.factorypattern;

import com.factorypattern.Computer;
import com.factorypattern.ComputerFactory;

public class ComputerMainClass {

	public static void main(String[] args) {
		Computer pc= ComputerFactory.getComputer("PC","2GB","500GB","2.4GHz");
		Computer server = ComputerFactory.getComputer("Server", "8GB", "1TB", "6GHz");
		System.out.println("Factory PC Configuaration : "+pc);
		System.out.println("Factory Server Configuaration : "+server);
	}

}

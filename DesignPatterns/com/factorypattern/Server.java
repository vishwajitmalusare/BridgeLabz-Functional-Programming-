package com.factorypattern;

/**
 * This class is written to implement Server class for Factory Design pattern
 * */

public class Server extends Computer{
	//Variables store the RAM HDD CPU
	private String ram;
	private String hdd;
	private String cpu;
	
	/**
	 * This method is written to get the SERVER details
	 * */
	public Server(String ram,String hdd,String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	/**
	 * This methods are return the Server details
	 * */
	public String getRAM() {
		return ram;
	}
	public String getHDD() {
		return hdd;
	}
	public String getCPU() {
		return cpu;
	}
	
}

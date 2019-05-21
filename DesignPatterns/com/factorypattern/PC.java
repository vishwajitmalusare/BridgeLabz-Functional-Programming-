package com.factorypattern;
/**
 * This class is written to implement PC class for Factory Design pattern
 * */
public class PC extends Computer{
//Variables store the RAM HDD CPU
	private String ram;
private String hdd;
private String cpu;

/**
 * This method is written to get the PC details
 * */
public PC(String ram,String hdd,String cpu) {
	this.ram=ram;
	this .hdd=hdd;
	this.cpu=cpu;
}

/**
 * This methods are return the PC details
 * */
public String getRAM() {
	return this.ram;
}

public String getHDD() {
	return this.hdd;
}
public String getCPU() {
	return cpu;
}
}
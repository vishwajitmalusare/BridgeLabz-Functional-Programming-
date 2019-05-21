package com.factorypattern;
/**
 * This Abstract class is written to implement Computer for Factory Design pattern
 * */
public abstract class Computer {
	//Abstarct Variables store value of RAM, CPU and HDD
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	
	/**
	 * This method Returns the RAM HDD CPU
	 * */
	public String toString() {
		return "RAM = "+this.getRAM()+" HDD = "+this.getHDD()+" CPU = "+this.getCPU();
	}
}

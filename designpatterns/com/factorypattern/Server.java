package com.factorypattern;

public class Server extends Computer{
	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram,String hdd,String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
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

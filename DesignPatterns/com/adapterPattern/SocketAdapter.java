package com.adapterPattern;

/**
 * This Interface is written to Implement SoketAdapter for Adapter Pattern
 * */
public interface SocketAdapter {
	//Variables are store the value of volts 
	public Volt get240Volt();
	public Volt get24Volt();
	public Volt get3Volt();
}

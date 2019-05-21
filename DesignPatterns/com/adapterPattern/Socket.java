package com.adapterPattern;
/**
 * This class is written to Implement Socket for Adapter Pattern
 * */
public class Socket {
	public Volt getVolt() {
	return new Volt(240);
}
}
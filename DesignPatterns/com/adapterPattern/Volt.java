package com.adapterPattern;
/**
 * This class is written to Implement Volt for Adapter Pattern
 * */
public class Volt {
	
	private int volts;
	public Volt(int v) {
		this.volts=v;
	}
	public int getVolts() {
		return volts;
	}
	public void setVolt(int volts) {
		this.volts=volts;
	}
}

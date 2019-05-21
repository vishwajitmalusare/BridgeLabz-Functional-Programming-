package com.adapterPattern;

import com.adapterPattern.ClassAdapter;
import com.adapterPattern.ObjectAdapter;
import com.adapterPattern.SocketAdapter;
import com.adapterPattern.Volt;

/**
 * This class is written to implement Adapter Design pattern
 * */
public class AdapterPatternMain {

	public static void main(String[] args) {
		ObjectAdapter();
		ClassAdapter();
	}
	/**
	 * This method is written to implement object adapter pattern
	 * */
	private static void ObjectAdapter() {
		SocketAdapter sockAdapter = new ObjectAdapter();
		//Variables are store the value of volts 
		Volt v3=getVolt(sockAdapter,3);
		Volt v24=getVolt(sockAdapter,24);
		Volt v240=getVolt(sockAdapter,240);
		System.out.println("V3 volts using Object Adapter : "+v3.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v24.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v240.getVolts());
	}
	/**
	 * This method is written to implement class adapter pattern
	 * */
	private static void ClassAdapter() {
		SocketAdapter sockAdapter= new ClassAdapter();
		//Variables are store the value of volts 
		Volt v3=getVolt(sockAdapter,3);
		Volt v24= getVolt(sockAdapter,24);
		Volt v240=getVolt(sockAdapter,240);
		System.out.println("\nV3 volts using Object Adapter : "+v3.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v24.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v240.getVolts());
	}
	/**
	 * This methos block is written to get Volt values as 3,24,or 240 volts
	 * */
	private static Volt getVolt(SocketAdapter sock,int i) {
		switch(i) {
		case 3: 
			return sock.get3Volt();
		case 24: 
			return sock.get24Volt();
		case 240:
			return sock.get240Volt();
			default:
				return sock.get240Volt();
		}
	}
}

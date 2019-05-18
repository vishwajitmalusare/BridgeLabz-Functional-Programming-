package com.adapterPattern;

import com.adapterPattern.ClassAdapter;
import com.adapterPattern.ObjectAdapter;
import com.adapterPattern.SocketAdapter;
import com.adapterPattern.Volt;
public class AdpterPatternMain {

	public static void main(String[] args) {
		ObjectAdapter();
		ClassAdapter();
	}
	private static void ObjectAdapter() {
		SocketAdapter sockAdapter = new ObjectAdapter();
		Volt v3=getVolt(sockAdapter,3);
		Volt v24=getVolt(sockAdapter,24);
		Volt v240=getVolt(sockAdapter,240);
		System.out.println("V3 volts using Object Adapter : "+v3.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v24.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v240.getVolts());
	}
	private static void ClassAdapter() {
		SocketAdapter sockAdapter= new ClassAdapter();
		Volt v3=getVolt(sockAdapter,3);
		Volt v24= getVolt(sockAdapter,24);
		Volt v240=getVolt(sockAdapter,240);
		System.out.println("\nV3 volts using Object Adapter : "+v3.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v24.getVolts());
		System.out.println("V3 volts using Object Adapter : "+v240.getVolts());
	}
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

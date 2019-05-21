package com.adapterPattern;
/**
 * This class is written to Implement Object Adapter Pattern
 * */
public class ObjectAdapter implements SocketAdapter{
	private Socket sock= new Socket();
	/**
	 * This methods are written to get values of different volts 
	 * */
	public Volt get240Volt() {
		return sock.getVolt();
	}
	public Volt get24Volt() {
		Volt v=sock.getVolt();
			return convertVolt(v,10);
	}
	public Volt get3Volt() {
		Volt v=sock.getVolt();
		return convertVolt(v,40);
	}
	/**
	 * This method is used to convert the 240 volt into another volt value
	 * */
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}
}

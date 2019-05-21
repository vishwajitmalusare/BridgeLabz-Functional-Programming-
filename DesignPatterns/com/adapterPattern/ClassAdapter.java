package com.adapterPattern;
/**
 * This class is written to implment Class Adapter Design pattern
 * */
public class ClassAdapter extends Socket implements SocketAdapter{
	/**
	 * This three methods written to get volt values 
	 * */
	public Volt get240Volt() {
		return getVolt();
	}
	public Volt get24Volt() {
		Volt v=getVolt();
		return convertVolt(v,10);
	}
	public Volt get3Volt() {
		Volt v=getVolt();
				return convertVolt(v,40);
	}
	
	/**
	 * This method is used to convert the 240 volt into another volt value
	 * */
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}
}

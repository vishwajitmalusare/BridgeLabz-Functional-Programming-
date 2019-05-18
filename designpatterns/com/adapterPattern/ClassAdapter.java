package com.adapterPattern;

public class ClassAdapter extends Socket implements SocketAdapter{
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
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}
}

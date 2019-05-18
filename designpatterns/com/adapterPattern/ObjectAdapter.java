package com.adapterPattern;

public class ObjectAdapter implements SocketAdapter{
	private Socket sock= new Socket();
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
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolts()/i);
	}
}

package com.Singleton;

public class DoubleCheckedLocking {

	private static DoubleCheckedLocking instance;
	private DoubleCheckedLocking() {}
	public static synchronized DoubleCheckedLocking getInsatnce() {
		if(instance==null) {
			instance =new DoubleCheckedLocking();
		}
		return instance;
	}

}

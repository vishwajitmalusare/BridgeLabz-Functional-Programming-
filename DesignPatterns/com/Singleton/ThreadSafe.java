package com.Singleton;

public class ThreadSafe {
	private static ThreadSafe instance;
	private ThreadSafe() {}
	public static synchronized ThreadSafe getInsatnce() {
		if(instance==null) {
			instance =new ThreadSafe();
		}
		return instance;
	}

}

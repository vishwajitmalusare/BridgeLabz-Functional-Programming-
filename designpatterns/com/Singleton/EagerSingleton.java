package com.Singleton;

public class EagerSingleton {

	private  static final EagerSingleton instance = new EagerSingleton();
	//Private constructor to avoid client applications to use constructor
	private EagerSingleton() {}
	public static EagerSingleton getInstance() {
		
		return instance;	
	}
	
	
}

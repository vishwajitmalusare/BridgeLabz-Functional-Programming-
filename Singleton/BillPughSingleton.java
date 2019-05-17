package com.Singleton;

public class BillPughSingleton {
	private BillPughSingleton() {}
	private static class SingletonHelper{
	private static final BillPughSingleton Instance = new BillPughSingleton();
	}
	public static BillPughSingleton getInstance() {
		return SingletonHelper.Instance;
	}
}

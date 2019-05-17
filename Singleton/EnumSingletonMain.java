package com.Singleton;

public class EnumSingletonMain {

	public static void main(String[] args) {
		EnumSingleton singleton = EnumSingleton.Instance;
		System.out.println(singleton.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
	}
}

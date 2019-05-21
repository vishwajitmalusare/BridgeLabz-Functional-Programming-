package com.Singleton;

public enum EnumSingleton {
	Instance;
	int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
}
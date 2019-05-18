//Destroy singleton using Reflection
package com.Singleton;

import java.lang.reflect.Constructor;

public class RefelctionSingleton {
	public static void main(String[] args) {
		EagerSingleton instanceOne = EagerSingleton.getInstance();
		EagerSingleton instanceTwo=null;
		try {
			@SuppressWarnings("rawtypes")
			Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
			for(@SuppressWarnings("rawtypes") Constructor constructor:constructors) {
				constructor.setAccessible(true);
				instanceTwo=(EagerSingleton)constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Object1 = "+instanceOne.hashCode());
		
		System.out.println("Object2 = "+instanceTwo.hashCode());

	}
}

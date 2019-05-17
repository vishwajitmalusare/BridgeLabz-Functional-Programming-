package com.Singleton;

public class StaticBlockSingelton {
	private static StaticBlockSingelton instance;
	private StaticBlockSingelton() {}
	static {
		try {
			instance = new StaticBlockSingelton();
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance "+e);
		}
	}
		public static StaticBlockSingelton getInstance() {
			return instance;

		}
	}

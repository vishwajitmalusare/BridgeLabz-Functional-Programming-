package com.proxyDesignpattern;

import com.proxyDesignpattern.CommandExcecutorProxy;
import com.proxyDesignpattern.CommandExcecutorInt;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExcecutorInt executor = new CommandExcecutorProxy("Akay","wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		}catch(Exception e) {
			System.out.println("Exception mesasge "+e.getMessage());
		}
	}
}

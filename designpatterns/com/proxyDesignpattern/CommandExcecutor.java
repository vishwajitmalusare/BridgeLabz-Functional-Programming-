package com.proxyDesignpattern;

import java.io.IOException;

public class CommandExcecutor implements CommandExcecutorInt {
	public void runCommand(String cmd)throws IOException{
	Runtime.getRuntime().exec(cmd);
	System.out.println(" ' "+cmd+" 'Command Excecuted.");
	}
}

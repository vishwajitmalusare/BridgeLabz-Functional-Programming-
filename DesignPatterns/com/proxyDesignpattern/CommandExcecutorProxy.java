package com.proxyDesignpattern;

public class CommandExcecutorProxy implements CommandExcecutorInt{
	private boolean isAdmin;
	private CommandExcecutorInt executor;
	
	public CommandExcecutorProxy(String user,String pwd) {
		if("Akay".equals(user)&&"P@ss".equals(pwd))
			isAdmin=true;
		executor= new CommandExcecutor();
	}
	public void runCommand(String cmd) throws Exception{
		if(isAdmin) {
			executor.runCommand(cmd);
		}
		else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users ");
			}
			else {
				executor.runCommand(cmd);
			}
		}
	}
}

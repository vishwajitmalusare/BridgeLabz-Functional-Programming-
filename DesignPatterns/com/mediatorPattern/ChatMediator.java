package com.mediatorPattern;
/**
 * This Interface is written to implement ChatMediator for Mediator Design pattern
 * */
public interface ChatMediator {
	/**
	 * This methods are written to sen Message and Add Users
	 * */
	public void sendMessage(String msg,User user);
	void addUser(User user);
}

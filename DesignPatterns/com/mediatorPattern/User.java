package com.mediatorPattern;
/**
 * This abstract class is written to implement User for  Mediator Design pattern
 * */
public abstract class User {
	//This variables used to pass mediator and name to send and receive functions
	protected ChatMediator mediator;
	protected String name;
	/**
	 * This function is used to  add user into the chat mediator
	 * */
	public User(ChatMediator med,String name) {
		this.mediator=med;
		this.name=name;
	}
	/**
	 * This method is returns the Messages which send or recived by users */
	public abstract void send(String msg);
	public abstract void recive(String msg);

}

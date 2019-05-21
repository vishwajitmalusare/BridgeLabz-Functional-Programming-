package com.mediatorPattern;
/**
 * This class is written to implement UserImplements for  Mediator Design pattern
 * */
public class UserImpl extends User{
	/**
	 * Constructor for UserImpl
	 * */
	public UserImpl(ChatMediator med, String name) {
		super(med,name);
	}

	 /** This method is returns the Messages which is send by users 
	  * */
	@Override
	public void send(String msg) {
		System.out.println(this.name+" Sended message : ---->>"+msg+"\n");
		mediator.sendMessage(msg, this);
		
	}

	 /** This method is returns the Messages which is send by users 
	  * */
	@Override
	public void recive(String msg) {
		System.out.println(this.name+" Recived message : "+msg);

	}
}

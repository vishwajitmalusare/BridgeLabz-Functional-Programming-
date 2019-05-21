package com.mediatorPattern;
import java.util.ArrayList;
import java.util.List;
/**
 * This class is written to implement ChatMediator Implementation for Mediator Design pattern
 * */
public class ChatMediatorImpl implements ChatMediator{
	private List<User> users;
	
	public ChatMediatorImpl() {
		this.users= new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User user) {
		for(User u:this.users) {
			//Message could not be recived by the user sending it
			if(u!=user) {
				u.recive(msg);
			}
		}
	}

	/**
	 * This method add user into chatmediator*/
	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
}

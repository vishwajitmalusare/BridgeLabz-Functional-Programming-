package com.mediatorPattern;
/**
 * This class is written to implement ChatClientfor  Mediator Design pattern
 * */
public class ChatClient {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		//This Variables Stores the user
		User user1 = new UserImpl(mediator,"Akay");
		User user2 = new UserImpl(mediator,"Kamlesh");
		User user3 = new UserImpl(mediator,"Ravi");
		User user4 = new UserImpl(mediator,"Vish");
		/**
		 * This method is written to add user into chat mediator 
		 * */
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hi   All");
		System.out.println("\n----------------------------XXXXXXXXX--------------------------\n");
		user2.send("Miss you All");
		System.out.println("\n----------------------------XXXXXXXXX--------------------------\n");
		user4.send("Good Night All Bye .....!!!!");
	}
}

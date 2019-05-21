package com.observerPattern;

import java.util.ArrayList;
import java.util.List;
public class MyTopic implements Subject{
	
	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	public MyTopic() {
		this.observers=new ArrayList<>();
	}
	
	public void register(Observer obj) {
		if(obj==null)throw new NullPointerException("Null Observer");
		synchronized(MUTEX) {
			if(!observers.contains(obj))
				observers.add(obj);
		}
	}
	
	
	public void notifyObservers() {
		List<Observer> observerLocal=null;
		//synchronization is used make sure any observer registered after message is received not notify
		synchronized(MUTEX) {
			if(!changed) 
				return;
			observerLocal= new ArrayList<>(this.observers);
			this.changed=false;
		}
		for(Observer obj:observerLocal) {
			obj.update();
		}
	}
	

	//Method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}

	@Override
	public void unResgistred(Observer obj) {
		synchronized(MUTEX) {
			observers.remove(obj);
		}		
	}

	@Override
	public Object getupdate(Observer obj) {
		return this.message;
	}
}

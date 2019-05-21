package com.observerPattern;

public interface Subject {
	//method to register
	public void register(Observer obj);
	public void unResgistred(Observer obj);
	
	//method to notify observers of change
	public void notifyObservers();
	
	//method to get updates from subject
	public Object getupdate(Observer obj);
}

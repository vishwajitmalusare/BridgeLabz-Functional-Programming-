package com.observerPattern;

public interface Observer {
	//method to update the observer by subject
	public void update();
	
	//Attach with subject to observe
	public void setSubject(Subject sub);
}

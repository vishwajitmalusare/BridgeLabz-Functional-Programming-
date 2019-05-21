package com.observerPattern;

public class MyTopicSubscriber implements Observer{
	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String nm) {
		this.name=nm;
	}
	public void update() {
		String msg = (String)topic.getupdate(this);
		if(msg==null) {
			System.out.println(name+"::No new message ::"+msg);
		}
		else
			System.out.println(name+":: Consuming message ::"+msg);
		
		
	}
	@Override
	public void setSubject(Subject sub) {
		this.topic=sub;
	}

}

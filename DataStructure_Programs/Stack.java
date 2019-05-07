package com.bridgelabz.datastructure;

public class Stack<T>{

	Node head;
	public static int top=-1;
	
	
	public class Node<T>{
		T data;
		Node next;
		
	}
	
	public void push(T data) {
		
		Node n = new Node<T>();
		Node t =head;
		if(head==null) {
			head=n;
			top=top+1;
		}
		else {
			while(t.next!=null) {
				t=t.next;
			}
			t.next=n;
			top++;
			n.next=null;
		}
	}
	
	public String pop() {
		Node c=head;
		head=c.next;
		top--;
		return(String)c.data;
	}
	
	public boolean isEmpty() {
		return(head==null);
	}
	
	public int size() {
		return top;
	}
	
	public void diplay() {
		Node new_node=head;
		int size=size();
		for(int i=0;i<size;i++) {
			System.out.println(new_node.data+" ");
			new_node=new_node.next;
		}
	}
	
	
	public <T> T peak() {
		if(head==null) {
			System.out.println("Element not found ");
			return null;
		}
		return(T)head.data;
	}
}


package com.jsonprograms;

import java.util.NoSuchElementException;

//public class Queue<T> {
	 //Node head;
	 class Node{
		 int data;
		 Node next;
		 
		 Node(){
			 data=0;
			 next=null;
		 }
		 
		 Node(int d, Node n){
			 data=d;
			 next=n;
		 }
		 
		 public void setNode(int d) {
			 data=d;
		 }
		 
		 public void setLink(Node n) {
			 next=n;
		 }
		 public int getNode() {
			 return data;
		 }
		 public Node getLink() {
			 return next;
		 }
	 }
			
	 
	 public class Queue{
		 public Node front,rear;
		 public int size;
		 
		 public Queue() {
			 front=null;
			 rear=null;
			 size=0;
		 }
			 
			 public boolean isEmpty() {
				 return front==null &&rear==null;
			 }
			 
			 public int getSize() {
				 return size;
			 }
//---------------------------------Insert in queue--------------------------------------------------------
			 public void insert(int data) {
				 Node new_node=new Node(data,null);
				 if(rear==null) {
					 front=new_node;
					 rear=new_node;
				 }
				 else {
					 rear.setLink(new_node);
					 rear.getLink();
				 }
				 size++;
			 }
			 
			 //Delete in queue
			 public void remove() {
				 if(isEmpty()) {
				 throw new NoSuchElementException("Under Flow");
				 }
				 Node ptr=front;
				 front=ptr.getLink();
				 if(front==null) {
					 rear=null;
					 size--;
				 }
				 return;
			 }
			 
			//Peak in queue	 
			 public int peak() {
					 if(isEmpty()) {
						 throw new NoSuchElementException("Underflow");
					 }
					 int data=front.getNode();
					 return data;
				 }
				
				 public void display() {
					 int ptr1=0;
					 if(size==0) {
						 System.out.println("empty");
					 }
					 Node ptr=front;
					 while(ptr!=rear.getLink()) {
						 ptr1=ptr1+ptr.getNode();
						 System.out.println(ptr1);
						 ptr=ptr.getLink();
					 }
					 System.out.println();
				 }
		 }
		
	//}
	



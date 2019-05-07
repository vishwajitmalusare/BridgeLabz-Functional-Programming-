/*
 * Linked list program for refrence creted by myself..
 * */
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Linkedlist {

	//public  static Object obj=new Object();
	public static Node head;

/*Node class It has a node definition*/
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}

/*Insert at the Head*/
public void insertAtHead(int new_data) {
	Node new_node = new Node(new_data);
	new_node.next=head;
	head=new_node;
}

/*Append*/
public void append(int new_data) {
	Node tnode=head;
	while(tnode.next!=null) {
		tnode=tnode.next;	
		if(tnode.next==null) {
			Node new_node =new Node(new_data);
			tnode.next=new_node;
			new_node.next=null; 
			break;
		}
	}
}

/*list*/
public void list() {
	System.out.println("\nHow long list you want...");
	int range=Utility.scan.nextInt();
	Node tnode=head;
	while(range>=0) {
		tnode.data=0;
		System.out.print(tnode.data+"->");

		tnode=tnode.next;
		range--;
		

	}

}
/*Print the linked list */
public void show() {
	Node temp=head;
	System.out.println("\nList is =");
	while(temp !=null) {
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
}
/*Remove method*/
public void remove(int key) {
	//System.out.println("Enter the Key : ");
	//String search_key=Utility.scan.nextLine();
	Node temp_rm=head;
	while(temp_rm!=null) {
		temp_rm=temp_rm.next;
		if(temp_rm.next.data==key) {
			temp_rm.next=temp_rm.next.next;
		}
	}
	show();
}

	public static void main(String[] args) {
try {
		//Linkedlist list=new Linkedlist();
//		list.insertAtHead(10);
//		//		list.show();
//		list.append("YoYo");
//		list.remove("Himmat");
		//list.show();
		//list.list();
	
}catch(Exception e) {
	System.out.println("Exception is : "+e);
}
}

}

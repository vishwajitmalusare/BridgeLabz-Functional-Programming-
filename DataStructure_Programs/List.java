/*
 * Problem statement: Read the text from a file, split it into words and arrange it as Linked List.
 * Take a user input to search a word in the list. If the word is not found then add it to the list,
 * and if it found then remove it from the list. In teh end save the list into a file.
 * 
 * @author: Vishwajeet V. Malusare
 * */

package com.bridgelabz.datastructure;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * List class 
 * */
public class List <T>{
Node head;
int count=0;
public class Node <T>{
	 T data;
	 Node next;
	 
	}


/*
 * THIS FUCTION USE TO INSERT DATA INTO THE LINKED LIST 
 */

public <T> void Add1(T item) {
	Node<T> node=new Node<T>();
	node.data=item;
	node.next=null;
	
	if(head==null) {
		head=node;
	}else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=node;
	}
	count++;
}
/*
 * THIS FUCTION USE TO REMOVE LINK BETWEEN LINKED LIST
 */

public void Remove(int pos) {
	if(pos==0) {
		head=head.next;
	}else {
		Node<T> n=head;
		Node<T> n1=null;
		for(int i=0;i<pos-1;i++) {
			n=n.next;
		}
		n1=n.next;
		n.next=n1.next;
		n1=null;
	}
	count--;
}


/*
 * THIS FUCTION USE TO SEARCH THE DATA AND IF DATA AVAILABLE IT RETURN BOOLEAN VALUE
 */
public boolean Search(T number) {
	Node<T> temp=head;
	for(int i=0;i<Size()-1;i++) {
		if(temp!=null) {
				if(temp.data==number||temp.data.equals(number)) 
				{
				return true;
				}
				temp=temp.next;
		}
	}
	return false;
		
	}
	
	



/*
 * THIS FUCTION ARE USE TO CHACKE IF LINKED LIST ISEMTY OR NOT IT RETURN BOOLEAN VALUE
 */
public boolean isEmpty() {
	Node<T> node=head;
	if(node!=null)
		return false;
	else
		return true;
}


/*
 * THIS FUCTION RETURN SIZE OF LINKED LIST
 */
public int Size() {	
	
	return count;
}


/*
 * THIS FUCTION ARE RETURN THE INDEX POSITION OF THAT DATA
 */
public int Index(T item) {
	int count=0;
	Node<T> temp=head;
	while(temp!=null) {
		if(temp.data==item||temp.data.equals(item)) {
			return count;
		}
		temp=temp.next;
		count++;
	}
	count++;
	if(temp.data==item||temp.data.equals(item)) {
		return count;
	}
	return 0;
}


/*
 * THIS FUCTION ARE USE TO INSERT DATA INTO THE PERTICULAR POSITION
 */
public int InsertAt(int pos,T item) {
	Node<T> node=new Node<T>();
	node.data=item;
	node.next=null;
	Node<T> n=head;
	for(int i=0;i<pos-1;i++)
	{
		n = n.next;
	}
	node.next = n.next;
	n.next = node;
	count++;
	return 1;
}

public int Pop() {
	return 0;
}


/*
 * THIS FUCTION USE TO DISPLAY THE LINKED LIST 
 */
public void Show() {
	Node<T> temp=head;
	try {
		if(temp==null) {
			System.out.println("data not at inserted..");
		}else {System.out.println();
			while(temp.next!=null) {
				
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data+" ");
			System.out.println();
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}


/*
 * THIS FUCTION USE TO ADD DATA INTO STARTING POSITION...!!
 */
public int InsertAtStart(T item) {
	Node<T> node=new Node<T>();
	node.data=item;
	node.next=null;
	if(head!=null) {
		node.next=head;
		head=node;
	}
	count++;
	return 1;
}
/*
 * THIS FUNCTION USE TO AFTER EFFECT OF LINKED LIST WE ARE STORING INTO THE ARRAY AND AFTER FILE  
 */
public int effect() {
	
	Node<T> temp=head;
	int c=0;
	String tem[]=new String[Size()];
	while(temp.next!=null) {
		tem[c]=(String) temp.data;
		temp=temp.next;
		c++;
	}
	tem[c]=(String) temp.data;
	System.out.println("After Modification..!!");
	for(Object p:tem) {
		System.out.print(p+" ");
	}
	 BufferedWriter writer;
	try {
		writer = new BufferedWriter(new FileWriter("/home/user/eclipse-workspace/Functional_Programs/src/com/bridgelabz/datastructure/xyz.txt"));//
		for(String p:tem) {
			 writer.write(p+" ");
			}
		   
		     
		    writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
	return 0;
	
}

public int OrderedList() {
	Node<T> temp=head;
	int c=0;
	int tem[]=new int[Size()];
	while(temp.next!=null) {
		tem[c]=(int)temp.data;
		temp=temp.next;
		c++;
	}
	tem[c]=(int)temp.data;
	System.out.println("After Modification..!!");
	for(Object p:tem) {
		System.out.println(p+" ");
	}
	BufferedWriter writer;
	try {
		writer= new BufferedWriter(new FileWriter("/home/user/eclipse-workspace/Functional_Programs/src/com/bridgelabz/datastructure/vwx.txt"));
		for(int p:tem) {
			writer.write(p+" ");
		}
		writer.close();
	}catch(Exception e) {}
	return 0;
}

}
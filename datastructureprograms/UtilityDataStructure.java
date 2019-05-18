package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class UtilityDataStructure {

	/**
	 * node class
	 * to create a class
	 * @param <T>
	 */
	@SuppressWarnings("rawtypes")
		static public class Node<T>{							//to create a new node
			T data;
			Node next;
		}
	@SuppressWarnings("rawtypes")
	public static class linkedlist<T>
		{
		 		Node head;									//creating head node
		 		public int size=0;
		
		
		/**
		 * to add elements to linked list
		 * 
		 * @param data 
		 */
		 @SuppressWarnings("unchecked")
		 public void add(T data)
		 {
			 Node node=new Node();				//new node creation
			 node.data=data;					//value is assigned to node
			 node.next=null;
			 if(head==null)						//if head has no value enter the node
			 {
				 head=node;						//assigning value to head
				 size++;
			 }
			 else
			 {
				 
				 Node n=head;					//new node to traversal
				 while(n.next!=null)			//loop for finding last node
				 {
					 n=n.next;
				 }
				 n.next=node;					//assigning link to previous to current new node
				 size++;
			 }
		 }
		 
		  /**
			 *method to display the data 
			 * 
			 * 
			 */
		 public void show()
		 {
			 Node node=head;					//to iteration 
			 while(node.next!=null)
			 {
				 System.out.print(node.data+" ");
				 node=node.next;
			 }
			 System.out.print(node.data+" ");
			 System.out.println();
			 
		 }
		   
		 	/**
			 * to search the element in the list
			 * 
			 * @param key
			 * returns true if found or false if it is not found
			 */
		 
		 
		 		public boolean search(T key) 			//method to search
		 {
			 Node node=head;					
			 while(node.next!=null)					//iteration
			 {
				if((node.data).equals(key)==true)
				{
					return true;
					
				}
				else
				{
					node=node.next;					//if element is not the word to iterate
				}
				 
			 }
			 	 return false;
			 }
		 		
		 
		 		/**
				 * 
				 * to remove specified element from list
				 * @param key
				 */
		 		
		 @SuppressWarnings("unchecked")
		 		public void delete(T key)				//method to delete the element
		 {
			 Node x=head;
			 Node y=head.next;
			
			 
			 while(x.next!=null)
			 {
				 if(head.data.equals(key))       //checking wether first element is same or not
				 {
					 System.out.println("the deleted element is "+head.data);
					 head=head.next;
					 size--;
					break; 
				 }
				 if(y.data.equals(key)==true&&y.next==null)	//if the element is last deleting last node
				 {
					 System.out.println("the deleted item is "+y.data);
					 x.next=null;
					 size--;
					 break;
				 }
				 if(y.data.equals(key)==true)		// else other node contains data delete it 
				 {
					 System.out.println("the deleted item is "+y.data);
					 size--;
					 x.next=y.next;
					 break;
				 }
				 else
					 
				 {
					 x=x.next;
					 y=y.next;
				 }
				 
			 }
		 }
		 
		 @SuppressWarnings("unchecked")
	void insert(int index,T value)
		 {
			 Node node=new Node();
			 Node n=head;
			 node.data=value;
			 node.next=null;
			 
			 for (int i = 0; i < index; i++)
			 {
				n=n.next;
			 }
			 node.next=n.next;
			 n.next=node;
			 size++;
		 }
		  @SuppressWarnings("unchecked")
		  		String pop()
		  {
			Node n;
			n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=null;
			String s1=(String)n.data;
			return s1;
			  
		  }
		  
		  @SuppressWarnings("unchecked")
		  	String pop(int pos)
		  {
			  Node n;
				Node y;
				n=head;
				y=n.next;
			  String res;
			  if(pos==1)
				{
					res=head.data.toString();
					head.next=head.next;
					
					return res;
				}
			  
			  if(pos<size-1)
		  {
			
			for (int i = 0; i < pos-1; i++) {
				n=n.next;
				y=y.next;
			}
			res=y.data.toString();
			n.next=y.next;
			return res;
			}
			 return null;
		  }
		  int size()
			 {
				 return size;
			 }
		  
		  boolean isempty()
		  {
			  
			  if(size()==0)				//in head node contains 0 it is empty
			  {
				  return true;
			  }else
				  return false;
		  }
		 
		
		  /*
		   * THIS FUCTION ARE RETURN THE INDEX POSITION OF THAT DATA
		   */
		  @SuppressWarnings("unchecked")
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
		  * 
		  *This FUNCTION ARE USE TO READ THE DATA FROM FILE  
		  * 
		  *
		  */
		 
		 public String readfile(String address)		//reads the content of file 
		 {
			 String data="";

				try {
				 FileReader fr=new FileReader(address);
				BufferedReader br=new BufferedReader(fr); 
				String line=br.readLine();					//to read a whole line
				while(line != null)
				{
					data+=line;
					line=br.readLine();
				}
				br.close();
				fr.close();
				}
				
				catch(Exception e)
				{
					System.out.println("exception catched in catch");
				}
			 return data;
		 }
		 
	
		 
		 /*
		  * THIS FUNCTION USE TO AFTER EFFECT OF LINKED LIST WE ARE STORING INTO THE ARRAY AND AFTER FILE  
		  */
		 public int effect() {
		 	
		 	Node<T> temp=head;
		 	int c=0;
		 	String tem[]=new String[size()];
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
		 		writer = new BufferedWriter(new FileWriter("/home/user/BinarySearchWorld/list.txt"));
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
		/*
		 * THIS FUCTION USE TO REWRITE THE FILE 
		 */
		 public int OrderedList() {
				
				Node<T> temp=head;
				int c=0;
				String tem[]=new String[size()];
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
					writer = new BufferedWriter(new FileWriter("/home/user/BinarySearchWorld/orderlist.txt"));
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
		

}
	
	@SuppressWarnings("rawtypes")
	linkedlist ll=new linkedlist();
	
	// <---------------------------------------------------------------------------------------------->
	// <--------------------------------STACK OPERATION IS FROM HERE---------------------------------->
	// <---------------------------------------------------------------------------------------------->
	/**
	 * @purpose 	:Simple Balanced Parentheses
	 * @author 		:Vishwajeet V. Malusare
	 */
	public class Stack<T>{
		@SuppressWarnings("rawtypes")
		Node top;
		
		int size=0;
		@SuppressWarnings("hiding")
		public class Node<T>{
			T data;
			@SuppressWarnings("rawtypes")
			Node next;
		}
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public void push(T data)
		{
			
			Node node=new Node<T>(); // creating new node 
			node.data=data; // assigning value to node
			node.next=null; // assigning value to next field
			if(top==null)
			{
				top=node;
				
				size++;
			}
			else {
			node.next=top;
			top=node;
			
			size++;}
		
		}
		public void peek()

		{
			if (size == 0) {
				System.out.println("stack is empty");
			} else {
				@SuppressWarnings("rawtypes")
				Node n = top; // assigning top value to n
				
				System.out.println(n.data); // printing last element
			}

		}
		public boolean isEmpty()
		
		{
			if(size == 0) // comparing if top is null if its is null it is empty
			{
				
				return true; 
			}
				return false;
		}
		
		public int size()
		
		{
			return size; // return size
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
		public T pop() {
			
			if (size == 0) // checking condition wheather top is null are not
			{
				System.out.println("invalid expression ");
				System.exit(0);

			}
			Node n=top;
			T res=(T) top.data;
			top=top.next;
			size--;
			return res;
		}

	}
	
	Stack<Character> stack=new Stack<Character>();
	
	
	// <---------------------------------------------------------------------------------------------->
	// <----------------------------QUEUE PROGRAM STARTED FROM HERE----------------------------------->
	// <---------------------------------------------------------------------------------------------->
	
	
	/**
	 * @purpose 	:Simulate Banking Cash Counter
	 * @version 	: 1.0
	 * @since		: 06-05-2019
	 */
	public class Queue<T>{
		int size;
		@SuppressWarnings("hiding")
		class Node<T>{   // creation of node
			T data;
			@SuppressWarnings("rawtypes")
			Node next;
		}
		
		@SuppressWarnings("rawtypes")
		Node front;		//front pointer
		@SuppressWarnings("rawtypes")
		Node rear;		//rear pointer
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void enqueue(T data)
		{
			
			Node node=new Node(); // new node to add element
			
			node.data=data;  	 //  assigning data to node
			node.next=null;		
			if( rear == null)	//comparing first node wether null or not
			{
				
				front=node;		// assigning first node as front 
				rear=node;		//assigning first node as rear
				size++;
			}
			else		
			{														
				Node n;
				n=front;
				while(n.next!=null)  // iteration to reach last node
				{
					n=n.next;
				}
				n.next=node;
				rear=node;
				size++;
			}
			
		}
		
		@SuppressWarnings("rawtypes")
		public void print()						//to print the elements
		{
			Node n=front;
			
			while(n!=null)						// loop to reach the end
			{
				System.out.println(n.data);
				n=n.next;
			}

		}
		
		
		
		@SuppressWarnings({ "rawtypes" })
		public void dequeue()					// method to remove from list
		{
			Node n=front;						//reference of front node
			if(size==0)
			{
				System.out.println("stack empty");
			}else
			{
				System.out.println(n.data);
				n=n.next;
				front=n;
				size--;
			}
			
		}
		
		public boolean isEmpty()				//returns true if it is empty
		{
			if(size==0)							//comparing the size
			{
				return true;
			}else
				return false;
		}
		
		public int size()						//to return the size value
		{
			return size;
		}
		
	}
	Queue<Integer> queue=new Queue<Integer>();
	
	
	//<-------------------------------------------------------------------------------------------->
	//<--------------------------------DQUEUE STARTED FROM HERE------------------------------------>
	//<-------------------------------------------------------------------------------------------->
	
	/**
	 * @purpose 	: Palindrome-Checker
	 * @version 	: 1.0
	 * @since		: 07-05-2019
	 */
	public class dequeue<T> 
	{
		int size=0;	// to know the size
		@SuppressWarnings("hiding")
		class Node<T>{
			T data;
			@SuppressWarnings("rawtypes")
			Node prev;	// to hold prevese node 
			
			@SuppressWarnings("rawtypes")
			Node next;	// to hold the next node address
		}
		@SuppressWarnings("rawtypes")
		Node front;
		@SuppressWarnings("rawtypes")
		Node rear;
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void addrear(T data)		// to add the data to queue
		{
			Node node=new Node();		// to create new node
			node.data=data;				// to store node data
			node.prev=null;				// to store previous node 
			node.next=null;				// to store next node
			if(rear==null)				// to make first if first is null
			{
				rear=node;
				front=node;
				size++;
			}else
			{
				Node n=front;
				while(n.next!=null)		// to add node at last
				{

					n=n.next;
				}
				node.prev=n;
				n.next=node;
				rear=node;
				size++;
			}
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void addfront(T data)
		{
			Node node=new Node();
			node.data=data;
			node.prev=null;
			node.next=null;
			
			if(front==null)
			{
				front=node;
				rear=node;
				size++;
			}
			else
			{
				node.next=front;
				node.prev=null;
				front.prev=node;
				front=node;
				size++;
			}
		}
		
		@SuppressWarnings("rawtypes")
		public void print()
		{
			Node n;
			n=front;
			while(n.next!=null)
			{
				System.out.println(n.data);
				n=n.next;
			}
			System.out.println(n.data);
			
		}
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public void removefront()
		{
			Node n=front.next;
			n.prev=null;
			System.out.println(front.data);
			front=n;
			
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void removerear()
		{
			Node n=front;
			while(n.next!=null)
			{
				n=n.next;
			}
			System.out.println(n.data);
			n=n.prev;
			n.next=null;
			rear=n;
			
		}
		
		public boolean isEmpty()
		{
			if(size==0)
			{
				return true;
			}
			return false;
		}
		public int size()
		{
			return size;
		}
		
		@SuppressWarnings("rawtypes")
		public boolean polindrome()
		{
			Node x=front;
			Node y=rear;
			for (int i = 0; i < size/2; i++) {
				if(x.data.equals(y.data)==true)
				{
					x=x.next;
					y=y.prev;
				}
				else
				{
					return false;
					
				}
				
			}return true;
			
			
		}
	}
	dequeue<Character> deq=new dequeue<Character>();
	
	
	//<-------------------------------------------------------------------------------------------->
		//<-----------------------------------DQUEUE END HERE---------------------------------------->
		//<-------------------------------------------------------------------------------------------->

	
/* day of week*/
	public static void dayOfWeek(int d,int m,int y) {

		
		int x= y + y/4 - y/100 +y/400;
		y= y-(14-m)/12;
		m= m+12*((14-m)/12)-2;
		d=(d+x+(31*m)/12)%7;
		//System.out.println(d);
		String days[]= {"Sunday","Monday","Tuseday","Wendesday","Thursday","Friday","Saturday"};
		System.out.println(days[d]);
	}
	
	
	//-------------------------Prime number-----------------------
	public static int [] isPrime() {
		int i,j,count;
		int value=0;
		int []arr1=new int[168];
	

	//functionality
	for(i=2;i<=1000;i++) {
		count=0;
		for(j=2;j<1000;j++){
			if(i%j==0) {
				count++;
				}
		}
			if(count==1) {
				
				arr1[value]=i;
				value++;
			
				
		}
		
	}
	return arr1;
	}

	//---------------------------number anagram--------------------
	
	public static boolean isAnagram(String s, String s1) {
		int l,l1;
		boolean x=false;
		l=s.length();
		l1=s1.length();
		char s2[]=new char[l+1];
		char s3[]=new char[l1+1];
		if(l!=l1) {
			return false;
		}
		else{
			s2=s.toCharArray();
			s3=s1.toCharArray();
			Arrays.sort(s2);
			Arrays.sort(s3);
			
			for(int i=0;i<l;i++) {
				if(s2[i]==s3[i]) {
					x=true;
				}
				else {
					x=false;
					break;
				}
			}
			if(x==true) {
				//System.out.println("Is anagram ");
//				for(int i=0;i<l;i++) {
//					System.out.println(s2[i]); its a printing logic 
//				}
				return true;
			}
			else {
				//System.out.println("Is not an anagram... ");
				return false;
			}
		}
	}
	
}
	

package com.Singleton;

public class MainClass {
public static void main(String[] args) {
	//show the message
	EagerSingleton eagerObject= EagerSingleton.getInstance();
	EagerSingleton eagerObject2= EagerSingleton.getInstance();
	
	StaticBlockSingelton staticSingletonObj= StaticBlockSingelton.getInstance();
	StaticBlockSingelton staticSingletonObj2=StaticBlockSingelton.getInstance();

	LazyInitialized LazyInitiObject= LazyInitialized.getInstance();
	LazyInitialized LazyInitiObject2= LazyInitialized.getInstance();
	
	ThreadSafe ThreadSafeObject = ThreadSafe.getInsatnce();
	ThreadSafe ThreadSafeObject2 = ThreadSafe.getInsatnce();
	
	DoubleCheckedLocking doubleCheckObject = DoubleCheckedLocking.getInsatnce();
	DoubleCheckedLocking doubleCheckObject2 = DoubleCheckedLocking.getInsatnce();
	
	BillPughSingleton BillPughObject = BillPughSingleton.getInstance();
	BillPughSingleton BillPughObject2 = BillPughSingleton.getInstance();


	
	System.out.println("\n--------------------------------------------Eager Intitialization Singleton ---------------------------------------------------\n");
	System.out.println("Example of  Eager Inatialization example: -> "+eagerObject.hashCode());
	System.out.println("Example of  Eager Inatialization example: ->"+eagerObject2.hashCode());
	System.out.println("\n------------------------------------------Static Block Initialization Singleton -------------------------------------------------\n");
	System.out.println("Example of  Eager Inatialization example: ->"+staticSingletonObj);
	System.out.println("Example of  Eager Inatialization example: ->"+staticSingletonObj2);
	System.out.println("\n--------------------------------------------Lazy Intitialization Singleton ---------------------------------------------------\n");
	System.out.println("Example of  Eager Inatialization example: ->"+LazyInitiObject);
	System.out.println("Example of  Eager Inatialization example: ->"+LazyInitiObject2);
	System.out.println("\n--------------------------------------------Thread Safe Singleton ---------------------------------------------------\n");
	System.out.println("Example of  Eager Inatialization example: ->"+ThreadSafeObject);
	System.out.println("Example of  Eager Inatialization example: ->"+ThreadSafeObject2);
	System.out.println("\n-------------------------------------------- Thread Safe Double Checked Locking ---------------------------------------------------\n");
	System.out.println("Example of  Eager Inatialization example: ->"+doubleCheckObject);
	System.out.println("Example of  Eager Inatialization example: ->"+doubleCheckObject2);
	System.out.println("\n-------------------------------------------- Bill Pugh Singleton ---------------------------------------------------\n");
	System.out.println("Example of  Eager Inatialization example: ->"+BillPughObject);
	System.out.println("Example of  Eager Inatialization example: ->"+BillPughObject2);
}
}


















//Try to use lambda expression for get instance method, but i also think its not possible
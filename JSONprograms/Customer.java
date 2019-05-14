package com.jsonprograms;

public class Customer
{
	private String name ;
	private int tcsShares;
	private int tataShares;
	private int mahendraShares;
	
	
	public String getName() {
		return name;
	}

		
	public void setName(String name) {
		this.name = name;
	}



	public int getTcsShares() {
		return tcsShares;
	}



	public void setTcsShares(int tcsShares) {
		this.tcsShares = tcsShares;
	}



	public int getTataShares() {
		return tataShares;
	}



	public void setTataShares(int tataShares) {
		this.tataShares = tataShares;
	}



	public int getMahendraShares() {
		return mahendraShares;
	}



	public void setMahendraShares(int mahendraShares) {
		this.mahendraShares = mahendraShares;
	}




	
	public Customer(String name, int tcsShares, int tataShares, int mahendraShares) {
		super();
		this.name = name;
		this.tcsShares = tcsShares;
		this.tataShares = tataShares;
		this.mahendraShares = mahendraShares;
	}


	public Customer() {
		
	}

	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-15s %-20d %-20d %-20d\n", name, tcsShares, tataShares, mahendraShares));
		
		return sb.toString();
	}
	
	
}

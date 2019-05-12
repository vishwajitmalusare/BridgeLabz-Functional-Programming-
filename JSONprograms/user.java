package com.jsonprograms;

public class user {
	
	//private String name;
	private String riceName;
	private int price;
	public user()
	{
		
	}
	public user(String riceName, int Price) {
		super();
		this.riceName = riceName;
		this.price=Price;
	}
	
	
	public String getRiceName() {
		return riceName;
	}
	public void setRiceName(String riceName) {
		this.riceName = riceName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int Price) {
		this.price = Price;
	}
	@Override
	public String toString() {
		return "user [riceName=" + riceName + ", Price=" + price + "]";
	}
	
	
	
}

package com.visitorpattern;

public class Fruit implements ItemElement{
	private int pricePerKg;
	private String name;
	private int weight;
	
	public Fruit(int priceKg,int wt,String nm) {
		this.pricePerKg=priceKg;
		this.weight=wt;
		this.name=nm;
	}
	
	public int getPricePerKg() {
		return pricePerKg;
	}
	public int getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}

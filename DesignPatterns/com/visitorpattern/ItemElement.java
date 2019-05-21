package com.visitorpattern;

public interface ItemElement {
	public int accept(ShoppingCartVisitor  visitor);
}

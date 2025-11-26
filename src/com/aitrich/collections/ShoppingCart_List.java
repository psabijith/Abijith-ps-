package com.aitrich.collections;

import java.util.ArrayList;

public class ShoppingCart_List {
	private String item;
	ArrayList<String> cart = new ArrayList<>();
	
	public ShoppingCart_List() {
		
	}
	public ShoppingCart_List(String item) {
		this.item = item;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	
	
public void addItems(String itm) {
	if(cart.contains(itm)) {
		System.out.println(itm + " already added!");
	}
	else {
		cart.add(itm);
		System.out.println(itm + " added to the cart");
	}
}
public void removeItem(String itm) {
	if(cart.contains(itm)) {
		cart.remove(itm);
		System.out.println(itm + " removed from cart");
		
	}
	else {
		System.out.println(itm + " not found in the cart");
	}
}
public void printCart() {
	System.out.println(cart);
}
}

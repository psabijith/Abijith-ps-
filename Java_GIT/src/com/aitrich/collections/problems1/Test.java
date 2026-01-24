package com.aitrich.collections.problems1;

public class Test {
	public static void main(String[] args) {
		ShoppingCart_List carts = new ShoppingCart_List();
		carts.addItems("milk");
		carts.addItems("Eggs");
		carts.addItems("milk");
		carts.printCart();
		carts.removeItem("Eggs");
		carts.printCart();
		
		EmailDeduplicationServiceSet ed = new EmailDeduplicationServiceSet();
		ed.deduplication();
	}
}

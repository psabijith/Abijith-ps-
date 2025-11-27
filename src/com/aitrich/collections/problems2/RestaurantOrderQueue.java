package com.aitrich.collections.problems2;

import java.util.LinkedList;

public class RestaurantOrderQueue {
	
	LinkedList<String> orders = new LinkedList<>();
	
	public void addOrder(String orderDetails) {
		orders.add(orderDetails);
	}
	public void removeOrder() {
		if(orders.isEmpty()) {
			System.out.println("No orders yet!");
		}
		else {
			String removed = orders.getFirst();
			orders.remove();
			System.out.println(removed+" removed!");
		}
	}
	public void processNextOrder(String newOrderDetails) {
		while(!orders.isEmpty()) {
			orders.remove();
		}
		addOrder(newOrderDetails);
	}
	public void addVIPOrder(String orderDetails, int position) {
		orders.add(position , orderDetails);
	}
	public void viewAllOrders() {
		System.out.println(orders);
	}
	public void cancelOrder(String item) {
		if(orders.contains(item)) {
			orders.remove(item);
		}
		else if(orders.isEmpty()) {
			System.out.println("Order list is empty");
		}
		else {
			System.out.println(item+" not found!");
		}
	}
}

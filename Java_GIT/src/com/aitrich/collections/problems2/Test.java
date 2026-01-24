package com.aitrich.collections.problems2;

public class Test {
	public static void main(String[] args) {
	RestaurantOrderQueue ro = new RestaurantOrderQueue();
	ro.addOrder("Chicken Biriyani");
	ro.addOrder("Beef biriyani");
	ro.addOrder("Appam");
	ro.addOrder("Meals");
	
	ro.viewAllOrders();
	
	ro.processNextOrder("Mandhi");
	ro.addOrder("Banana fritters");
	ro.addOrder("Fried Rice");
	ro.addOrder("Noodles");
	ro.addOrder("Ghee Rice");
	
	ro.viewAllOrders();
	
	ro.removeOrder();
	
	ro.viewAllOrders();
	
	ro.addVIPOrder("Shawarma", 0);
	ro.addVIPOrder("Shawaya", 3);
	
	ro.viewAllOrders();
	
	ro.cancelOrder("Chicken Biriyani");
	ro.cancelOrder("Noodles");
	
	ro.viewAllOrders();
	
	AttendanceTracker at = new AttendanceTracker();
	
	at.markAttendance(new Student(1,"Abijith","Java"));
	at.markAttendance(new Student(2,"Benlin","Java"));
	at.markAttendance(new Student(3,"Aswin","Java"));
	at.markAttendance(new Student(4,"Akshay","Java"));
	at.markAttendance(new Student(5,"Naveen","Java"));
	
	at.isPresent(1);
	
	at.getTotalPresent();
	
	at.getAttendanceList();
	
	
	}
}

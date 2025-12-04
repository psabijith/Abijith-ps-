package com.aitrich.collections.exercise.addressbook;

public class Address {
	public String roomNumber;
	public String building;
	public String street;
	public City city;
	public String phone;
	public String email;
	
	public Address() { }
	
	public Address(String roomNumber,String building,String street,City city,String phone,String email) {
		this.roomNumber = roomNumber;
		this.building = building;
		this.street = street;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}
	
	 @Override
	    public String toString() {
	        return roomNumber+ " " + building + " " + street + " " + city + " "+ phone + " " + email;
	    }
}

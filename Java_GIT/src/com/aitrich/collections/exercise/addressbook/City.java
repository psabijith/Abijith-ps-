package com.aitrich.collections.exercise.addressbook;

public class City {
	public String id;
	public String name;
	public Country country;
	
	public City() { }
	
	public City(String id,String name,Country country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}
	
	@Override
	public String toString() {
		return " CityId: " + id + " City: " + name + " Coutry: " + country;
	}
}

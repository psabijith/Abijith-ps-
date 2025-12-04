package com.aitrich.collections.exercise.addressbook;

import java.util.Objects;

public class Country {
	public String id;
	public String name;
	
	public Country() { }
	
	public Country(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return " CountryId: " + id + " Country: " + name; 
	}
	 @Override
	    public boolean equals(Object o) {
	        Country other = (Country) o;
	        return Objects.equals(id, other.id);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }
}

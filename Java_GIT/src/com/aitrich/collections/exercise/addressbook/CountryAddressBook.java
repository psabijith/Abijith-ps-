package com.aitrich.collections.exercise.addressbook;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class CountryAddressBook {
	Map <Country , List<Person>> countryMap;
	
	public CountryAddressBook() {
		countryMap = new HashMap<>();
	}
	
	public void addPerson(Person person) {
		Country country = person.homeAddress.city.country;
		countryMap.put(country,new ArrayList<Person>());
		countryMap.get(country).add(person);
	}
	public void getAllPerson() {
		System.out.println(countryMap);
	}
}

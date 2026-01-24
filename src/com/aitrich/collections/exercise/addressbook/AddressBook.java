package com.aitrich.collections.exercise.addressbook;

import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class AddressBook {
	Set<Person> personList;
	int count = 0;
	
	public AddressBook() {
		 personList = new TreeSet<>((p1, p2) -> {
	            int cmp = p1.firstName.compareTo(p2.firstName);
	            if (cmp != 0) return cmp;
	            return p1.lastName.compareTo(p2.lastName);
	        });		
	}
	
	public void addPerson(Person person) {
		personList.add(person);
		count++;
	}
	public void removePerson(Person person) {
		personList.remove(person);
		count--;
	}
	public void getAllPerson() {
		System.out.println(personList);
	}
	public Set<Person> getPersonsOlderThan25() {
	    Set<Person> result = new HashSet<>(); 

	    for (Person p : personList) {
	        if (p.getAge() > 25) {
	            result.add(p);
	        }
	    }

	    return result;
	}
	public Person getPersonWorkingInCity(String city){
		boolean found = false;
		for(Person p : personList ) {
			if(p.workAddress.city.name.equals(city)) {
				found = true;
				return p;
			}
		}
		if(found == false) {
			System.out.println("No person works at " + city);
		}
		return null;
	}
	public Set<Person> getPersonsWorkingInCityNotOlderThan20(String city) {
        Set<Person> result = new HashSet<>();

        for (Person p : personList) {
            if (p.workAddress.city.name.equalsIgnoreCase(city) && p.getAge() <= 20) {       
                result.add(p);
            }
        }

        return result;
    }
	public Map<City, List<Person>> listByCity() {

	    Map<City, List<Person>> cityMap = new HashMap<>();

	    for (Person p : personList) {
	        City city = p.homeAddress.city;

	        cityMap.computeIfAbsent(city, k -> new ArrayList<>()).add(p);
	    }

	    return cityMap;
	}
	public Map<Country, List<Person>> listByCountry() {
	    Map<Country, List<Person>> countryMap = new HashMap<>();

	    for (Person p : personList) {
	        Country country = p.homeAddress.city.country;
	        countryMap.computeIfAbsent(country, k -> new ArrayList<>()).add(p);
	    }

	    return countryMap;
	}
	public Map<Country, Map<City, List<Person>>> listByCountryThenCity() {

	    Map<Country, List<Person>> byCountry = listByCountry();
	    Map<Country, Map<City, List<Person>>> result = new HashMap<>();

	    for (Country country : byCountry.keySet()) {
	        Map<City, List<Person>> cityMap = new HashMap<>();
	        for (Person p : byCountry.get(country)) {
	            City city = p.homeAddress.city;
	            cityMap.computeIfAbsent(city, k -> new ArrayList<>()).add(p);
	        }
	        result.put(country, cityMap);
	    }
	    return result;
	}
	public Map<Country, Map<City, List<Person>>> listByCountryCityThenFirstName() {

	    Map<Country, Map<City, List<Person>>> map = listByCountryThenCity();
	    for (Country country : map.keySet()) {
	        for (City city : map.get(country).keySet()) {
	            List<Person> people = map.get(country).get(city);

	            Collections.sort(people, new Comparator<Person>() {
	                public int compare(Person p1, Person p2) {
	                    return p1.firstName.compareTo(p2.firstName);
	                }
	            });
	        }
	    }

	    return map;
	}
	public Map<Country, Map<City, List<Person>>> listByCountryCityThenAgeDesc() {

	    Map<Country, Map<City, List<Person>>> map = listByCountryThenCity();
	    for (Country country : map.keySet()) {
	        for (City city : map.get(country).keySet()) {
	            List<Person> people = map.get(country).get(city);
	            Collections.sort(people, new Comparator<Person>() {
	                public int compare(Person p1, Person p2) {
	                    return p2.getAge() - p1.getAge(); 
	                }
	            });
	        }
	    }

	    return map;
	}

}

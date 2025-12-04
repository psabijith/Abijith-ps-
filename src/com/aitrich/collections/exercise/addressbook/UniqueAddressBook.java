package com.aitrich.collections.exercise.addressbook;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueAddressBook {
	HashSet<Person> uniquePersonSet;
	
	public UniqueAddressBook() {
		uniquePersonSet = new HashSet<>();
	}
	public void addPerson(Person person) {
		if(uniquePersonSet.add(person)) {
			System.out.println("Added Successfully!");
		}
		else {
			System.out.println("Duplication  not allowed!");
		}
	}
	
	public void getPersonOrderedByAge() {
		ArrayList<Person> uniquePersonList = new ArrayList<>(uniquePersonSet);
	    uniquePersonList.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()));
	    for(Person p : uniquePersonList) {
	    	System.out.println(p);
	    }
	}
}

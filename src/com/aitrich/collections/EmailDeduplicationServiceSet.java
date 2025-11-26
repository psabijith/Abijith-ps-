package com.aitrich.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class EmailDeduplicationServiceSet {
	ArrayList<String> emails = new ArrayList<>();{
		emails.add("abc@gmail.com");
		emails.add("abc@gmail.com");
		emails.add("xyz@gmail.com");
		emails.add("abc@gmail.com");
		emails.add("fgh@gmail,com");
		emails.add("abc@gmail.com");
	}
	
	public EmailDeduplicationServiceSet() {
		
	}
	public EmailDeduplicationServiceSet(ArrayList<String> emails) {
		this.emails = emails;
	}
	
	public void deduplication() {
		HashSet<String> hs = new HashSet<>(emails);
		System.out.println("Deduplicated with hash set");
		System.out.println(hs);
		
		TreeSet<String> sortedhs = new TreeSet<>(hs);
		System.out.println("Sorted hash set");
		System.out.println(sortedhs);
		
		TreeSet<String> ts = new TreeSet<>(emails);
		System.out.println("Deduplicated with tree set");
		System.out.println(ts);
	}

}

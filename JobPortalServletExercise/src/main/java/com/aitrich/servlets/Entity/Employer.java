package com.aitrich.servlets.Entity;

public class Employer {
	
	private int id;
	private String companyName;
	private String email;
	
	public Employer(int id, String companyName, String email) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.email = email;
	}

	public Employer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employer [id=" + id + ", companyName=" + companyName + ", email=" + email + "]";
	}
	
	
}

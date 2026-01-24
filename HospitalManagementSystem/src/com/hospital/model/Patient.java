package com.hospital.model;

import java.time.LocalDateTime;

public class Patient {
	
	//FIELDS
	
	private int id;
	private String name;
	private String phone;
	private String email;
	private LocalDateTime createdAt ;
	
	public Patient() { }
	
	

	public Patient(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}



	public Patient(String name, String phone, String email, LocalDateTime createdAt) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.createdAt = createdAt;
	}


	public Patient(int id, String name, String phone, String email, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.createdAt = createdAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", createdAt="
				+ createdAt + "]";
	}
	
	
}

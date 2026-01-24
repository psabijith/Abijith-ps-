package com.hospital.model;

public class Doctor {
	
	private int id;
	private String name;
	private String specialization;
	
	public Doctor() {
		super();
	}
	
	public Doctor(String name, String specialization) {
		super();
		this.name = name;
		this.specialization = specialization;
	}

	public Doctor(int id, String name, String specialization) {
		super();
		this.id = id;
		this.name = name;
		this.specialization = specialization;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + "]";
	}
	
	
}

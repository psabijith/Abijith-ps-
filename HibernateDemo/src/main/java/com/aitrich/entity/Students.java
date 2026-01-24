package com.aitrich.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Students Table")

public class Students {
	@Id
	@Column(name="StudentId")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="StudentName")
	private String name;
	
	private String course;
	@Column(name="PhoneNo")
	private long phone;
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Students() {
		super();
	}
	public Students(int id, String name, String course, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", course=" + course + ", phone=" + phone + "]";
	}
	
	
	
	
}

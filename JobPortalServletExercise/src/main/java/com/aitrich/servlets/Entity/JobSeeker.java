package com.aitrich.servlets.Entity;

public class JobSeeker {
	
	private int id;
	private String name;
	private String email;
	private String skill;
	private String resume;
	
	public JobSeeker(int id, String name, String email, String skill, String resume) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.skill = skill;
		this.resume = resume;
	}

	public JobSeeker() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkills() {
		return skill;
	}

	public void setSkills(String skill) {
		this.skill = skill;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", name=" + name + ", email=" + email + ", skills=" + skill
				+ ", resume=" + resume + "]";
	}
	
	
}

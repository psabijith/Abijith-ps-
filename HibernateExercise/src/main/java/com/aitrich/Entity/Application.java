package com.aitrich.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private JobSeeker jobSeeker;
	@ManyToOne
	private Job job;
	private LocalDateTime applicationDate;
	private boolean status;
	public Application(int id, JobSeeker jobSeeker, Job job, LocalDateTime applicationDate, boolean status) {
		super();
		this.id = id;
		this.jobSeeker = jobSeeker;
		this.job = job;
		this.applicationDate = applicationDate;
		this.status = status;
	}
	public Application() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}
	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public LocalDateTime getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDateTime applicationDate) {
		this.applicationDate = applicationDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}

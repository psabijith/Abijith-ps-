package com.aitrich.JDBC.problem1.Domain;


public class Employee {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String department;
	private double salary;
	private String hireDate;
	private boolean isActive = true;
	
	public Employee() {}
	
	public Employee(int employeeId , String firstName , String lastName , String email , String phone , String department , double salary , String hireDate , boolean isActive){
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.salary = salary;
		this.hireDate = hireDate;
		this.isActive = isActive;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public String getHireDate() {
		return hireDate;
	}
	public boolean getStatus() {
		return isActive;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setStatus(boolean isActive) {
		this.isActive = isActive;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	 public String toString() {
		return "Employee Id: " + employeeId +
				"First Name: " + firstName +
				"Last Name: " + lastName + 
				"Email: " + email +
				"Phone: " + phone +
				"Department: " + department +
				"Salary: " + salary +
				"Is Active: " + isActive +
				"Date of Hiring: " + hireDate;
	}
}

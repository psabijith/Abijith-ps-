package com.aitrich.collections.exercise.addressbook;

public class Person {
	public String firstName;
	public String lastName;
	public String dateOfBirth;
	public Address homeAddress;
	public Address workAddress;
	
	public Person() { }
	
	public Person(String firstName,String lastName,String dateOfBirth,Address homeAddress,Address workAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}
	
	public int getAge() {
	    String[] parts = dateOfBirth.split("/");
	    int birthYear = Integer.parseInt(parts[2]);

	    int currentYear = 2025;  
	    return currentYear - birthYear;
	}
	
	@Override
	public boolean equals(Object o) {
		Person other = (Person) o;
		return this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName) && this.homeAddress.city.name.equals(other.homeAddress.city.name);
	}
	@Override
	public int hashCode() {
	    return (firstName
	            + lastName
	            + homeAddress.city.name)
	            .hashCode();
	}
	
	@Override
    public String toString() {
        return "Person\n{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", dateOfBirth='" + dateOfBirth + '\'' +
               ", homeAddress=" + homeAddress +
               ", workAddress=" + workAddress +
               "}\n";
    }
}

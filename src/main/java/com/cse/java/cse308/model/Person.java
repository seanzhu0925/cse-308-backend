package com.cse.java.cse308.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person", schema="weichang")
public class Person {
	 
	@Id
	@Column(name = "ssn")
	private String ssn;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "address")
	private String address;
	@Column(name = "salary")
	private String salary;
	
	public Person() { }
	
	public Person(String ssn, String lastName, String firstName, String address, String salary) {
		super();
		this.ssn = ssn;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [ssn=" + ssn + ", lastName=" + lastName + ", firstName=" + firstName + ", address=" + address
				+ ", salary=" + salary + "]";
	}

}

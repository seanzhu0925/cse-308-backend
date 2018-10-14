package com.cse.java.cse308.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Cacheable;
import javax.persistence.Column;

@Entity
@Table
public class Manager {
	@Id
	private String userName;
	
	
	
	public Manager(String UserName) {
		super();
		this.userName = UserName;
		
	}
	
	public Manager() {
		super();
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String UserName) {
		this.userName = UserName;
	}
}

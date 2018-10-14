package com.cse.java.cse308.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.EmbeddedId;

import java.util.Set;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Canvasser {
	@Id
	private String userName;
	
	@ElementCollection
	private List<String> date;

	public Canvasser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Canvasser(String userName, List<String> date) {
		super();
		this.userName = userName;
		this.date = date;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getDate() {
		return date;
	}

	public void setDate(List<String> date) {
		this.date = date;
	}
	
	
	
	
	
}

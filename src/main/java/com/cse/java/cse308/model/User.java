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
public class User {
	@Id
	
	private String userName;
	
	
	private String password;
	
	
	private int canvasserRole;
	
	
	private int systemRole;
	
	
	private int managerRole;
	
	public User(String UserName, String Password, int CanvasserRole, 
			int SystemRole, int ManagerRole) {
		super();
		
		this.userName = UserName;
		this.password = Password;
		this.canvasserRole = CanvasserRole;
		this.systemRole = SystemRole;
		this.managerRole = ManagerRole;
	}
	
	public User() {
		super();
	}
	
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String UserName) {
		this.userName = UserName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String Password) {
		this.password = Password;
	}
	
	public int getCanvasserRole() {
		return canvasserRole;
	}
	
	public void setCanvasserRole(int CanvasserRole) {
		this.canvasserRole = CanvasserRole;
	}
	
	public int getSystemRole() {
		return systemRole;
	}
	
	public void setSystemRole(int SystemRole) {
		this.systemRole = SystemRole;
	}
	
	public int getManagerRole() {
		return managerRole;
	}
	
	public void setManagerRole(int ManagerRole) {
		this.managerRole = ManagerRole;
	}
	
	
	@Override
	public String toString() {
		return "User : " + userName + ", Password: " + password;
	}
	
}
	

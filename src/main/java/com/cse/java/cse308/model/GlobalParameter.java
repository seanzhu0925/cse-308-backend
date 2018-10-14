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
public class GlobalParameter {
	@Id
	private String id;
	
	private int duration;
	
	private double averageSpeed;
	
	public GlobalParameter(String id,int Duration,double AverageSpeed) {
		super();
		this.id = id;
		this.duration = Duration;
		this.averageSpeed = AverageSpeed;
	}
	
	public GlobalParameter() {
		super();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int Duration) {
		this.duration = Duration;
	}
	
	public double getAverageSpeed() {
		return averageSpeed;
	}
	public void setAVerageSpeed(double AverageSpeed) {
		this.averageSpeed = AverageSpeed;
	}

}

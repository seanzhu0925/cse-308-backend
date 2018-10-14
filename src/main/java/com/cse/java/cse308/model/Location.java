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
public class Location {
	@Id
	private String address;
	private String campaignName;
	private int visited;
	
	
	public Location(String Address, String CampaignName, int Visited) {
		super();
		this.address = Address;
		this.campaignName = CampaignName;
		this.visited = Visited;
		
	}
	
	public Location() {
		super();
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address = Address;
	}
	
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String CampaignName) {
		this.campaignName = CampaignName;
	}
	
	public int getVisited() {
		return visited;
	}
	public void setVisited(int Visited) {
		this.visited = Visited;
	}
}
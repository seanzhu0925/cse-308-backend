package com.cse.java.cse308.model;

import javax.persistence.Entity;
import com.cse.java.cse308.model.Canvasser;
import com.cse.java.cse308.model.Location;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;

import java.util.*;

@Entity
@Table
public class Campaign {
	@Id
	@Column
	private String campaignName;
	
	@ElementCollection
	@Column
	private List<Manager> campaignManagers;
	@Column
	private String startDate;
	@Column
	private String endDate;
	@Column
	private int visitDuration;
	
	@ElementCollection
	@Column
	private List<Canvasser> canvassers;
	
	@ElementCollection
	@Column
	private List<Location> locations;
	
	@Column
	@ElementCollection
	private List<String> questionnaire;
	private String talkingPoint;
	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Campaign(String campaignName, List<Manager> campaignManagers, String startDate, String endDate,
			int visitDuration, List<Canvasser> canvassers, List<Location> locations,
			List<String> questionnaire, String talkingPoint) {
		super();
		this.campaignName = campaignName;
		this.campaignManagers = campaignManagers;
		this.startDate = startDate;
		this.endDate = endDate;
		this.visitDuration = visitDuration;
		this.canvassers = canvassers;
		this.locations = locations;
		this.questionnaire = questionnaire;
		this.talkingPoint = talkingPoint;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public List<Manager> getCampaignManagers() {
		return campaignManagers;
	}
	public void setCampaignManagers(List<Manager> campaignManagers) {
		this.campaignManagers = campaignManagers;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getVisitDuration() {
		return visitDuration;
	}
	public void setVisitDuration(int visitDuration) {
		this.visitDuration = visitDuration;
	}
	public List<Canvasser> getCanvassers() {
		return canvassers;
	}
	public void setCanvassers(List<Canvasser> canvassers) {
		this.canvassers = canvassers;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public List<String> getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(List<String> questionnaire) {
		this.questionnaire = questionnaire;
	}
	public String getTalkingPoint() {
		return talkingPoint;
	}
	public void setTalkingPoint(String talkingPoint) {
		this.talkingPoint = talkingPoint;
	}
	
	
}

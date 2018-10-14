package com.cse.java.cse308.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.java.cse308.model.Campaign;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;

public interface CampaignRepository extends JpaRepository<Campaign, String>{
	Campaign findByCampaignName(String CampaignName);
	

}
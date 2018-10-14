package com.cse.java.cse308.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.Campaign;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.persistance.CampaignRepository;
import com.cse.java.cse308.persistance.PersonRepository;


@Service
public class CampaignService {
	
	private CampaignRepository personRepository;

	@Autowired
	public CampaignService(CampaignRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	
	@Transactional
	public void savePerson(Campaign person) {
		personRepository.save(person);
    }

}

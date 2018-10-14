package com.cse.java.cse308.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.Location;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.persistance.LocationRepository;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.persistance.UserRepository;


@Service
public class LocationService {
	
	private LocationRepository personRepository;

	@Autowired
	public LocationService(LocationRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	
	@Transactional
	public void savePerson(Location person) {
		personRepository.save(person);
    }
	
	

}
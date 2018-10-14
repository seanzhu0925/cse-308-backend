package com.cse.java.cse308.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.Canvasser;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.persistance.CanvasserRepository;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.persistance.UserRepository;


@Service
public class CanvasserService {
	
	private CanvasserRepository personRepository;

	@Autowired
	public CanvasserService(CanvasserRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	
	@Transactional
	public void savePerson(Canvasser person) {
		personRepository.save(person);
    }
	
	

}
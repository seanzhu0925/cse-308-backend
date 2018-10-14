package com.cse.java.cse308.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.Manager;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.persistance.ManagerRepository;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.persistance.UserRepository;


@Service
public class ManagerService {
	
	private ManagerRepository personRepository;

	@Autowired
	public ManagerService(ManagerRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	
	@Transactional
	public void savePerson(Manager person) {
		personRepository.save(person);
    }
	
	

}
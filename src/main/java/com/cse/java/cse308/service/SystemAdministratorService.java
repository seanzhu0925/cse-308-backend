package com.cse.java.cse308.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.SystemAdministrator;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.persistance.SystemAdministratorRepository;
import com.cse.java.cse308.persistance.UserRepository;


@Service
public class SystemAdministratorService {
	
	private SystemAdministratorRepository personRepository;

	@Autowired
	public SystemAdministratorService(SystemAdministratorRepository personRepository) {
		super();
		this.personRepository = personRepository;
	} 
	
	
	@Transactional
	public void savePerson(SystemAdministrator person) {
		personRepository.save(person);
    }
	
	

}

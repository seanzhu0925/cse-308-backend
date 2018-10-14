package com.cse.java.cse308.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.GlobalParameter;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.persistance.GlobalParameterRepository;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.persistance.UserRepository;


@Service
public class GlobalParameterService {
	
	private GlobalParameterRepository personRepository;

	@Autowired
	public GlobalParameterService(GlobalParameterRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	
	@Transactional
	public void savePerson(GlobalParameter person) {
		personRepository.save(person);
    }
	
	

}
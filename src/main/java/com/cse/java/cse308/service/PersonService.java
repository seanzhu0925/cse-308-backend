package com.cse.java.cse308.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.persistance.PersonRepository;


@Service
public class PersonService {
	
	private PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}
	
	
	@Transactional
	public void savePerson(Person person) {
		personRepository.save(person);
    }

}

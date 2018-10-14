package com.cse.java.cse308.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.service.PersonService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class Controller {

	@Autowired
	private PersonService personService;
	@Autowired
	private PersonRepository personRepository;

	@RequestMapping("/")
	public String createUserView() {
		return "Welcome nigga!!!!"; 
	}

	@RequestMapping("/save/person/{salary}/{ssn}")
	public String savePerson(@PathVariable String salary, @PathVariable String ssn) {
		Person per1 = new Person();
		per1.setSalary(salary);
		per1.setAddress("8 Sophomore Ln, Stony Brook, 11790");
		per1.setFirstName("Keyu");
		per1.setLastName("Zhang Zhang");
		per1.setSsn(ssn);
		personService.savePerson(per1);
		return "Person is saved in DB:----" + per1.toString();
	}

	@GetMapping("/get/person/{ssn}")
	public boolean findPerson(@PathVariable String ssn) {
		Person per = personRepository.findTop1BySsn(ssn);
		return per != null ? true : false;
	}

}

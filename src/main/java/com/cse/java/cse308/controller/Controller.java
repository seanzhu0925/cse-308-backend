package com.cse.java.cse308.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.persistance.UserRepository;
import com.cse.java.cse308.service.PersonService;

@RestController
@CrossOrigin(origins = "http://10.1.138.226")
public class Controller {
	
	 @Autowired
	 private PersonService personService;
	 @Autowired
	 private PersonRepository personRepository;
	 @Autowired
	 private UserRepository userRepository;

	@RequestMapping("/")
	public String getToHomePage() {
		return "Hello World!";

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
	
	@RequestMapping("/save/user/{username}/{password}/{man}/{can}/{sys}")
	public String saveUser(@PathVariable String username, @PathVariable String password,
			@PathVariable String man,@PathVariable String can, @PathVariable String sys) {
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);
		int man1 = Integer.parseInt(man);
		user.setManagerRole(man1);
		int can1 = Integer.parseInt(can);
		user.setCanvasserRole(can1);
		int sys1 = Integer.parseInt(sys);
		user.setSystemRole(sys1);
		userRepository.save(user);
		return "User " + user.getUserName() + " is saved in DB";
		
	}
	
	@RequestMapping("/delete/user/{username}")
	public String deleteUser(@PathVariable String username) {
		
		userRepository.deleteById(username);
		
		return "User " + username + " is deleted.";
	}
	
	@RequestMapping("/update/user/man/1/{username}")
	public String updateUserMan1(@PathVariable String username) {
		User user = userRepository.findByUserName(username);
		user.setManagerRole(1);
		userRepository.save(user);
		
		return "ManagerRole updated to 1 for " + username;
	}
	
	@RequestMapping("/update/user/man/0/{username}")
	public String updateUserMan0(@PathVariable String username) {
		User user = userRepository.findByUserName(username);
		user.setManagerRole(0);
		userRepository.save(user);
		
		return "ManagerRole updated to 0 for " + username;
	}
	
	@RequestMapping("/update/user/can/1/{username}")
	public String updateUserCan1(@PathVariable String username) {
		User user = userRepository.findByUserName(username);
		user.setCanvasserRole(1);
		userRepository.save(user);
		
		return "CanvasserRole updated to 1 for " + username;
	}
	
	@RequestMapping("/update/user/can/0/{username}")
	public String updateUserCan0(@PathVariable String username) {
		User user = userRepository.findByUserName(username);
		user.setCanvasserRole(0);
		userRepository.save(user);
		
		return "CanvasserRole updated to 0 for " + username;
	}
	
	
	@RequestMapping("/update/user/sys/1/{username}")
	public String updateUserSys1(@PathVariable String username) {
		User user = userRepository.findByUserName(username);
		user.setSystemRole(1);
		userRepository.save(user);
		
		return "SystemRole updated to 1 for " + username;
	}
	
	@RequestMapping("/update/user/sys/0/{username}")
	public String updateUserSys0(@PathVariable String username) {
		User user = userRepository.findByUserName(username);
		user.setSystemRole(0);
		userRepository.save(user);
		
		return "SystemRole updated to 0 for " + username;
	}

	@GetMapping("/get/person/{ssn}")
	public boolean findPerson(@PathVariable String ssn) {
		
		Person per = personRepository.findTop1BySsn(ssn);
		return per != null ? true : false;
	}
	
	@GetMapping("/get/user/{username}")
	public User findUser(@PathVariable String username) {
		User user = userRepository.findByUserName(username);
		return user;
	}
	

}

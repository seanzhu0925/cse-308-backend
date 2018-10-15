package com.cse.java.cse308.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.model.UserDetailsRequestModel;
import com.cse.java.cse308.persistance.PersonRepository;
import com.cse.java.cse308.persistance.UserRepository;
import com.cse.java.cse308.service.PersonService;
import com.cse.java.cse308.service.UserService;

@RestController
@CrossOrigin(origins = "http://http://localhost:8000/")
public class Controller {

	@Autowired
	private PersonService personService;
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String getToHomePage() {
		return "Hello World!";

	}

	@GetMapping("/get/users")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/create/user")
	public boolean creaetNewUser(@RequestBody UserDetailsRequestModel requestUserDetails) {
		User user = userRepository.findByUserName(requestUserDetails.getUserName());
		if (user == null) {
			user = new User();
			user.setUserName(requestUserDetails.getUserName());
			user.setPassword(requestUserDetails.getPassword());
			user.setCanvasserRole(Integer.parseInt(requestUserDetails.getCanvasserRole()));
			user.setManagerRole(Integer.parseInt(requestUserDetails.getManagerRole()));
			user.setSystemRole(Integer.parseInt(requestUserDetails.getSystemRole()));
			user.setWorkStatus(Integer.parseInt(requestUserDetails.getWorkStatus()));
			userService.saveUser(user);
			return true;
		} else {
			return false;
		}
	}

	@PutMapping("/update/user")
	public boolean updateUser(@RequestBody UserDetailsRequestModel requestUserDetails) {
		User user = userRepository.findByUserName(requestUserDetails.getUserName());
		if (user == null) {
			return true;
		} else {
			user.setUserName(requestUserDetails.getUserName());
			user.setPassword(requestUserDetails.getPassword());
			user.setCanvasserRole(Integer.parseInt(requestUserDetails.getCanvasserRole()));
			user.setManagerRole(Integer.parseInt(requestUserDetails.getManagerRole()));
			user.setSystemRole(Integer.parseInt(requestUserDetails.getSystemRole()));
			user.setWorkStatus(Integer.parseInt(requestUserDetails.getWorkStatus()));
			userService.saveUser(user);
			return false;
		}
	}

	@DeleteMapping("/delete/user/{username}")
	public void deleteUser(@PathVariable String username) {
		userRepository.deleteById(username);
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

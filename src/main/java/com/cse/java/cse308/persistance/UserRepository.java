package com.cse.java.cse308.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;

@CrossOrigin(origins = "http://localhost:8001/api")
public interface UserRepository extends JpaRepository<User, String>{
	
	User findByUserName(String username);

}

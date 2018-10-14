package com.cse.java.cse308.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.SystemAdministrator;

public interface SystemAdministratorRepository extends JpaRepository<SystemAdministrator, String>{
	
	SystemAdministrator findByUserName(String username);

}
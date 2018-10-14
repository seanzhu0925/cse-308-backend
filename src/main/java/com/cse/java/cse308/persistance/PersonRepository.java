package com.cse.java.cse308.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.java.cse308.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String>{
	
	Person findTop1BySsn(String ssn);

}

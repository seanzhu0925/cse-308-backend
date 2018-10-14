package com.cse.java.cse308.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.Location;

public interface LocationRepository extends JpaRepository<Location, String>{
	
	Location findByAddress(String address);

}
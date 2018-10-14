package com.cse.java.cse308.persistance;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cse.java.cse308.model.GlobalParameter;
import com.cse.java.cse308.model.Person;
import com.cse.java.cse308.model.User;

public interface GlobalParameterRepository extends JpaRepository<GlobalParameter, Integer>{
	

}
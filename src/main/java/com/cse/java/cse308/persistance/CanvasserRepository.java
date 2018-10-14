package com.cse.java.cse308.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cse.java.cse308.model.Canvasser;

public interface CanvasserRepository extends JpaRepository<Canvasser, String>{
	Canvasser findByUserName(String username);
	

}
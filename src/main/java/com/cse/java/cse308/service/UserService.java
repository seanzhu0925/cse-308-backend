package com.cse.java.cse308.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.cse.java.cse308.model.Campaign;
import com.cse.java.cse308.model.Canvasser;
import com.cse.java.cse308.model.GlobalParameter;
import com.cse.java.cse308.model.Location;
import com.cse.java.cse308.model.Manager;
import com.cse.java.cse308.model.SystemAdministrator;
import com.cse.java.cse308.model.User;
import com.cse.java.cse308.persistance.CampaignRepository;
import com.cse.java.cse308.persistance.CanvasserRepository;
import com.cse.java.cse308.persistance.GlobalParameterRepository;
import com.cse.java.cse308.persistance.LocationRepository;
import com.cse.java.cse308.persistance.ManagerRepository;
import com.cse.java.cse308.persistance.SystemAdministratorRepository;
import com.cse.java.cse308.persistance.UserRepository;


@Service
public class UserService {
	
	private UserRepository userRepository;
	
	private SystemAdministratorRepository systemRepository;
	
	private ManagerRepository managerRepository;
	
	private LocationRepository locationRepository;
	private GlobalParameterRepository globalParameterRepository;
	private CanvasserRepository canvasserRepository;
	private CampaignRepository campaignRepository;
	
	

	@Autowired
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	
	@Transactional
	public void saveUser(User person) {
		userRepository.save(person);
    }
	
	@Transactional
	public void saveSystemAdministrator(SystemAdministrator person) {
		systemRepository.save(person);
    }
	
	@Transactional
	public void saveManager(Manager person) {
		managerRepository.save(person);
    }
	
	@Transactional
	public void saveLocation(Location person) {
		locationRepository.save(person);
    }
	
	@Transactional
	public void saveGlobalParameter(GlobalParameter person) {
		globalParameterRepository.save(person);
    }
	
	@Transactional
	public void saveCanvasser(Canvasser person) {
		canvasserRepository.save(person);
    }
	
	@Transactional
	public void saveCampaign(Campaign person) {
		campaignRepository.save(person);
    }


	public List<User> getAllUsers() {
		List<User> userList= userRepository.findAll();
		return userList;
	}
	
	
	

}
package com.htc.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.userservice.entity.Userservice;
import com.htc.userservice.service.UserserviceInterface;

@RestController
@RequestMapping("/api")

public class UserserviceConteroller {
	@Autowired
	UserserviceInterface userServiceInterface;
	
	@PostMapping("/adduser") 
	public Userservice createNewUser(@RequestBody Userservice userService) {
		   
		 return userServiceInterface.save(userService);
		 
	}
	
}



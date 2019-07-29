package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.Users;
import com.revature.service.UsersService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/RegistrationController")
public class RegistrationController {
	  
	  @Autowired
	  public UsersService usersServiceImpl;
	  
	  @RequestMapping(value = "/register", method = RequestMethod.POST)
	  public Users addUser(@RequestBody Users user) {
		  System.out.println(user);
		  usersServiceImpl.createUsers(user);
		  return user;
	  }
	  
	  @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public boolean recoverUser(@RequestBody Users user) {
		  System.out.println(user);
		  System.out.println("In recoverUser");
		  boolean check = usersServiceImpl.validateUser(user.getFirstName(), user.getLastName());
		  System.out.println(check);
		  return check;
	  }
	}

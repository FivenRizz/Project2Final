package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.revature.entity.Post;
import com.revature.entity.Users;
import com.revature.service.UsersService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {
	

	@Autowired
	public UsersService usersServiceImpl;
	
	@RequestMapping(value="/user/{user}/pass/{password}", method=RequestMethod.GET)
	public boolean login(@PathVariable("user") String user, @PathVariable("password") String pass) {
		
		boolean isLogin = usersServiceImpl.validateUser(user, pass);
		
		return isLogin;
				
	}
	
	@RequestMapping(value="mylogin/{user}/pass/{password}", method=RequestMethod.GET)
	public Users hello(@PathVariable("user") String user, @PathVariable("password") String pass) {
		
		Users user1 = usersServiceImpl.returnUser(user, pass);
		
		System.out.println(user1);
		return user1;
		}
	}

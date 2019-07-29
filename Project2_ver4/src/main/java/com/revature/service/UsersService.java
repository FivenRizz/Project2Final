package com.revature.service;

import java.util.List;

import com.revature.entity.Users;

public interface UsersService {
	
	public void createUsers(Users users);
	public boolean validateUser (String  username, String password);
	public Users returnUser (String  username, String password);
}

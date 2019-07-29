package com.revature.dao;

import java.util.List;

import com.revature.entity.Users;

public interface UsersDAO {
	
	public void addUsers(Users users);
	public boolean validateUser (String username, String password);
	public Users returnUser (String username, String password);
}

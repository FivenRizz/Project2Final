package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.dao.UsersDAO;
import com.revature.dao.UsersDAOImpl;
import com.revature.entity.Users;

@Service ("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersDAOImpl usersDAOImpl;

	@Override
	@Transactional
	public void createUsers(Users users) {
		// adds a single user to a table
		usersDAOImpl.addUsers(users);
	}

	
	@Override
	@Transactional
	public boolean validateUser (String username, String password) {
		boolean isLogin = usersDAOImpl.validateUser(username, password);
		return isLogin;
	}
	
	@Override
	@Transactional
	public Users returnUser (String username, String password) {
		Users user = usersDAOImpl.returnUser(username, password);
		return user;
	}

}

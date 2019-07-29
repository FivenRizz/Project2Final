package com.revature.entity;

public class TempUser {
	
	String username;
	String password;
	
	public TempUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TempUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "TempUser [username=" + username + ", password=" + password + "]";
	}

}

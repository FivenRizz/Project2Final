package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.entity.Post;
import com.revature.entity.Users;

@Repository("usersDAO")
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	SessionFactory sessionFact;

	@Override
	public void addUsers(Users users) {
		Session currentSession = sessionFact.getCurrentSession();
		currentSession.save(users);
		System.out.println("data saved");
	}
	
	@Override
	 public boolean validateUser (String  username, String password){
		 Session currentSession = sessionFact.getCurrentSession();
		 
		 Query query1 = currentSession.createQuery("select u.password from Users u where u.userName =:Uname").setParameter("Uname", username);
		 
		 String RealPassword = (String) query1.uniqueResult();

		 System.out.println(RealPassword);
		 
		 if(RealPassword.equals(password)) {
			 
			Query query = currentSession.createQuery("select u.userId from Users u where u.userName =:Uname").setParameter("Uname", username);
			 int id = (Integer) query.uniqueResult();
			 
			 Users user = currentSession.byId(Users.class).load(id);
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	
	@Override
	 public Users returnUser (String  username, String password){
		 Session currentSession = sessionFact.getCurrentSession();
		 
		 Query query1 = currentSession.createQuery("select u.password from Users u where u.userName =:Uname").setParameter("Uname", username);
		 
		 String RealPassword = (String) query1.uniqueResult();

		 System.out.println(RealPassword);
		 
		 if(RealPassword.equals(password)) {
			 
			Query query = currentSession.createQuery("select u.userId from Users u where u.userName =:Uname").setParameter("Uname", username);
			 int id = (Integer) query.uniqueResult();
			 
			 Users user = currentSession.byId(Users.class).load(id);
			 return user;
		 }
		 else {
			 return null;
		 }
	}
		
}

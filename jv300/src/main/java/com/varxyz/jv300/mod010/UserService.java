package com.varxyz.jv300.mod010;

import java.util.List;

public class UserService {

	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public User createUser(String userId, String passwd, String userName, String ssn, String email, String addr) {
		return new User(userId, passwd, userName, ssn, email, addr);		
	}
	
	public void addUser(User user) {
		userDao.addUser(user);
	}

	public List<User> getAllUsers() {
		return userDao.findAll();	
	}
}

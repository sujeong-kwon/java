package com.varxyz.jv300.mod011;

import java.util.List;


public class UserService {

	private UserDao userDao;
	
	public UserService() {
		userDao = new UserDao();
	}
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user) {
		userDao.addUser(user);
	}
	
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	public List<User> getAllUsers() {
		return userDao.findAll();	
	}
	
	public User getUser(Long uId) {
		return userDao.findUser(uId);
	}
	
	public boolean isValidUser(String userId, String passwd) {
		return userDao.findUserByIdPw(userId, passwd);
	}
}

package com.eteam.chacha.user.service;

import java.util.List;

import com.eteam.chacha.user.dao.UserDao;
import com.eteam.chacha.user.domain.User;


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

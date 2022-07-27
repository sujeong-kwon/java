package com.teamecho.chacha.user.service;

import java.util.HashMap;
import java.util.Map;

import com.teamecho.chacha.user.dao.UserDao;
import com.teamecho.chacha.user.domain.User;

public class UserService {
	private static final UserService service = new UserService();
	private UserDao userDao = new UserDao();
	
	public static UserService getInstance() {
		return service;
	}
	
	public void addUser(User user) {
		userDao.addUser(user);
	}

	public boolean isValidUser(String userId, String passwd) {
		Map<String, String> findIdPW = new HashMap<String, String>();
		findIdPW = userDao.isValidUser(userId, passwd);
		if(userId.equals(findIdPW.get("userId")) && passwd.equals(findIdPW.get("passwd"))) {
			return true;
		} else {			
			return false;
		}
	}
	
	public User findUserByUserId(String userId) {
		return userDao.findUserByUserId(userId);
	}
	
	public Long findUIdByUserId(String userId) {
		return userDao.findUIdByUserId(userId);
	}
	
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
}

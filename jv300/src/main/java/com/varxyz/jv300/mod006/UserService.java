package com.varxyz.jv300.mod006;

import java.util.ArrayList;
import java.util.List;

public class UserService {

//	private static final UserService service = new UserService();
	private List<User> userlist = new ArrayList<>();
	
//	public static UserService getInstance() {
//		return service;
//	}
	
	public void addUser(User user) {
		userlist.add(user);
	}
}

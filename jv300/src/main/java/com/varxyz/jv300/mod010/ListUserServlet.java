package com.varxyz.jv300.mod010;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mod010/list_users.do")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private List<User> userList;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
//		List<User> userList = new ArrayList<>();
		userService = new UserService();
		userList = userService.getAllUsers();
//		List<User> userList = dao.findAll();
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("list_users.jsp").forward(request, response);
	}

}

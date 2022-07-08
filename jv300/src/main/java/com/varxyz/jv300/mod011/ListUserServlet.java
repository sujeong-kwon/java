package com.varxyz.jv300.mod011;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mod011/list_users.do")
public class ListUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private List<User> userList;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		userService = new UserService();
		userList = userService.getAllUsers();
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("list_users.jsp").forward(request, response);
	}
}

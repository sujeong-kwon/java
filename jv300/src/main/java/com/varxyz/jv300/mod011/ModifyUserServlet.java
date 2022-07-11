package com.varxyz.jv300.mod011;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod011/modify_user.do")
public class ModifyUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private User user;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("진입");
		String aa = request.getParameter("uid");
		System.out.println(aa);
		userService = new UserService();
		Long uId = Long.valueOf(aa);
		user = userService.getUser(uId);
		System.out.println(user);
		System.out.println(user.getUserName());
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("modify_user.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 한글처리
		
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String userName = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email = request.getParameter("email");
		String addr = request.getParameter("addr");
		String uid = request.getParameter("uid");
		
		UserDao userDao = new UserDao();
		
		User user = new User();
		user.setUserId(userId);
		user.setPasswd(passwd);
		user.setUserName(userName);
		user.setSsn(ssn);
		user.setEmail(email);
		user.setAddr(addr);
		user.setUid(Long.valueOf(uid));
		
		userService = new UserService(userDao);
		userService.updateUser(user);
		
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("update_success.jsp");
		dispatcher.forward(request, response);	
	}
}

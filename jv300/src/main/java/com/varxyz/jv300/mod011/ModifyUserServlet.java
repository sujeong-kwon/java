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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 한글처리
		
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String userName = request.getParameter("userName");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String ssn = request.getParameter("ssn");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		
		UserDao userDao = new UserDao();
		
		User user = new User();
		user.setUserId(userId);
		user.setPasswd(passwd);
		user.setUserName(userName);
		user.setSsn(ssn);
		user.setEmail(email1 + "@" + email2);
		user.setAddr(addr1 + " " + addr2);
		
		userService = new UserService(userDao);
		userService.updateUser(user);
		
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("modify_user.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

}

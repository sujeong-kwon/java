package com.teamecho.chacha.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.user.domain.User;
import com.teamecho.chacha.user.service.UserService;

@WebServlet("/user_update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// session(true) -> session없으면 새로 만듦
		// session(false)
		HttpSession session = request.getSession(false);
		String userId = (String)session.getAttribute("userId");
		
		userService = UserService.getInstance();
		User user = new User();
		user = userService.findUserByUserId(userId);
		
		request.setAttribute("user", user);
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("/user/update.jsp");
	    dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userId");
	    String passwd = request.getParameter("password");
	    String userName = request.getParameter("userName");
	    String userPhone = request.getParameter("phoneNum");
	    String addr = request.getParameter("addr");
	    String licenseNumber = request.getParameter("licenseNumber");
	    
	    User user = new User();
	    user.setUserId(userId);
	    user.setPasswd(passwd);
	    user.setUserName(userName);
	    user.setUserPhone(userPhone);
	    user.setAddr(addr);
	    user.setLicenseNumber(licenseNumber);
	    
	    userService = UserService.getInstance();
	    userService.updateUser(user);
	    
	    response.sendRedirect("/chacha/user/mypage.jsp");
	}

}

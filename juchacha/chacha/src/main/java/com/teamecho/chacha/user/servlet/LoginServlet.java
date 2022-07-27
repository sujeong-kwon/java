package com.teamecho.chacha.user.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.user.service.UserService;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	public void init() {
		userService = new UserService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 페이지로 들어와서 login페이지로 보냄
		request.getRequestDispatcher("./").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		
		if(!userService.isValidUser(userId, passwd)) {
			request.getRequestDispatcher("/user/re_login.jsp").forward(request, response);
			return;
		}
		
		// 사용자 확인이 됐을때
		HttpSession session = request.getSession(true);
		session.setAttribute("userId", userId);
		// 로그인 성공 후 next page
		response.sendRedirect("/chacha/parkinglot/get_parking.do");
	}

}

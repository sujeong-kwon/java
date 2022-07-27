package com.teamecho.chacha.user.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamecho.chacha.user.domain.User;
import com.teamecho.chacha.user.service.UserService;

@WebServlet("/user/add_user.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userId");
	    String passwd = request.getParameter("password");
	    String userName = request.getParameter("userName");
	    String userPhone = request.getParameter("phoneNum1");
	    String userPhone2 = request.getParameter("phoneNum");
	    String addr1 = request.getParameter("addr1");
	    String addr2 = request.getParameter("addr2");
	    String licenseNumber = request.getParameter("licenseNumber");
	    
	    List<String> err = new ArrayList<String>();
	    if(userId == null || userId.length() == 0) {
	    	err.add("아이디는 필수입력 정보입니다.");
	    }
	    if (passwd == null || passwd.length() == 0) {
	    	err.add("비밀번호 필수입력정보입니다.");
	    }
	    if (userName == null || userName.length() == 0) {
	    	err.add("이름 필수입력정보입니다.");
	    }
	    if (userPhone == null || userPhone.length() == 0) {
	    	err.add("휴대폰번호 필수입력정보입니다.");
	    }
	    if (userPhone2 == null || userPhone2.length() == 0) {
	    	err.add("휴대폰번호 필수입력정보입니다.");
	    }
	    if (addr1 == null || addr1.length() == 0) {
	    	err.add("주소 필수입력정보입니다.");
	    }
	    if (addr2 == null || addr2.length() == 0) {
	    	err.add("주소 필수입력정보입니다.");
	    }
	    if (licenseNumber == null || licenseNumber.length() == 0) {
	    	err.add("차량번호 필수입력정보입니다.");
	    }
	    User user = new User();
	    user.setUserId(userId);
	    user.setPasswd(passwd);
	    user.setUserName(userName);
	    user.setUserPhone(userPhone+"-"+userPhone2);
	    user.setAddr(addr1 + " " + addr2);
	    user.setLicenseNumber(licenseNumber);
	    
	    userService = UserService.getInstance();
	    userService.addUser(user);
	    request.setAttribute("user",user);
	    
	    
	    RequestDispatcher dispatcher = null;
	    if(err.size() > 0) {
		    request.setAttribute("error", err);
		    dispatcher = request.getRequestDispatcher("/error/error.jsp");
		    dispatcher.forward(request, response);
	    	return ;
	    }
	    
	    
	    response.sendRedirect("../");
	}

}

package com.varxyz.jv300.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod004/add_user.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_USERID = "example123";
	private static final String DEFAULT_PASSWD = "123456";
	private static final String DEFAULT_NAME = "홍길동";
	private static final String DEFAULT_SSN = "000000";
	private static final String DEFAULT_EMAIL1 = "example123";
	private static final String DEFAULT_EMAIL2 = "gmail.com";
	private static final String[] DEFAULT_CONCERNS = {"없음"};

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("userName");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String[] concerns = request.getParameterValues("concerns");
		if(userId == null || userId.length() == 0) {
			userId = DEFAULT_USERID;
		}
		if(passwd == null || passwd.length() == 0) {
			passwd = DEFAULT_PASSWD;
		}
		if(name == null || name.length() == 0) {
			name = DEFAULT_NAME;
		}
		if(ssn == null || ssn.length() == 0) {
			ssn = DEFAULT_SSN;
		}
		if(email1 == null || email1.length() == 0) {
			email1 = DEFAULT_EMAIL1;
		}
		if(email2 == null || email2.length() == 0) {
			email2 = DEFAULT_EMAIL2;
		}
		if(concerns == null || concerns.length == 0) {
			concerns = DEFAULT_CONCERNS;
		}
			
		String pageTitle = "SignUP";
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>"+pageTitle+"</title></head>");
			out.println("<style>body {color: black;}</style>");
			out.println("<body>");
			out.println("<h3> 회원 아이디 : "+ userId +"</h3>");
			out.println("<h3> 비밀번호 : "+ passwd +"</h3>");
			out.println("<h3> 이름 : "+ name +"</h3>");
			out.println("<h3> 주민번호 : "+ ssn +"</h3>");
			out.println("<h3> 이메일 : "+ email1 + "@" + email2 +"</h3>");
			out.println("<h3>관심분야 : ");
			for(int i = 0; i < concerns.length; i++) {
				out.println(concerns[i]);
				if( i < concerns.length-1) {
					out.println(", ");
				}
			}
			out.println("</h3>");
			out.close();
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}

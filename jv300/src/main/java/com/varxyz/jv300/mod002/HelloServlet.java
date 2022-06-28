package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{ // HelloServlet -> HttpServlet -> GenericServlet -> Servlet(Server + let 작은 서버)
	// Servlet은 인터페이스
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      String pageTitle = "Hello World";
	      response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();
	      out.println("<html>");
	      out.println("<head><title>"+pageTitle+"</title></head>");
	      out.println("<body>");
	      out.println("<h3>Welcome to 서블릿 프로그램</h3>");
	      out.println("</body></html>");
	      out.close();
	   }
}
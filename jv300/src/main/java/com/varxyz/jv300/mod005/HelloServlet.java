package com.varxyz.jv300.mod005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet2", urlPatterns = {"/mod005/hello.jsp"})
public class HelloServlet extends HttpServlet{ // HelloServlet -> HttpServlet -> GenericServlet -> Servlet(Server + let 작은 서버)
	   private static final String DEFAULT_NAME = "World";
	   	   
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      String pageTitle = "Hello World";
	      
	      String name = request.getParameter("userName");
	  	  if(name == null || name.length() == 0){
	  		  name =DEFAULT_NAME;
	  	  }
	      
	      response.setContentType("text/html;charset=UTF-8");
	      PrintWriter out = response.getWriter();
	      out.println("<html>");
	      out.println("<head><title>"+pageTitle+"</title></head>");
	      out.println("<body>");
	      out.println("<h3>Hello, " + name  + "</h3>");
	      out.println("</body></html>");
	      out.close();
	   }
}
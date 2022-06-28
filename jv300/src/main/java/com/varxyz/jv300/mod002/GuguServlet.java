package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuguServlet extends HttpServlet{	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		String pageTitle = "Gugudan";
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>"+pageTitle+"</title>");
		out.println("</head>");
		out.println("<style>body {color: red;}</style>");
		out.println("<body>");
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				out.println("<span>" + j + "*" + i + "=" + i*j + "</span>");
			}
			out.println("<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}

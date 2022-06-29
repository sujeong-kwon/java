package com.varxyz.jv300.mod003;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigTestServlet extends HttpServlet{
	private static final String DEFAULT_SEASONS = "Spring, Summer, Fall, Winter";
	private String[] seasons;
	
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		String season_list = config.getInitParameter("season-list");
//		if(season_list == null) {
//			season_list = DEFAULT_SEASONS;
//		}
//		seasons = season_list.split(", ");
//	}
	
	@Override
	public void init() throws ServletException {
		String season_list = getInitParameter("season-list");
		if(season_list == null) {
			season_list = DEFAULT_SEASONS;
		}
		seasons = season_list.split(", ");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h3>ServletConfig Test</h3>");
		out.println("<ul>");
		for(String season : seasons) {
			out.println("<li>" + season + "</li>");
		}
		out.println("</ul>");
		out.println("</body></html>");
		out.close();
	}
}

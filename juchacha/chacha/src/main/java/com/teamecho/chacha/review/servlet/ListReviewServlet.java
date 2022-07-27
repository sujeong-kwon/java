package com.teamecho.chacha.review.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamecho.chacha.review.domain.Review;
import com.teamecho.chacha.review.service.ReviewService;

@WebServlet("/review/list_reviews.do")
public class ListReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReviewService reviewService;
	private List<Review> reviewList;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String pid = request.getParameter("pid");
		reviewService = new ReviewService();
		Long pId = Long.valueOf(pid);
		reviewList = reviewService.getAllReviews(pId);
		request.setAttribute("reviewList", reviewList);
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}
}

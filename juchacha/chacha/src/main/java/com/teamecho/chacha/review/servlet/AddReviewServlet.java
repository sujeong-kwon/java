package com.teamecho.chacha.review.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.review.dao.ReviewDao;
import com.teamecho.chacha.review.domain.Review;
import com.teamecho.chacha.review.service.ReviewService;

@WebServlet("/review/write_review.do")
public class AddReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReviewService reviewService = ReviewService.getInstance();
	RequestDispatcher dispatcher = null;
	ParkingLot parking;
	long uId;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(false);
		
		long pId = Long.valueOf(request.getParameter("pid"));
		String userId = (String) session.getAttribute("userId");
		
		if(userId == null || userId.length() == 0) {
	         response.setContentType("text/html; charset=UTF-8");
	         PrintWriter writer = response.getWriter();
	         writer.println("<script>alert('로그인 후 사용 해주시기 바랍니다.'); location.href='/chacha';</script>"); // 경고창 띄우기
	         writer.close(); // close를 해주면 response.reDirect가 안되므로 alert에서 location.href 속성을 사용하여 페이지를 이동시켜준다.
	         return;
	     }
		
		parking = reviewService.getParkingLotByPid(pId);
		uId = reviewService.getUIdByUserId(userId);
		
		request.setAttribute("parking", parking);
		dispatcher = request.getRequestDispatcher("write_review.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String pid = request.getParameter("pid");
		String star__rating = request.getParameter("star_rating");
		String content = request.getParameter("content");
		
		Integer star_rating = Integer.valueOf(star__rating);
	
		ReviewDao reviewDao = new ReviewDao();
		
		Review review = new Review();
		review.setUid(uId);
		review.setPid(parking.getPid());
//		review.setParkingLot(new ParkingLot(Long.valueOf(pid)));
		review.setStar_rating(star_rating);
		review.setContent(content);
		
		reviewService = new ReviewService(reviewDao);
		reviewService.addReview(review);
		
		request.setAttribute("review", review);
//		dispatcher = request.getRequestDispatcher("success.jsp");
//		dispatcher.forward(request, response);
		String url = "/chacha/parking/get_parking_point.do?pointX=" + parking.getPointX() + "&pointY=" + parking.getPointY();
		response.sendRedirect(url);
	}
}

package com.teamecho.chacha.parking.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.parking.service.ParkingLotService;
import com.teamecho.chacha.review.domain.Review;


@WebServlet("/parking/get_parking_point.do")
public class GetParkingLotByPoint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParkingLotService ps = ParkingLotService.getInstance();
		HttpSession session = request.getSession(false);
		String userId = (String) session.getAttribute("userId");
	
		if(userId == null || userId.length() == 0) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('로그인 후 사용 해주시기 바랍니다.'); location.href='/chacha';</script>"); // 경고창 띄우기
			writer.close(); // close를 해주면 response.reDirect가 안되므로 alert에서 location.href 속성을 사용하여 페이지를 이동시켜준다.
			return;
		}
				
		double pointx = Double.valueOf(request.getParameter("pointX"));
		double pointy = Double.valueOf(request.getParameter("pointY"));
		
		ParkingLot pl = ps.findParkingLotByPoint(pointx, pointy);
		List<Review> re = ps.getAllReview(pl.getPid());
		request.setAttribute("ParkingLot", pl);
		request.setAttribute("space", ps.getParkingLotSpaces(pointx, pointy));
		request.setAttribute("favorite",ps.isValidFavorite(pl.getPid(), ps.getUid(userId)) );
		
		if (re.size() !=0 || re != null) {
			request.setAttribute("review", re);
		}

		request.getRequestDispatcher("/parkinglot/get_parking_point.jsp").forward(request, response);
	}

}

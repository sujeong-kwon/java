package com.teamecho.chacha.reservation.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.parking.service.ParkingLotService;
import com.teamecho.chacha.reservation.domain.Reservation;
import com.teamecho.chacha.reservation.service.ReservationService;
import com.teamecho.chacha.user.service.UserService;

@WebServlet("/reservation/rez_checking.do")
public class RezCheckingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReservationService rService = ReservationService.getInstance();
	private ParkingLotService pService = ParkingLotService.getInstance();
	private UserService uService = UserService.getInstance();
    
	RequestDispatcher dispatcher = null;
	long uId;
	long pId;
	ParkingLot parking;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(false);
		
		// 1. 홈 파라메터 얻기
		String userId = (String) session.getAttribute("userId"); // 로그인에서 던져준 session의 유저아이디값 받아옴

		// 2. 유효성 검증 및 변환
		
		// 3. 비즈니스 서비스 호출
		uId = uService.findUIdByUserId(userId);
		List<Reservation> rList = rService.getReservationListByUid(uId);
		String rListStr = "";
		
		for(Reservation rez : rList) {
			pId = rez.getPid();
			parking = pService.findParkingLotByPid(pId);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			format.format(rez.getEnd_time());
			rListStr += "<table>";
			rListStr += "<tr><th>주차장명</th><td>" + parking.getParkingName() + "</td>";
			rListStr += "<td class='review' rowspan=\"3\"><div><a href=/chacha/review/write_review.do?uid=" + rez.getUid() + "&pid=" + rez.getPid() + ">리뷰작성</a></div></td></tr>";
			rListStr += "<tr><th>예약시간</th><td>" + format.format(rez.getStart_time()) + " ~ " + format.format(rez.getEnd_time()) + "</td></tr>";
			rListStr += "<tr><th>정산금액</th><td>" + rez.getCost() + "원</td></tr>";
			rListStr += "</table>";
		}
		// 4. NextPage
		request.setAttribute("rListStr", rListStr);
		dispatcher = request.getRequestDispatcher("rez_checking.jsp");
		dispatcher.forward(request, response);
	}

}

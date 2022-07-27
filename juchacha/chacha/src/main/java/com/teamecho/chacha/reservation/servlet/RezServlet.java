package com.teamecho.chacha.reservation.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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

@WebServlet("/reservation/rez.do")
public class RezServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ReservationService rService = ReservationService.getInstance();
    private ParkingLotService pService = ParkingLotService.getInstance();
	private UserService uService = UserService.getInstance();
    
	RequestDispatcher dispatcher = null;
	ParkingLot parking;
	long uId;
	
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(false);
		
		// 1. 홈 파라메터 얻기
		long pId = Long.valueOf(request.getParameter("pid")); // 주차장정보창에서 예약하기 클릭시 pid코드 받아옴
		String userId = (String) session.getAttribute("userId"); // 로그인에서 던져준 session의 유저아이디값 받아옴
		
		// 2. 유효성 검증 및 변환
		if(userId == null || userId.length() == 0) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('로그인 후 사용 해주시기 바랍니다.'); location.href='/chacha';</script>"); // 경고창 띄우기
			writer.close(); // close를 해주면 response.reDirect가 안되므로 alert에서 location.href 속성을 사용하여 페이지를 이동시켜준다.
			return;
		}
		
		// 3. 비즈니스 서비스 호출
		parking = pService.findParkingLotByPid(pId);
		uId = uService.findUIdByUserId(userId);

		// 4. NextPage
		request.setAttribute("parking", parking); // 3에서 만든 주차장 객체를 던져주기
		dispatcher = request.getRequestDispatcher("reservation.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Date date = new Date();
		Timestamp timestamp_start = null;
		Timestamp timestamp_end = null;
		String dateStr = "";
		int cost;
		// 1. 홈 파라메터 얻기
		
		String type = request.getParameter("type");
		String month = request.getParameter("startMonth");
		String start_date = request.getParameter("startDate");
		String start_time = request.getParameter("startTime");
		String end_time = request.getParameter("endTime");
		
		if(type.equals("A")) { // 시간당이라면
			// 시작시간
			dateStr = "2022-" + month + "-" + start_date + " " + start_time +":00:00";
			timestamp_start = Timestamp.valueOf(dateStr);
			
			// 종료시간
			dateStr = "2022-" + month + "-" + start_date + " " + end_time +":00:00";
			timestamp_end = Timestamp.valueOf(dateStr);
			
			// 요금
			cost = (Integer.parseInt(end_time) - Integer.parseInt(start_time)) * (int)parking.getTimeCost();
		} else if(type.equals("B")) { // 종일권이라면 월,일만
			// 시작시간
			dateStr = "2022-" + month + "-" + start_date + " 00:00:00";
			timestamp_start = Timestamp.valueOf(dateStr);
			
			// 종료시간
			dateStr = "2022-" + month + "-" + String.valueOf(Integer.parseInt(start_date) + 1) + " 00:00:00";
			timestamp_end = Timestamp.valueOf(dateStr);
			
			// 요금
			cost = (int)parking.getDayCost();
		} else { // 정기권이라면 월만
			// 시작시간
			dateStr = "2022-" + month + "-01 00:00:00";
			timestamp_start = Timestamp.valueOf(dateStr);
			
			// 종료시간
			String end_date = null;
			if(month.equals("02")) {
				end_date = "28";
			} else if(month.equals("01") || month.equals("03") || month.equals("05") || month.equals("07") ||
					month.equals("08") || month.equals("10") || month.equals("12")) {
				end_date = "31";
			} else {
				end_date = "30";
			}
			dateStr = "2022-" + month + "-" + end_date + " 00:00:00";
			timestamp_end = Timestamp.valueOf(dateStr);
			
			// 요금
			cost = (int)parking.getMonthCost();
		}
		
		// 2. 유효성 검사
		Reservation rez = new Reservation();
		rez.setStart_time(timestamp_start);
		rez.setEnd_time(timestamp_end);
		rez.setCost(0);
		rez.setCost(cost);
		rez.setVoucher_use("N");
		rez.setUid(uId);
		rez.setPid(parking.getPid());
		
		// 3. 비즈니스 서비스 호출
		rService.addReservation(rez);
		
		// 4. NextPage
		request.setAttribute("rez", rez);
		dispatcher = request.getRequestDispatcher("rez_success.jsp");
		dispatcher.forward(request, response);
	}

}

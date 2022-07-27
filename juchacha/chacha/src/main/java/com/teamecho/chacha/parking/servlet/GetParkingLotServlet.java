package com.teamecho.chacha.parking.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.parking.service.ParkingLotService;

@WebServlet("/parkinglot/get_parking.do")
public class GetParkingLotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParkingLotService ps = ParkingLotService.getInstance();
		List<ParkingLot> list = ps.findAllParkingLot();
		request.setAttribute("ParkingLotList", list);
		request.getRequestDispatcher("/location/location.jsp").forward(request, response);
	}

}

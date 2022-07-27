package com.teamecho.chacha.favorite.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.favorite.domain.Favorite;
import com.teamecho.chacha.favorite.service.FavoriteService;
import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.parking.service.ParkingLotService;
import com.teamecho.chacha.user.service.UserService;

@WebServlet("/favorite/list.do")
public class FavoriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ParkingLotService pservice = ParkingLotService.getInstance();
	private UserService uservice = UserService.getInstance();
	private FavoriteService service;
	private List<Favorite> fvList;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);

		String userId = (String) session.getAttribute("userId");
		long uId = uservice.findUIdByUserId(userId);
		System.out.println(uId);

		
		service = new FavoriteService();
		
		fvList = service.getAllFavo(uId);
		List<ParkingLot> plist = new ArrayList<>();
		
		for(Favorite f : fvList) {
			long fpid = f.getPid();
			ParkingLot pl = pservice.findParkingLotByPid(fpid);
			plist.add(pl);
		}

		request.setAttribute("favorites", plist);
		request.getRequestDispatcher("favorite.jsp").forward(request, response);
	}

}
 
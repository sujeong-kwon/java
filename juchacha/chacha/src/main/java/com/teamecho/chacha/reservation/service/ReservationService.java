package com.teamecho.chacha.reservation.service;

import java.util.ArrayList;
import java.util.List;

import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.parking.service.ParkingLotService;
import com.teamecho.chacha.reservation.dao.ReservationDao;
import com.teamecho.chacha.reservation.domain.Reservation;
import com.teamecho.chacha.user.service.UserService;

public class ReservationService {
	private static ReservationService service = new ReservationService();
	private ParkingLotService pService = ParkingLotService.getInstance();
	private UserService uService = UserService.getInstance();
	ReservationDao rDao = new ReservationDao();
	
	private ReservationService() {
		
	}
	
	/**
	 * 싱글톤 객체 얻는 메소드
	 * @return reservationService 객체
	 */
	public static ReservationService getInstance() {
		return service;
	}

	/**
	 * 예약 추가하는 메소드
	 * @param rez
	 */
	public void addReservation(Reservation rez) {
		rDao.addReservation(rez);
	}
	
	/**
	 * 예약리스트 얻는 메소드
	 * @return
	 */
	public List<Reservation> getReservationListByUid(long uid) {
		return rDao.findReservationListByUid(uid);
	}
}

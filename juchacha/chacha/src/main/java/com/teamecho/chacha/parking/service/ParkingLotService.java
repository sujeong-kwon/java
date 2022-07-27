package com.teamecho.chacha.parking.service;

import java.util.List;

import com.teamecho.chacha.favorite.dao.FavoriteDao;
import com.teamecho.chacha.parking.dao.ParkingLotDao;
import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.review.dao.ReviewDao;
import com.teamecho.chacha.review.domain.Review;
import com.teamecho.chacha.user.dao.UserDao;

public class ParkingLotService {
	private static final ParkingLotService parkingLotService = new ParkingLotService();
	private ParkingLotDao parkingLotDao;
	private ReviewDao reviewDao;
	private FavoriteDao favoriteDao;
	private UserDao userDao;
	
	private ParkingLotService() {
		parkingLotDao = new ParkingLotDao();
		reviewDao = new ReviewDao();
		favoriteDao = new FavoriteDao();
		userDao = new UserDao();
	}
	
	public static ParkingLotService getInstance() {
		return parkingLotService;
	}
	public List<ParkingLot> findAllParkingLot() {
		return parkingLotDao.findAllParkingLot();
	}
	
	public ParkingLot findParkingLotByPoint(double pointX, double pointY) {
		return parkingLotDao.findParkingLotByPoint(pointX, pointY);
	}
	
	public ParkingLot findParkingLotByCode(String parkingcode) {
		return parkingLotDao.findParkingLotByCode(parkingcode);
	}
	public int getParkingLotSpaces(double pointX, double pointY) {
		return parkingLotDao.getParkingLotSpaces(pointX, pointY);
	}
	
	public ParkingLot findParkingLotByPid(Long pid) {
		return parkingLotDao.findParkingLotByPid(pid);
	}
	
	public List<Review> getAllReview(Long pid){
		return reviewDao.findAll(pid);
	}
	
	public boolean isValidFavorite(Long pid, Long uid) {
		return favoriteDao.isValidFavorite(pid, uid);
	}
	
	public Long getUid(String userId) {
		return userDao.findUIdByUserId(userId);
	}
	
	public List<ParkingLot> findSearchParkingLot(String str) {
		return parkingLotDao.findSearchParkingLot(str);
	}
}

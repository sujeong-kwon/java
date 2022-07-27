package com.teamecho.chacha.review.service;

import java.util.List;

import com.teamecho.chacha.parking.domain.ParkingLot;
import com.teamecho.chacha.parking.service.ParkingLotService;
import com.teamecho.chacha.reservation.service.ReservationService;
import com.teamecho.chacha.review.dao.ReviewDao;
import com.teamecho.chacha.review.domain.Review;
import com.teamecho.chacha.user.service.UserService;

public class ReviewService {
	private static ReviewService service = new ReviewService();
	private ParkingLotService pService = ParkingLotService.getInstance();
	private UserService uService = UserService.getInstance();
	private ReviewDao reviewDao =  new ReviewDao();
	
	public ReviewService() {
	
	}
	
	public ReviewService(ReviewDao reviewDao) {
		this.reviewDao = reviewDao;
	}
	
	public static ReviewService getInstance() {
		return service;
	}
	
	public ParkingLot getParkingLotByCode(String parkingcode) {
		return pService.findParkingLotByCode(parkingcode);
	}
	
	public ParkingLot getParkingLotByPid(long pid) {
		return pService.findParkingLotByPid(pid);
	}
	
	public long getUIdByUserId(String userId) {
		return uService.findUIdByUserId(userId);
	}
	
	public void addReview(Review review) {
		reviewDao.addReview(review);
	}
	
	public List<Review> getAllReviews(Long pId){
		return reviewDao.findAll(pId);
	}

}

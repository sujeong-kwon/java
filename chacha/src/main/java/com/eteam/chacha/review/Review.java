package com.eteam.chacha.review;

import com.eteam.chacha.parkinglot.ParkingLot;
import com.eteam.chacha.user.User;

/**
 * @author 권수정
 *
 */
public class Review {
	private ParkingLot parkingLot;
	private User user;
	private String starRating;
	private String review;
	
	public Review(ParkingLot parkingLot, User user, String starRating, String review) {
		this.parkingLot = parkingLot;
		this.user = user;
		this.starRating = starRating;
		this.review = review;
	}

	public ParkingLot getParkingLot() {
		return parkingLot;
	}

	public void setParkingLot(ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getStarRating() {
		return starRating;
	}
	
	public void setStarRating(String starRating) {
		this.starRating = starRating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
}

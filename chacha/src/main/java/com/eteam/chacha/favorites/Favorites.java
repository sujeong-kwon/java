package com.eteam.chacha.favorites;

import com.eteam.chacha.parkinglot.ParkingLot;
import com.eteam.chacha.user.domain.User;

/**
 * @author 권수정
 *
 */
public class Favorites {
	private ParkingLot parkingLot;
	private User user;
	
	public Favorites(ParkingLot parkingLot, User user) {
		this.parkingLot = parkingLot;
		this.user = user;
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
	
}

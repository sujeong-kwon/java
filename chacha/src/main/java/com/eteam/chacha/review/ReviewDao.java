package com.eteam.chacha.review;

import com.eteam.chacha.db.DataSource;
import com.eteam.chacha.db.NamingService;
import com.eteam.chacha.review.domain.Review;

public class ReviewDao {
	
	private DataSource ds;
	
	public ReviewDao() {
		NamingService namingService = NamingService.getInstance();
		ds = (DataSource)namingService.getAttribute("dataSource");	
	}
	
	public void addReview(Review review) {
	
	}

}

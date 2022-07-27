package com.teamecho.chacha.voucher.service;

import java.util.*;

import com.teamecho.chacha.voucher.domain.Voucher;
import com.teamecho.chacha.voucher.domain.VoucherUse;
import com.teamecho.chacha.voucher.domain.VoucherUseList;
import com.teamecho.chacha.user.dao.UserDao;
import com.teamecho.chacha.voucher.dao.VoucherDao;
import com.teamecho.chacha.voucher.dao.VoucherUseDao;

public class VoucherService {
	private static final VoucherService voucherService = new VoucherService();
	private VoucherUseDao voucherUseDao;
	private VoucherDao voucherDao;
	private UserDao userDao;
	
	private VoucherService() {
		voucherUseDao = new VoucherUseDao();
		voucherDao = new VoucherDao();
		userDao = new UserDao();
	}
	
	public static VoucherService getInstance() {
		return voucherService;
	}
	
	public void addVoucher(List<VoucherUse> voucherUseList) {
		voucherUseDao.addVoucherUse(voucherUseList);
	}
	
	public long getVid(String vType, int buyTime) {
		return voucherDao.getVoucherId(vType, buyTime);
	}
	
	public long getUid(String userId) {
		return userDao.findUIdByUserId(userId);
	}
	
	public List<VoucherUse> findVoucherByUid(long uid) {
	    return voucherUseDao.findVoucherByUid(uid);
	}
	
	public Voucher getVoucherByVid(long vid) {
		return voucherDao.findVoucherByVid(vid);
	}
	public List<VoucherUseList> getVoucherUseList(long uid){
		return voucherUseDao.findVoucherUseList(uid);
	}
}

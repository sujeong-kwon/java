package com.teamecho.chacha.voucher.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.user.service.UserService;
import com.teamecho.chacha.voucher.domain.Voucher;
import com.teamecho.chacha.voucher.domain.VoucherUse;
import com.teamecho.chacha.voucher.domain.VoucherUseList;
import com.teamecho.chacha.voucher.service.VoucherService;

@WebServlet("/voucher/voucher_list.do")
public class VoucherListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VoucherService voucherService;
	private UserService uservice = UserService.getInstance();
	private List<VoucherUseList> voucherUseList = new ArrayList<VoucherUseList>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		voucherService = VoucherService.getInstance();
		HttpSession session = request.getSession(false);
		String userId = (String) session.getAttribute("userId");
		long uId = uservice.findUIdByUserId(userId);
		
		voucherUseList = voucherService.getVoucherUseList(uId);
		request.setAttribute("voucherList", voucherUseList);
		request.getRequestDispatcher("voucher_list.jsp").forward(request, response);
	}
		
}

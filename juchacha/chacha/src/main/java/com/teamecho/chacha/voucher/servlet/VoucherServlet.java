package com.teamecho.chacha.voucher.servlet;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teamecho.chacha.voucher.service.VoucherService;
import com.teamecho.chacha.voucher.domain.VoucherUse;

@WebServlet("/voucher/voucher.do")
public class VoucherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VoucherService voucherService;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String[] voucherar = request.getParameterValues("voucher");
		voucherService = VoucherService.getInstance();
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		List<VoucherUse> voucherUseList = new ArrayList<VoucherUse>();
		
		if(userId == null || userId.length() == 0) {
	         response.setContentType("text/html; charset=UTF-8");
	         PrintWriter writer = response.getWriter();
	         writer.println("<script>alert('로그인 후 사용 해주시기 바랍니다.'); location.href='/chacha';</script>"); // 경고창 띄우기
	         writer.close(); // close를 해주면 response.reDirect가 안되므로 alert에서 location.href 속성을 사용하여 페이지를 이동시켜준다.
	         return;
	      }
		
		// 2. 유효성 검증 및 변환
		if(voucherar == null || voucherar.length == 0) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('선택하신 주자권이 없습니다.'); location.href='/chacha/voucher/voucher.jsp';</script>"); // 경고창 띄우기
			writer.close(); // close를 해주면 response.reDirect가 안되므로 alert에서 location.href 속성을 사용하여 페이지를 이동시켜준다.
			return;
		}
		
	    //배열 분리
		String vType = null;
		int buyTime = 0;
		for(int i = 0; i < voucherar.length; i++) {
			vType = voucherar[i].split("\\.")[0];
			buyTime = Integer.parseInt(voucherar[i].split("\\.")[1]);
			VoucherUse voucherUse = new VoucherUse();
			voucherUse.setVid(voucherService.getVid(vType, buyTime));
			voucherUse.setUid(voucherService.getUid(userId));
			voucherUseList.add(voucherUse);
		}
		//3. 비즈니스 서비스 호출
		voucherService.addVoucher(voucherUseList);
		
		//4.다음 페이지로 이동
		response.sendRedirect("/chacha/user/mypage.jsp");
	}
}

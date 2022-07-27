<%@page import="java.net.URLEncoder, java.util.*"%>
<%@page import="com.teamecho.chacha.parking.domain.ParkingLot"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차차</title>
<link rel="stylesheet" href="../css/default.css">
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/footer.css">
<link rel="stylesheet" href="../css/reservation.css">
<style>
@font-face {
	src: url("/chacha/css/Jalnan.ttf");
	font-family: "Jalnan";
}

.title-wrap {
	text-align: center;
	margin-bottom: 30px;
}

.title-wrap .title {
	display: inline-block;
	height: 100%;
	font-size: 36px;
	text-align: center;
	padding: 0 8px;
	position: relative;
	font-family: "Jalnan";
}

.title-wrap .title:before {
	position: absolute;
	content: '';
	width: 100%;
	height: 14px;
	bottom: -4px;
	left: 0;
	z-index: -1;
	background: #EDE6DB;
}

.wrap {
	min-height: calc(100vh - 200px);
	height: auto;
}

.rezInfo th {
	width: 25%;
}
</style>
</head>
<%
String userId = (String) session.getAttribute("userId");
%>
<body>
	<header>
		<%@ include file="/incl/header.jsp"%>
	</header>
	<div class="wrap">
		<div class="title-wrap">
			<h3 class="title"><%=userId%>님의 구매 리스트
			</h3>
		</div>
		<div class="rezInfo">
			<c:forEach var="voucher" items="${voucherList}">
				<table>
					<tbody>
						<tr>
							<th>구매한 주차권</th>
							<td>
							<c:if test="${voucher.vType eq 'A'}">
								${voucher.buyTime}시간 주차권
							</c:if>
							<c:if test="${voucher.vType eq 'B'}">
								종일권
							</c:if>
							<c:if test="${voucher.vType eq 'C'}">
								정기권
							</c:if>
							</td>
						</tr>
						<tr>
							<th>구매한 시간</th>
							<td>
								${voucher.regDate}
							</td>
						</tr>
						<tr>
							<th>사용유무</th>
							<td>
								<c:if test="${voucher.vuse eq 'N'}">
									사용가능
								</c:if>
								<c:if test="${voucher.vuse eq 'Y'}">
									사용완료
								</c:if>
							</td>
						</tr>
					</tbody>
				</table>
			</c:forEach>
		</div>
	</div>
	<footer>
		<%@ include file="/incl/footer.jsp"%>
	</footer>
</body>
</html>
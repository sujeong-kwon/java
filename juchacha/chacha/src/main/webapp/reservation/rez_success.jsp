<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/default.css">
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/footer.css">
<link rel="stylesheet" href="../css/reservation.css">
<style type="text/css">
	@font-face {
	  src: url("/chacha/css/Jalnan.ttf");
	  font-family: "Jalnan";
	}
	.gnb ul li a {
     line-height: 70px;
     font-size: 20px;
     color: white;
     font-family: "Jalnan";
   	}
	.wrap {
		height: calc(100vh - 200px);
	}
	.success {
		font-family: "Jalnan";
	}
</style>
<title>주차차</title>
</head>
<body>
	<header>
		<%@ include file="/incl/header.jsp" %>
	</header>
	<div class="wrap">
		<p class="success"><span class="color">예약완료</span>되었습니다.</p>
		<button class="btn" onclick="location.href='/chacha/parkinglot/get_parking.do'">홈으로 가기</button>
		<button class="btn" onclick="location.href='/chacha/reservation/rez_checking.do'">예약확인</button>
	</div>
	<footer>
	    <%@ include file="/incl/footer.jsp" %>
	</footer>
</body>
</html>
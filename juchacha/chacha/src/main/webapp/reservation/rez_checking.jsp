<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차차</title>
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
	.rezInfo .success {
		font-family: "Jalnan";
	}
</style>
</head>
<body>
	<header>
		<%@ include file="/incl/header.jsp" %>
	</header>
	<div class="wrap">
		<div class="title-wrap">
        	<h3 class="title">예약현황</h3>
     	</div>
		<div class="rezInfo">
			<c:if test="${empty rListStr}">
				<p class="success">예약현황이 없습니다.</p>
			</c:if>
			${rListStr}
		</div>
	</div>
	<footer>
	    <%@ include file="/incl/footer.jsp" %>
	</footer>
</body>
</html>
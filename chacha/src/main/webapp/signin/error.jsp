<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder ,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/fixmethod.css">
<link rel="stylesheet" href="../css/style.css">
</head>
<style>
	body{
	 	display: flex;
	 	justify-content: center;
	 	text-align: center;
	}
	#content-header{
		padding-top: 150px;
	 	padding-bottom: 150px;
	}
</style>
<body>
<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/menu.jsp">
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod007 : 자바빈즈\", \"UTF-8\") %>" />
		</jsp:include>
	</div>	
	<div id="content-header">
		<c:if test="${not empty errorMsgs }">
			<h3>회원가입에 실패했습니다.</h3>
			<ul>
				<c:forEach var="errorMsg" items="${errorMsgs}">
			 		<li>${errorMsg}</li>
				</c:forEach>
				<%--
				if else 문 
				<c:when test="">
					<c:choose></c:choose>  // true일 때
					<c:otherwise></c:otherwise> // false일 때
				</c:when>	
				 --%>	
			</ul>
		</c:if>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>
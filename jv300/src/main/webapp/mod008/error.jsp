<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder ,java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod007 : 자바빈즈\", \"UTF-8\") %>" />
		</jsp:include>
	</div>	
	<div id="content-header">
		<h3>회원가입에 실패했습니다.</h3>
		<%-- 
		<ul>
<%
		@SuppressWarnings("unchecked")
		List<String> errorMsgs = (List<String>)request.getAttribute("errorMsgs");
		for(String errorMsg : errorMsgs){
%>
		<li><%=errorMsg %></li>	
<%
		}
%>
		</ul>
		--%>
		<ul>
		<c:forEach var="message" items="${errorMsgs}">
	 		<li>${message}</li>
		</c:forEach>
		</ul>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>
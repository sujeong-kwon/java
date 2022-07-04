<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		background-color: pink;
		padding-top: 150px;
	  	padding-bottom: 150px;
	}
</style>
<body>
<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="mod008 : Java Beans and include" />
		</jsp:include>
	</div>	
	<div id="content-header">
		<h3>회원가입되었습니다.</h3>
		아이디 : ${user.userId}<br>
		이름 : ${user.userName}
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>
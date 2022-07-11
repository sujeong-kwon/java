<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<table border="1">
			<tr>
				<th>이름</th>
				<th>아이디</th>
				<th>이메일</th>
				<th>주소</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="users" items="${userList}">
			<tr>
				<td>${users.getUserName()}</td>
				<td>${users.getUserId()}</td>
				<td>${users.getEmail()}</td>
				<td>${users.getAddr()}</td>
				<td><a href="modify_user.do?uid=${users.getUid()}">수정</a></td>
				<td><a href="delete_user.do?uid=${users.getUid()}">삭제</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>	
</body>
</html>
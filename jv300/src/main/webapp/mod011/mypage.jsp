<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>MyPage</h3>
	<a href='<c:url value="logout" />'>로그아웃</a>
	<label>Last Access Time : </label> ${lastAccessTime}
</body>
</html>
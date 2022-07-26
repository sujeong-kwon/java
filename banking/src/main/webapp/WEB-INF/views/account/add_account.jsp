<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
	<h3>신규 계좌 신청</h3>
	<form action="add_account" method="post">
		<label>계좌종류</label><input type="text" name="accType"><br>
		<label>회원id</label><input type="text" name="cid"><br>
		<input type="submit" value="신청"/>
	</form>
</body>
</html>
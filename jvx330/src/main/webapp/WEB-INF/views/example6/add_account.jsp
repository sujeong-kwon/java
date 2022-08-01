<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method="post" modelAttribute="account">
	<label>SavingsAccount</label>
	<form:radiobutton path="accType" value="S"/>
	<label>CheckingAccount</label>
	<form:radiobutton path="accType" value="C"/>
	<label>계좌번호</label>
	<form:input path="accountNum" /><br>
	<input type="submit" value="신청하기" />
</form:form>
</body>
</html>
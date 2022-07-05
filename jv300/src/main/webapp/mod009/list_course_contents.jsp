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
	<div>
	<form action="list_course_contents.do" method="get">
		<c:forEach var="contents" items="${contentList}">
		<p>
			<c:forEach var="content" items="${contents}">
				${content}
			</c:forEach>
		</p>	
		</c:forEach>
		<input type="submit" value="확인">
	</form>	
	 <%--
	 <c:forEach var="contents" items="${contentList}">
		${contents}	<br>
	</c:forEach>
	<style type="text/css">
	.tab{
		margin-left: 40px;
	}
	</style>
	  --%>
	</div>
</body>
</html>
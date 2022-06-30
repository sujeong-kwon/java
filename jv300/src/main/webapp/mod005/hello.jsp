<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%! 
	private static final String DEFAULT_NAME = "World";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%-- 이것은 JSP 주석입니다. 밑에 코드는 body안에서도 작성 가능 --%>
<%
	String name = request.getParameter("userName");
	if(name == null || name.length() == 0){
		name =DEFAULT_NAME;
	}
%>
<body>
<h3>Hello, <%=name %></h3>
</body>
</html>
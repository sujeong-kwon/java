<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%	
	String userId = (String)request.getAttribute("userId");
	String passwd = (String)request.getAttribute("passwd");
	String userName = (String)request.getAttribute("userName");
	String ssn = (String)request.getAttribute("ssn");
	String email1 = (String)request.getAttribute("email1");
	String email2 = (String)request.getAttribute("email2");
	String addr1 = (String)request.getAttribute("addr1");
	String addr2 = (String)request.getAttribute("addr2");
%>
<body>
	<h3>회원가입되었습니다!</h3>
	<h3>회원 아이디 : <%=userId %></h3>
	<h3>비밀번호 : <%=passwd %></h3>
	<h3>회원 이름 : <%=userName %></h3>
	<h3>비밀번호 : <%=ssn %></h3>
	<h3>이메일 : <%=email1 %> @ <%=email2 %></h3>
	<h3>주소 : <%=addr1 %> <%=addr1 %></h3>
</body>
</html>
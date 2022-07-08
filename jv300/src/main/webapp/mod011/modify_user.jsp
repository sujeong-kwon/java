<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
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
	#header {

	}
	#content-header {
	  padding-top: 150px;
	  padding-bottom: 150px;
	}
	#footer {
	  position: fixed;
	  bottom: 0;
	  left: 0;
	  height: 100px;
	  width: 100%;
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
		<h3>회원수정</h3>
		<form action="modify_user.do?uid=${user.getUid()}" method="post">
			회원 아이디 : <input type="text" name="userId" placeholder="아이디 입력" value="${user.userId}"/><br>
			비밀번호 : <input type="password" name="passwd" value="${user.getPasswd()}"/><br>
			이름 : <input type="text" name="userName" value="${user.getUserName()}"/><br>
			주민번호 : <input type="text" name="ssn" value="${user.getSsn()}"/><br>
			이메일 : <input type="text" name="email" value="${user.email}" /><br>
			주소 : <input type="text" name="addr" value="${user.addr}" />
			<input type="submit" value="확인" />
		</form>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>
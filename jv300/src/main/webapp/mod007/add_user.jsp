<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder"%>
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
			<jsp:param name="subtitle" value="mod007 : Java Beans and include" />
		</jsp:include>
	</div>	
	<div id="content-header">
		<h3>회원가입</h3>
		<form action="add_user.do" method="post">
			회원 아이디 : <input type="text" name="userId" placeholder="아이디 입력"/><br>
			비밀번호 : <input type="password" name="passwd" /><br>
			이름 : <input type="text" name="userName" /><br>
			주민번호 : <input type="text" name="ssn" /><br>
			이메일 : <input type="text" name="email1" />@
					<select name="email2">
				        <option value="">-- 선택 --</option>
				        <option value="google.com">gmail.com</option>
				        <option value="naver.com">naver.com</option>
			      	</select><br>
			주소 : <input type="text" name="addr1" />
				  <input type="text" name="addr2" />
			<input type="submit" value="확인" />
		</form>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>
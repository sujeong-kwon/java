<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	#header {

	}
	#content-header {
	  padding-top: 300px;
	  padding-bottom: 150px;
	  margin:0 auto;
	}
	.input-box{
	  position:relative;
  	  margin:10px 0;
	}
	.input-box > input{
	  background:transparent;
	  border:none;
	  border-bottom: solid 1px #ccc;
	  padding:20px 0px 5px 0px;
	  font-size:20px;
	  width:100%;
	}
	.login{
	  background:transparent;
	  border: solid 1px #ccc;
	  padding:20px 0px 5px 0px;
	  font-size:20px;
	  width:100%;
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
			<jsp:param name="subtitle" value="mod011 : Java Beans and include" />
		</jsp:include>
	</div>	
	<div id="content-header">
		<h3>로그인</h3>
		<form action="login" method="post">
		<div class="input-box">
			<input type="text" name="userId" placeholder="아이디"/><br>
		</div>
		<div class="input-box">
			<input type="password" name="passwd" placeholder="비밀번호"/><br>
		</div>
		<input class="login" type="submit" value="로그인" />
		<a href='<c:url value="add_user.jsp" />'>회원가입</a>
		</form>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>
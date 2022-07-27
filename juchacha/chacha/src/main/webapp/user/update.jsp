<%@ page language="java" contentType="text/html; charset=UTF-8"		pageEncoding="UTF-8"%>
<%@ page import="com.teamecho.chacha.user.domain.User" %>
<%-- 
<%@ page import="" session="" errorPage="" isErrorPage="" contentType="" pageEncoding="" %>
 --%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>주차차</title>
  <style>
  @font-face {
	  src: url("/chacha/css/Jalnan.ttf");
	  font-family: "Jalnan";
	}
	.gnb ul li a {
	  line-height: 70px;
	  font-size: 20px;
	  color: white;
	  font-family: "Jalnan";
	} 
body, html {
	width: 100%;
	height: 100%;
	overflow: hidden;
}

* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

ul, li {
	list-style: none;
}

a {
	text-decoration: none;
	color: #333;
}

#header {
	height: 80px;
	width: 100%;
	text-align: center;
	font-size: 20px;
	background: #417D7A;
}

#header.login_on {
	position: fixed;
	z-index: 10;
}

.header-wrap {
	height: 100%;
	width: 60%;
	margin: 0 auto;
	position: relative;
}

.logo {
	position: absolute;
	display: inline-block;
	height: 100%;
	width: 80px;
	left: 0;
	padding: 5px 0;
}

.juchacha {
	display: block;
	height: 70px;
	width: 70px;
	background-image: url("/chacha/image/logo.png");
	background-repeat: no-repeat;
	background-size: contain;
	background-position: center;
}

.gnb {
	padding-left: 90px;
	width: 100%;
	height: 100%;
}

.gnb .left-gnb {
	float: left;
	height: 100%;
}

.gnb .right-gnb {
	float: right;
	height: 100%;
}

ul {
	height: 100%;
	padding: 5px 0;
}

ul li {
	float: left;
	height: 100%;
	margin-left: 30px;
}

ul li:first-child {
	margin-left: 0;
}

a {
	line-height: 70px;
	font-size: 20px;
	color: white;
}

a:hover {
	color: white;
	font-weight: 600;
}

section {
	height: 100%;
	overflow: hidden;
	padding-bottom: 160px;
}

.container {
	display: flex;
	flex-wrap: wrap;
	height: 100%;
	width: 700px;
	margin: 0 auto;
	align-items: center;
}

.container .title-wrap {
	width: 100%;
	line-height: 60px;
	padding-top: 100px;
}

.container .title-wrap .title {
	height: 100%;
	font-size: 36px;
	text-align: center;
	font-family: "Jalnan";
}

.container>#content-wrapper {
	display: flex;
	height: 100%;
	align-items: flex-start;
	width: 100%;
	padding: 0 80px;
}

.content {
	width: 100%;
}

.add_user {
	padding-top: 20px;
	width: 100%;
}

.add {
	height: 60px;
	width: 100%;
	display: flex;
	justify-content: left;
	align-items: center;
	margin-top: 10px;
}

.user_id {
	flex-wrap: wrap;
}

span.id {
	display: block;
	width: 100%;
	font-size: 13px;
	color: red;
	margin-left: 15px;
	margin-top: 5px;
	text-align: right;
}

.phone {
	height: 60px;
	flex-wrap: wrap;
}

.add>input {
	width: 100%;
	height: 45px;
	line-height: 45px;
	padding-left: 5px;
	font-size: 15px;
}

.add>input:focus {
	outline: none;
	border-color: rgba(65, 125, 122, .6);
	box-shadow: 0 0 6px 2px rgba(65, 125, 122, .6);
}

.add>select.phoneNum_selec:focus {
	outline: none;
	border-color: rgba(65, 125, 122, .6);
	box-shadow: 0 0 6px 2px rgba(65, 125, 122, .6);
}

select.phoneNum_selec {
	height: 45px;
	width: 30%;
	font-size: 15px;
}

input.phoneNum {
	width: 100%;
}

span.phoneNum_middle {
	margin: 0 5px;
}

span.phone {
	margin-top: 5px;
	display: block;
	text-align: right;
	font-size: 13px;
	color: red;
	margin-left: 15px;
	width: 100%;
}

.address {
	margin-right: 10px;
}

.btn-group {
	display: flex;
	width: 100%;
	height: 50px;
	margin-top: 30px;
	justify-content: center;
}

.i-btn {
	display: flex;
	justify-content: space-around;
	height: 100%;
	width: 60%;
}

.i-btn .btn {
	display: flex;
	justify-content: center;
	height: 100%;
	background: #417D7A;
	border-radius: 30px;
	width: 150px;
	height: 50px;
}

button.btn-inner {
	color: white;
	border-style: none;
	height: 100%;
	width: 75px;
	font-size: 20px;
	background: none;
	cursor: pointer;
	font-family: "Jalnan";
}

.i-btn .in-btn {
	font-size: 20px;
	color: white;
	line-height: 50px;
	text-align: center;
	font-family: "Jalnan";
}

.i-btn .in-btn:hover {
	font-weight: normal;
}

#footer {
	height: 160px;
	background: #f1f1f1;
}

.copyright {
	width: 700px;
	height: 100%;
	margin: 0 auto;
	position: relative;
	padding-top: 40px;
}

.copyright-logo {
	position: absolute;
	right: 0;
	top: 40px;
	width: 80px;
	height: 80px;
	background-image: url("/chacha/image/logo.png");
}

.copyright-txt p {
	margin-top: 5px;
}
.copyright-txt p a {
	line-height: 0;
}

.copyright .copyright-logo a {
	color: transparent;
}

.copyright a, .copyright p {
	font-size: 15px;
	color: #000;
}
</style>
</head>
<body>
<%
User user = new User();
	user = (User) request.getAttribute("user");
%>
<header>
    <%@ include file="/incl/header.jsp" %>
  </header>
  <section>
    <div class="container">
      <div class="title-wrap">
        <h3 class="title">회원수정</h3>
      </div>
      <div id="content-wrapper">
        <div class="content">
          <form class="add_user" action="user_update.do" method="post">
            <div class="add user_id">
              <input type="text" name="userId" placeholder="아이디" value="<%=user.getUserId()%>" readonly>
              <span class="id">* 아이디는 수정이 되지 않습니다.</span>
            </div>
            <div class="add">
              <input type="password" name="password" placeholder="비밀번호" value="<%=user.getPasswd()%>">
            </div>
            <div class="add">
              <input type="text" name="userName" placeholder="이름" value="<%=user.getUserName()%>">
            </div>
            <div class="add phone">
              <input type="text" class="phoneNum" name="phoneNum" placeholder="휴대폰번호" value="<%=user.getUserPhone()%>">
            </div>
            <div class="add">
              <input type="text" name="addr" placeholder="주소" class="address1" value="<%=user.getAddr()%>">
            </div>
            <div class="add">
              <input type="text" name="licenseNumber" placeholder="차량번호" value="<%=user.getLicenseNumber()%>">
            </div>
            <div class="btn-group">
              <div class="i-btn">
                <div class="btn">
                  <button type="submit" class="btn-inner">확인</button>
                </div>
                <div class="btn">
                	<a href="/chacha/my_page.do" class="in-btn">취소</a>
                </div>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
    <footer>
      <%@ include file="/incl/footer.jsp" %>
    </footer>
  </section>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
	background-image: url("../image/logo.png");
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

#header a {
	line-height: 70px;
	font-size: 20px;
	color: white;
}

#header a:hover {
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
	padding-top: 150px;
	text-align: center;
}

.container .title-wrap .title {
	display: inline-block;
	height: 100%;
	font-size: 36px;
	text-align: center;
	padding: 0 8px;
	position: relative;
	font-family: "Jalnan";
	
}
.container .title-wrap .title:before {
	position: absolute;
	content: '';
	width: 100%;
	height: 14px;
	bottom: 7px;
	left: 0;
	z-index: -1;
	background: #EDE6DB;
}
.container > .content-wrapper {
    display: flex;
    height: 100%;
    align-items: flex-start;
    width: 100%;
    padding: 0 80px;
    flex-wrap: wrap;
 }

.content {
	height: 50px;
	width: 100%;
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 30px;
	font-family: "Jalnan";
}
.content h4 {
	font-size: 18px;
}

.list {
	height: 70%;
	margin-top: 0;
}
.info-list {
  width: 100%;
  padding: 0 150px;
}
.info-list li {
	width: 100%;
	height: 50px;
	text-align: center;
	border-bottom: 1px solid #b1b1b1;
  position: relative;
	margin-left: 0;
}
.info-list li > a {
  position: absolute;
  bottom: 5px;
  left: 0;
	color: #000;
	width: 100%;
	font-size: 18px;
}
.info-list li > a:before {
  position: absolute;
	content: '';
	height: 14px;
	width: 0;
  bottom: 3px;
	left: 50%;
	background: #EDE6DB;
	z-index: -10;
	transition: 0.7s;
}
.info-list li > a.on:before {
  position: absolute;
	content: '';
	height: 14px;
	width: 70%;
  bottom: 3px;
	left: 36px;
	background: #EDE6DB;
	z-index: -10;
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
.copyright .copyright-logo a {
  color: transparent;
}
.copyright a, .copyright p {
  font-size: 15px;
}
</style>
</head>
<% 
	String userId = (String)session.getAttribute("userId");
%>
<header>
	<%@ include file="/incl/header.jsp" %>
</header>
<body>
<section>
    <div class="container">
      <div class="title-wrap">
        <h3 class="title">MY PAGE</h3>
      </div>
      <div class="content-wrapper">
        <div class="content">
          <label><h4>회원아이디 :</h4></label>&nbsp;<%= userId %>
        </div>
        <div class="content list">
          <ul class="info-list">
            <li><a href="/chacha/user_update.do" class="mypage_list">정보 수정하기</a></li>
            <li><a href="/chacha/reservation/rez_checking.do" class="mypage_list">예약정보</a></li>
            <li><a href="/chacha/favorite/list.do" class="mypage_list">즐겨찾기 목록</a></li>
            <li><a href="/chacha/voucher/voucher_list.do" class="mypage_list">구매목록 확인</a></li>
          </ul>
        </div>
      </div>
    </div>
    <footer>
      <%@ include file="/incl/footer.jsp" %>
    </footer>
  </section>
  <script type="text/javascript">
		window.onload = function(){
			let mypage_list = document.getElementsByClassName('mypage_list');
			for(let i=0;i<mypage_list.length;i++){
				mypage_list[i].onmouseover = function(){
					mypage_list[i].classList.add('on');
				}
				mypage_list[i].onmouseout = function() {
					mypage_list[i].classList.remove('on');
				}
			}
		}
  </script>
</body>
</html>
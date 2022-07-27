<%@ page language="java" contentType="text/html; charset=UTF-8"		pageEncoding="UTF-8"%>
<%-- 
<%@ page import="" session="" errorPage="" isErrorPage="" contentType="" pageEncoding="" %>
 --%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>주차차</title>
  <link rel="stylesheet" href="../css/default.css">
  <link rel="stylesheet" href="../css/header.css">
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
  
    section {
      height: 100%;
      overflow: hidden;
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
    .container > #content-wrapper {
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
      width :100%;
    }
    .add {
      height: 60px;
      width: 100%;
      display: flex;
      justify-content: left;
      align-items: center;
      margin-top: 10px;
    }
    .phone {
      height: 60px;
      flex-wrap: wrap;
    }
    .add > input {
      width: 100%;
      height: 45px;
      line-height: 45px;
      padding-left: 5px;
      font-size: 15px;
    }
    .add > input:focus {
      outline: none;
      border-color: rgba(65, 125, 122, .6);
      box-shadow: 0 0 6px 2px rgba(65, 125, 122, .6);
    }
    .add > select.phoneNum_selec:focus {
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
      width: calc(70% - 17px);
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
    .address1 {
      width: 250px;
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
      font-size:20px;
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
    
  </style>
</head>
<body>
<header>
    <%@ include file="/incl/no_login_header.jsp" %>
  </header>
  <section>
    <div class="container">
      <div class="title-wrap">
        <h3 class="title">회원가입</h3>
      </div>
      <div id="content-wrapper">
        <div class="content">
          <form class="add_user" action="add_user.do" method="post">
            <div class="add">
              <input type="text" name="userId" placeholder="아이디">
            </div>
            <div class="add">
              <input type="password" name="password" placeholder="비밀번호">
            </div>
            <div class="add">
              <input type="text" name="userName" placeholder="이름">
            </div>
            <div class="add phone">
              <select class="phoneNum_selec" name="phoneNum1">
                <option value="010">010</option>
                <option value="011">011</option>
              </select>
              <span class="phoneNum_middle">-</span>
              <input type="text" class="phoneNum" name="phoneNum" placeholder="휴대폰번호" minlength="9">
              <span class="phone">* '-'까지 같이 적어주세요</span>
            </div>
            <div class="add">
              <input type="text" name="addr1" placeholder="주소" class="address1">
              <input type="text" name="addr2" placeholder="상세주소">
            </div>
            <div class="add">
              <input type="text" name="licenseNumber" placeholder="차량번호">
            </div>
            <div class="btn-group">
              <div class="i-btn">
                <div class="btn">
                  <button type="submit" class="btn-inner">확인</button>
                </div>
                <div class="btn">
                  <a href="/chacha" class="in-btn">취소</a>
                </div>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </section>
</body>
</html>
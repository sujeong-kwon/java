<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차차</title>
<link rel="stylesheet" href="../css/default.css">
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/footer.css">
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
    body {
		overflow: auto;
	}
	.title-wrap {
	   text-align: center;
	   margin-bottom: 30px;
	}
	.title-wrap .title {
	   display: inline-block;
	   height: 100%;
	   font-size: 36px;
	   text-align: center;
	   padding: 0 8px;
	   position: relative;
	   font-family: "Jalnan";
	}
	.title-wrap .title:before {
	   position: absolute;
	   content: '';
	   width: 100%;
	   height: 14px;
	   bottom: -4px;
	   left: 0;
	   z-index: -1;
	   background: #EDE6DB;
	}

	.wrapper {
		width: 975px;
		margin: 100px auto 	0;
		height: calc(100vh - 340px);
	}
	
	.form .option_item{
		display: block;
		position: relative;
		width: 175px;
		height: 175px;
		margin: 10px;
	}
	
	.option_item .option_inner {
		width: 100%;
		height: 100%;
		background: #fff;
		border-radius: 5px;
		text-align: center;
		padding: 58px 40px;
		cursor: pointer;
		display: block;
		border: 5px solid #1D5C63;
		position: relative;
		font-family: "Jalnan";
	}
	
	.option_item .checkbox {
		position: absolute;
		top: 10px;
		right: 10px;
	}
	
	.option_item .option_inner .icon {
		margin-bottom: 10px;
	}
	.option_item .option_inner .icon .fab {
		font-size: 32px;
	}
	
	.option_item .option_inner .name {
		user-select: none;
		font-size: 20px;
	}
	
	.option_item .checkbox:checked ~ .option_inner{
		border-color: #417D7A;
		color: black;
	}
	
	.option_item .option_inner .tickmark{
		position: absolute;
		top: 0px;
		right: 0px;
		border: 20px solid;
		border-color: #417D7A;
		display: none;
	}
	
	.option_item .checkbox:checked ~ .option_inner .tickmark{
		display: block;
	}
	
	.option_item .option_inner .tickmark:before{
		content: "";
		position: absolute;
		top: -11px;
		left: -8px;
		width: 15px;
		height: 5px;
		border: 3px solid;
		border-color: transparent transparent #fff #fff;
		transform: rotate(-45deg);
	}
	.wrap {
	width: 1000px;
	height: 200px;
	display : flex;
	justify-content: center;
	margin: 100px 0;
	}
	
	.i-btn {
      display: flex;
      justify-content: center;
      align-items: center;
      margin-top: 30px;
      padding: 0 80px;
      height: 100%;
      width: 100%;
    }
    .i-btn > input {
      justify-content: center;
      border-style: none;
      font-size: 20px;
      background: #417D7A;
      color: white;
      border-radius: 30px;
      width: 150px;
      height: 50px;
      cursor: pointer;
      font-family: "Jalnan";
    }
    .i-btn > button > a {
        line-height: 56px;
        display: inline-flex;
    }
    .i-btn > input:hover{
     color : #417D7A;
     background-color: #fff;
     border : 1px solid #417D7A;
   }
</style>
</head>
<body>
	<div id="header">
		<%@ include file="/incl/header.jsp" %>
	</div>
<div class="wrapper">
		<div class="title-wrap">
        	<h3 class="title">주차권 구입</h3>
     	</div>
	<form name="form" action="voucher.do" method="post" class="form">
	<div class ="wrap">
		<div>
			<label class="option_item">
			<input type="checkbox" class="checkbox" name="voucher" value="A.1">
			<div class="option_inner">
				<div class="tickmark"></div>
				<div class="name">1시간 <br> 주차권</div>
			</div>
			</label>
		</div>
		<div>
			<label class="option_item">
			<input type="checkbox" class="checkbox" name="voucher" value="A.3">
			<div class="option_inner">
				<div class="tickmark"></div>
				<div class="name">3시간 <br> 주차권</div>
			</div>
			</label>
		</div>
		<div>
			<label class="option_item">
			<input type="checkbox" class="checkbox" name="voucher" value="A.5">
			<div class="option_inner">
				<div class="tickmark"></div>
				<div class="name">5시간 <br> 주차권</div>
			</div>
			</label>
		</div>
		<div>
			<label class="option_item">
			<input type="checkbox" class="checkbox" name="voucher" value="B.0">
			<div class="option_inner">
				<div class="tickmark"></div>
				<div class="icon">
					<i class="fab" aria-hidden="true"></i>
				</div>
				<div class="name">종일권</div>
			</div>
			</label>
		</div>
		<div>
			<label class="option_item">
			<input type="checkbox" class="checkbox" name="voucher" value="C.0">
			<div class="option_inner">
				<div class="tickmark"></div>
				<div class="icon">
					<i class="fab" aria-hidden="true"></i>
				</div>
				<div class="name">정기권</div>
			</div>
			</label>
		</div>
		</div>
	<div class="i-btn">
	   <input type="submit" class="gbtn" value="구매하기">
	 </div>
	</form>	
</div>
<footer>
	<%@ include file="/incl/footer.jsp" %>
</footer>
</body>
</html>
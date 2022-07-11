<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차차</title>
<link rel="stylesheet" href="../css/fixmethod.css">
<link rel="stylesheet" href="../css/style.css">
<style>
	.container {
      padding-top: 80px;
      display: flex;
      flex-wrap: wrap;
      height: 100%;
      width: 700px;
      margin: 0 auto;
    }
	#myform fieldset{
	    display: inline-block;
	    direction: rtl;
	    border:0;
	}
	#myform fieldset legend{
	    text-align: right;
	}
	#myform input[type=radio]{
	    display: none;
	}
	#myform label{
	    font-size: 3em;
	    color: transparent;
	    text-shadow: 0 0 0 #f0f0f0;
	}
	#myform label:hover{
	    text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
	}
	#myform label:hover ~ label{
	    text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
	}
	#myform input[type=radio]:checked ~ label{
	    text-shadow: 0 0 0 rgba(250, 208, 0, 0.99);
	}
	#reviewContents {
	    width: 100%;
	    height: 150px;
	    padding: 10px;
	    box-sizing: border-box;
	    border: solid 1.5px #D3D3D3;
	    border-radius: 5px;
	    font-size: 16px;
	    resize: none;
	}
	.i-btn {
      display: flex;
      justify-content: center;
      margin-top: 30px;
      height: 50px;
    }
    .i-btn > input {
      justify-content: center;
      border-style: none;
      font-size: 20px;
      background: #324ff4;
      color: white;
      border-radius: 30px;
      width: 150px;
      height: 50px;
      cursor: pointer;
    }
</style>
</head>
<body>
	<div id="header">
		<%@ include file="/incl/menu.jsp" %>
	</div>
	<h3 class="title">리뷰 작성하기</h3>
	<div class="container">
	    <form class="mb-3" name="myform" id="myform" method="post">
			<fieldset>
				<span class="text-bold">별점을 선택해주세요</span>
				<input type="radio" name="reviewStar" value="5" id="rate1"><label
					for="rate1">★</label>
				<input type="radio" name="reviewStar" value="4" id="rate2"><label
					for="rate2">★</label>
				<input type="radio" name="reviewStar" value="3" id="rate3"><label
					for="rate3">★</label>
				<input type="radio" name="reviewStar" value="2" id="rate4"><label
					for="rate4">★</label>
				<input type="radio" name="reviewStar" value="1" id="rate5"><label
					for="rate5">★</label>
			</fieldset>
			<div>
				<textarea class="col-auto form-control" type="text" id="reviewContents"
						  placeholder="좋은 수강평을 남겨주시면 주차차에 큰 힘이 됩니다!"></textarea>
			</div>
			<div class="i-btn">
	        	<input type="submit" value="리뷰작성" class="in-btn"/>
	      	</div>
		</form>
	</div>
</body>
</html>
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
  	.reviewform textarea{
    width: 100%;
    padding: 10px;
    box-sizing: border-box;
}
	.rating .rate_radio {
	    position: relative;
	    display: inline-block;
	    z-index: 20;
	    opacity: 0.001;
	    width: 60px;
	    height: 60px;
	    background-color: #fff;
	    cursor: pointer;
	    vertical-align: top;
	    display: none;
	}
	.rating .rate_radio + label {
	    position: relative;
	    display: inline-block;
	    margin-left: -4px;
	    z-index: 10;
	    width: 60px;
	    height: 60px;
	    background-image: url('./img/starrate.png');
	    background-repeat: no-repeat;
	    background-size: 60px 60px;
	    cursor: pointer;
	    background-color: #f0f0f0;
	}
	.rating .rate_radio:checked + label {
	    background-color: #ff8;
	}
	
	.warning_msg {
	    display: none;
	    position: relative;
	    text-align: center;
	    background: #ffffff;
	    line-height: 26px;
	    width: 100%;
	    color: red;
	    padding: 10px;
	    box-sizing: border-box;
	    border: 1px solid #e0e0e0;
	}
</style>
</head>
<body>
	<div id="header">
		<%@ include file="/incl/menu.jsp" %>
	</div>
	<h3 class="title">리뷰 수정하기</h3>
	<div class="container">
	    <form name="reviewform" class="reviewform" method="post" action="/save">
	        <input type="hidden" name="rate" id="rate" value="0"/>
	        <p class="title_star">별점과 리뷰를 남겨주세요.</p>
	        <div class="review_rating">
	            <div class="warning_msg">별점을 선택해 주세요.</div>
	            <div class="rating">
	                <!-- 해당 별점을 클릭하면 해당 별과 그 왼쪽의 모든 별의 체크박스에 checked 적용 -->
	                <input type="checkbox" name="rating" id="rating1" value="1" class="rate_radio" title="1점">
	                <label for="rating1"></label>
	                <input type="checkbox" name="rating" id="rating2" value="2" class="rate_radio" title="2점">
	                <label for="rating2"></label>
	                <input type="checkbox" name="rating" id="rating3" value="3" class="rate_radio" title="3점" >
	                <label for="rating3"></label>
	                <input type="checkbox" name="rating" id="rating4" value="4" class="rate_radio" title="4점">
	                <label for="rating4"></label>
	                <input type="checkbox" name="rating" id="rating5" value="5" class="rate_radio" title="5점">
	                <label for="rating5"></label>
	            </div>
	        </div>
	        <div class="review_contents">
	            <div class="warning_msg">5자 이상으로 작성해 주세요.</div>
	            <textarea rows="10" class="review_textarea"></textarea>
	        </div>   
	        <div class="cmd">
	            <input type="submit" name="save" id="save" value="등록">
	        </div>
	    </form>

	</div>
</body>
</html>
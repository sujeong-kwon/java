<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차차</title>
<link rel="stylesheet" href="../css/fixmethod.css">
<link rel="stylesheet" href="../css/style.css">
<style>
	.reviewList > li {
		display: flex;	
	}
	
	.reviewList{
		padding-bottom : 15px;
		border-bottom: 1px solid #aeaeae;
	}
	.reviewTuhmnail{
		width: 110px;
		height: 110px;
		margin-right: 20px;
		
	}
	.reviewText{
		text-align:left;
		width: 900px;
		margin-right: 20px;
	}
	.reviewWriter{
		width: 218px;
		text-align: right;
	}
	.writeDiv{
		text-align: right;
		margin-bottom: 50px;
	}
	.writeBtn{
		border: none;
		border-radius: 5px;
		background-color: black;
		color: white;
		width: 120px;
		height: 40px;
		
	}
	.reviewTuhmnail > a > img{
		width: 110px;
		height: 110px;
	}
	
	.reviewContentImg > a > img{
		width: 60px;
		height: 60px;
	}
	
	.longText > div > a > img {
		width: 120px;
		height: 120px;
	}
	.productName{
		font-size: 14px;
		color: gray;
	}
	.shortText{
		padding:6px;
		width: 500px;
		white-space: nowrap;
		overflow: hidden;
		text-overflow: ellipsis;
	}
	
	.openText{
		display: none;	
	}
	
	.openText img{
		width: 300px;
		height: 300px;
	}
	
	.more, .fold{
		font-size: 13px;
		color: #67b08f;
	}
	
	.reviewWriter label {
	    position: relative;
	    display: inline-block;
	    margin-left: 0px;
	    z-index: 10;
	    width: 15px;
	    height: 15px;
	    background-image: url('../image/starrate.png');
	    background-repeat: no-repeat;
	    background-size: 15px 15px;
	    background-color: #ffc84b;
	}
</style>
</head>
<body>
<div id="header">
	<%@ include file="/incl/menu.jsp" %>
</div>
<h3 class="title">리뷰 작성하기</h3>
<div class="container" style="height: 1300px; overflow : auto;">
	<div class="row">
	<h2 class="text-center">사용후기</h2>
		<div class="col">
		<!-- foreach -->
			<c:forEach var="item" items="${list }">
				<ul class="reviewList">
					<li>
						<div class="reviewTuhmnail">
							<a href="#"><img alt="썸네일" src="/upload/${item.thumbnailImg }"></a>		
						</div>
						
						<div class="reviewText">
							<div>
								<span class="productName">${item.productName }</span>
							</div>
							<div>
								<div class="foldedText">
									<div class="shortText"><span>${item.content }</span>
									</div>
									<a href="javascript:void(0);" class="more">-더보기</a>
								</div>
								<div class="openText">
									<div class="longText"><span>${item.content }</span>
									<div><img alt="유저이미지" src="/upload/${item.contentImg }">
									</div>
									<a href="javascript:void(0);" class="fold">-접기</a>
								</div>
								 </div>
							</div>
						</div>
						
						<div class="reviewWriter"> <!-- 별점 표시 -->
							<div>
							<c:if test="${item.starRating ==1}">
								<span><label></label></span>
							</c:if>	
							<c:if test="${item.starRating ==2}">
								<span><label></label><label></label></span>
							</c:if>	
							<c:if test="${item.starRating ==3}">
								<span><label></label><label></label><label></label></span>
							</c:if>	
							<c:if test="${item.starRating ==4}">
								<span><label></label><label></label><label></label><label></label></span>
							</c:if>	
							<c:if test="${item.starRating ==5}">
								<span><label></label><label></label><label></label><label></label><label></label></span>
							</c:if>	
							</div>
							<div>
								<span>${item.writer }</span>
							</div>
							<c:if test="${item.contentImg != null}"> 
							<div class="reviewContentImg"> 
								<a href="#"><img alt="유저이미지" src="/upload/${item.contentImg }"></a>		
							</div>
							</c:if>
						</div>
					</li>
				</ul>
			</c:forEach>	
		</div>
	</div>
</div>
<script type="text/javascript">
	$(document).ready(function () { //더보기
		$('.more').on('click',function(){
			$(this).parent().css('display','none');
			$(this).parent().next().css('display','block');
		})
	})
	
	$(document).ready(function () { //접기
		$('.fold').on('click',function(){
			$(this).parent().parent().css('display','none');
			$(this).parent().parent().prev().css('display','block');
		})
	})
	
</script>
</body>
</html>
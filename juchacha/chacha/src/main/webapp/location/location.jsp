<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차차</title>
<link rel="stylesheet" href="../css/default.css">
<link rel="stylesheet" href="../css/header.css">
<style type="text/css">
	@font-face {
		src: url("/chacha/css/Jalnan.ttf");
		font-family: "Jalnan";
	}
	@font-face {
	    font-family: 'BMJUA';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_one@1.0/BMJUA.woff') format('woff');
	    font-weight: normal;
	    font-style: normal;
	}
	.gnb ul li a {
	    line-height: 70px;
	    font-size: 20px;
	    color: white;
	    font-family: "Jalnan";
   	}
	html, body {
		margin: 0;
	}
	body {
		position: relative;
	}
	/* 검색창 */
	.content {
      position: absolute;
      top: 80px;
      left: 40px;
      z-index: 20;
      width: 400px;
      height: 90px;
   }
    .search-wrap {
      height: 100%;
   }
   .search-wrap > form {
      display: flex;
      height: 100%;
      align-items: center;
   }
   .search-wrap > form > input {
      height: 50px;
      width: 300px;
      padding-left: 10px;
      font-size: 16px;
      font-family: "Jalnan";
      border-style: none;
   }
   .search-wrap > form > input:focus {
      outline: none;
   }
   .i-btn {
      display: flex;
      align-items: center;
      height: 100%;
    }
    .i-btn .btn {
      display: flex;
      justify-content: center;
      height: 100%;
      background: #417D7A;
      width: 80px;
      height: 50px;
    }
    input.btn-inner {
      color: white;
      border-style: none;
      height: 100%;
      width: 75px;
      font-size:20px;
      background: none;
      cursor: pointer;
      font-family: "Jalnan";
    }
	/* 검색리스트 */
	.searchList {
		position: absolute;
		top: 80px;
		bottom: 0;
		right: -500px;
		width: 350px;
		height: calc(100vh - 80px);
		background: white;
		border: 1px solid #EDE6DB;
		overflow: auto;
		z-index: 1;
		font-family: 'BMJUA';
	}
	.searchList.on {
		animation: onAni 1s linear forwards;
	}
	
	@keyframes onAni {
		from {
			right: -500px;
		}
		to {
			right: 0px;
		}
	}
	@keyframes offAni {
		from {
			right: 0px;
		}
		to {
			right: -500px;
		}
	}
	.btn_close{
		width:50px;
		height:50px;
		position:relative;
		text-indent:-9999px;
		float: right;
		margin-top: 10px;
		margin-right: 10px;
		background: inherit ; 
		border:none; 
		box-shadow:none; 
		border-radius:0; 
		padding:0; 
		overflow:visible; 
		cursor:pointer;
	}
	.btn_close:before,.btn_close:after{
		content:'';
		width:30px;
		height:1px;
		position:absolute;
		left:50%;
		top:50%;
		border-radius:4px;
		background:#000
	}
	.btn_close:before{
		transform:translate(-50%,-50%) rotate(-45deg)
	}
	.btn_close:after{
		transform:translate(-50%,-50%) rotate(45deg)
	}
	.searchList h5 {
		margin-top: 60px;
		margin-left: 20px;
		font-size: 26px;
		color: #1A3C40;
	}
	.searchList h5 span {
		color: #417D7A;
	}
	.searchList .searchTbl {
		margin: 0 auto;
		margin-top: 30px;
	}
	.searchList .searchTbl tr {
		height: 30px;
	}
	.searchList .searchTbl tr th {
		width: 100px;
		color: #1A3C40;
	}
	.searchList .searchTbl tr td {
		width: 200px;
	}
	td.addr {
		display: inline-block;
		height: 30px;
		line-height: 30px;
		white-space:nowrap;
		overflow:hidden;
		text-overflow:ellipsis;
	}
	.pbtn {
	display: inline-block;
	width: 60px;
    height: 20px;
    margin: 0 auto;
    margin-top: 5px;
    margin-right: 20px;
    float: right;
    background: #417D7A;
    border: none;
    border-radius: 30px;
    line-height: 14px;
    text-align: center;
    font-size: 14px;
    color: white;
    cursor: pointer;
    font-family: "Jalnan";
	}
	.searchList .table-wrap {
		width: 100%;
		height: auto;
		position: relative;
	}
	.searchList .table-wrap:after {
		content: '';
		position: absolute;
		display: block;
		left: 25px;
		bottom: -40px;
		width: 300px;
		height: 3px;
		background: #EDE6DB;
	}
	.searchList .table-wrap:last-child:after {
		display: none;
	}
	.searchList .table-wrap + .table-wrap {
		margin-top: 70px;
	}
	.searchList .table-wrap:last-child {
		margin-bottom: 70px;
	}
</style>
<script type="text/javascript" src="../js/jquery.js"></script>
</head>
<body>
<header>
	<%@ include file="/incl/header.jsp" %>
</header>
<!-- 지도 -->
<div id="map" style="width:100%;height:100vh;"></div>

<!-- 검색창 -->
<div class="content">
   <div class="search-wrap">
      <form action="/chacha/parkinglot/parking_search.do" method="get">
         <input type="text" name="keyword" placeholder="검색하기">
         <div class="i-btn">
            <div class="btn">
               <input type="submit" class="btn-inner" value="검색">
            </div>
         </div>
      </form>
   </div>
</div>
<!-- 검색목록 -->
<div class="searchList ${ON}">
	<button class="btn_close" type="button"></button>
	<c:if test="${empty search_str}">
		<h5>주변 주차장 <span>${fn:length(ParkingLotList)}</span></h5>
	</c:if>
	<c:if test="${not empty search_str}">
		<h5>지도 내 주차장 <span>${fn:length(ParkingLotList)}</span></h5>
	</c:if>
	<c:forEach var="parking" items="${ParkingLotList}">
		<div class="table-wrap">
			<table class="searchTbl">
				<tr>
					<th>주차장명</th>
					<td>${parking.parkingName}</td>
				</tr>
				<tr>
					<th>주소</th>
					<td class="addr">${parking.parkingAddr}</td>
				</tr>
				<tr>
					<th>연락처</th>
					<td>${parking.parkingTel}</td>
				</tr>
			</table>
			<button class="pbtn" onclick="location.href='/chacha/parking/get_parking_point.do?pointX=${parking.pointX}&pointY=${parking.pointY}'">더 보기</button>
		</div>
	</c:forEach>
</div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=1b4ff6e20d754b853ba624fa3a2f172d"></script>
<script>
   var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
       mapOption = { 
           center: new kakao.maps.LatLng(35.8660426, 128.5938422), // 지도의 중심좌표
           level: 3 // 지도의 확대 레벨
       };
   
   // 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
   var map = new kakao.maps.Map(mapContainer, mapOption);
   
   // 현재 위치 좌표
   var markerPosition  = new kakao.maps.LatLng(35.8660426, 128.5938422);
   
   var listName = new Array(); // 주차장이름 담을 배열
   var listX = new Array(); // 주차장 좌표x 담을 배열
   var listY = new Array(); // 주파장 좌표y 담을 배열

   <c:forEach var="parking" items="${ParkingLotList}">
   		listName.push("${parking.parkingName}");
	  	listX.push("${parking.pointX}");
	  	listY.push("${parking.pointY}");
   </c:forEach>
   
   // 마커를 표시할 위치와 title 객체
   var positions = [];
   
   for(let i = 0; i < listX.length; i++) {
	   positions.push({
		   title: listName[i],
	       latlng: new kakao.maps.LatLng(listX[i], listY[i])
	   });
   }
   
   // 주차장 마커 이미지
   var ParkingmarkerImageSrc = 'https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/category.png';  // 마커이미지의 주소입니다. 스프라이트 이미지 입니다
   var ParkingimageSize = new kakao.maps.Size(30, 36);
   var ParkingimageOptions = {
		   spriteOrigin: new kakao.maps.Point(10, 72),
		   spriteSize: new kakao.maps.Size(42, 108)
   };
   var ParkingmarkerImage = new kakao.maps.MarkerImage(ParkingmarkerImageSrc, ParkingimageSize, ParkingimageOptions);

   
   // 마커 생성
   // 현재 위치 마커
   var marker = new kakao.maps.Marker({
        position: markerPosition
    });
   
   // 주차장 위치 마커
   for(let i = 0; i < positions.length; i++) {
	   
	   // 마커 생성
	   let marker = new kakao.maps.Marker({
		   map: map, // 마커를 표시할 지도
		   position: positions[i].latlng, // 마커 표시 위치
		   title: positions[i].title, // 마커 타이틀
		   image: ParkingmarkerImage// 마커 이미지
	   });
	   
	   // 아래 코드는 위의 마커를 생성하는 코드에서 clickable: true 와 같이
	   // 마커를 클릭했을 때 지도의 클릭 이벤트가 발생하지 않도록 설정합니다
	   marker.setClickable(true);
	    
	   // 마커에 클릭이벤트를 등록합니다
	   kakao.maps.event.addListener(marker, 'click', function() {

	   // 마커 위에 인포윈도우를 표시합니다
	   location.href = '/chacha/parking/get_parking_point.do?pointX=' + listX[i] + '&pointY=' + listY[i];
	   });
	   
   }

    
    // 마커가 지도 위에 표시되도록 설정합니다
    marker.setMap(map);
    
    // 현재 위치 마커 위에 콘텐츠 표시
    var content = '<div style="width: 85px; height: 26px; margin-bottom: -150px; background: white; border: 1px solid lightgray; font-size: 16px; text-align: center;">현재 위치</div>';
    var position = new kakao.maps.LatLng(35.8660426, 128.5938422);
    
    // 커스텀 오버레이 생성 생성
    var customOverlay = new kakao.maps.CustomOverlay({
    	position: position,
    	content: content
    });
    
    // 커스텀 오버레이 지도에 표시
    customOverlay.setMap(map);
    // 아래 코드는 지도 위의 마커를 제거하는 코드입니다
    // marker.setMap(null);
    
    console.log("${search_str}")
    // 제이쿼리(on클래스 추가 및 삭제)
    $(function() {
    	$('.btn_close').click(function() {
    		$('.searchList').css("animation", "offAni 1s linear forwards");
    		$('.searchList').removeClass("on");
    	});
    });
</script>
</body>
</html>
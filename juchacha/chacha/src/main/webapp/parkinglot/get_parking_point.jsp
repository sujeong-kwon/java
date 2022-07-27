<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ko" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>주차장정보</title>
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
   
  	body { overflow: auto; }
    .wrap {
      width: 100%;
      height: calc(100vh - 30px);
    }

    .parkingloth1 {
      margin-top: 90px;
    }
	.parkingaddr {
		margin-top : 20px;
		margin-bottom : 20px;
	}
    h1,
    h2,
    h4 {
      text-align: center;
    }

    table {
      margin: 0 auto;
      margin-bottom: 20px;
      font-size: 18px;
      font-weight: 700;
      border-collapse: collapse;
      border: 1px solid lightgray;
    }

    .btn {
      display: block;
      width: 150px;
      height: 50px;
      margin: 0 auto;
      margin-top: 40px;
      background: #417D7A;
      border: none;
      border-radius: 30px;
      line-height: 50px;
      text-align: center;
      font-size: 20px;
      color: white;
      cursor: pointer;
    }
	.btn:hover{
	  color : #417D7A;
	  background-color: #fff;
	  border : 1px solid #417D7A;
	}
    .cost,
    .space,
    .review {
      width: 800px;
      height: 200px;
    }

    .cost thead tr th,
    .space thead tr th,
    .review thead tr th {
      background-color: #417D7A;
      color: #fff;
      height: 40px;
    }

    .cost tbody tr td:first-child {
      width: 200px;
      background-color: #417D7A;
      text-align: center;
      color: #fff;
    }

    .cost tbody tr td:last-child {
      text-align: right;
    }

    .space tbody tr td:first-child {
      width: 200px;
      background-color: #417D7A;
      text-align: center;
      color: #fff;
    }

    .space tbody tr td:last-child {
      text-align: right;
    }

    .review {
      margin-top: 20px;
    }

    .review tbody tr.review-header {
      background-color: #417D7A;
      color: #fff;
      height: 40px;
      text-align: center;
    }

    .review tbody tr.review-title {
      height: 30px;
      text-align: center;
    }

    .review tbody tr.review-content {
      height: 150px;
    }

    .review tbody tr.review-content td:first-child {
      background-color: #417D7A;
      color: #fff;
      text-align: center;
      width: 130px;
    }
    .parkingloth1 input {
   display: inline-block;
   direction: rtl;
   border: 0;
}

.parkingloth1 input[type=radio] {
   display: none;
}

.parkingloth1 label {
   font-size: 1.25em;
   color: transparent;
   text-shadow: 0 0 0 #f0f0f0;
}

.parkingloth1 input[type=radio]:checked ~ label {
   text-shadow: 0 0 0 #ED4652;
}
  </style>
</head>

<body>
  <header>
    <%@ include file="/incl/header.jsp" %>
  </header> 
  <div class="wrap">
  		<c:if test="${favorite == true}">
  			<h1 class="parkingloth1">${ParkingLot.getParkingName()}
         		<input type="radio" name ="heart" id="rate1" onClick="location.href='/chacha/favorite/favorite.do?pid=${ParkingLot.getPid()}'" checked><label for="rate1">♥</label>
      		</h1>
  		</c:if>
       <c:if test="${favorite == false}">
  			<h1 class="parkingloth1">${ParkingLot.getParkingName()}
         		<input type="radio" name ="heart" id="rate1" onClick="location.href='/chacha/favorite/favorite.do?pid=${ParkingLot.getPid()}'"><label for="rate1">♥</label>
      		</h1>
  		</c:if>
    <h2 class="parkingaddr">${ParkingLot.getParkingAddr()}</h2>
    <h4>${ParkingLot.getParkingTel()}</h4>
    <table border="1" class="cost">
      <thead>
        <tr>
          <th colspan="2">요금</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>시간당</td>
          <td>${ParkingLot.getTimeCost()} 원</td>
        </tr>
        <tr>
          <td>종일권</td>
          <td>${ParkingLot.getDayCost()} 원</td>
        </tr>
        <tr>
          <td>정기권</td>
          <td>${ParkingLot.getMonthCost()} 원</td>
        </tr>
      </tbody>
    </table>
    <table border="1" class="space">
      <thead>
        <tr>
          <th colspan="2">주차가능한 자리</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>주차장 주차공간</td>
          <td>${ParkingLot.getParkingSpace()} 대</td>
        </tr>
        <tr>
          <td>현재 주차중인 차량 수</td>
          <td>${space} 대</td>
        </tr>
      </tbody>
    </table>
    <input type="button" class="btn" value="예약페이지" onClick="location.href='/chacha/reservation/rez.do?pid=${ParkingLot.getPid()}'">
  
	   <table border="1" class="review">
      <thead>
        <tr>
          <th colspan="3">리뷰</th>
        </tr>
      </thead>
      <tbody>     
        <c:if test="${not empty review}">
        <c:forEach var="re" items="${review}">
         <tr class ="review-header">
          <td>사용자</td>
          <td>별점</td>
          <td>작성일</td>
        </tr>
          <tr class="review-title">
            <td>${re.getUser().getUserId()}</td>
            <td>${re.getStar_rating()}</td>
            <td>${re.getRegDate()}</td>
          </tr>
          <tr class="review-content">
            <td>내용</td>
            <td colspan="2">${re.getContent()}</td>
          </tr>
        </c:forEach>
          </c:if>
      </tbody>
    </table>
     <footer>
    <%@ include file="/incl/footer.jsp"%>
  </<footer>
  </div>
  
</body>

</html>
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
<link rel="stylesheet" href="../css/reservation.css">
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
	.title-wrap {
	   text-align: center;
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
</style>
<script type="text/javascript" src="../js/jquery.js"></script>
</head>
<body>
	<header>
		<%@ include file="/incl/header.jsp" %>
	</header>
	<div class="wrap">
	  <div class="title-wrap">
        <h3 class="title">예약하기</h3>
      </div>
      <div class="parkingInfo">
      	<p>예약할 주차장</p>
        <table>
          <tr>
            <th>주차장명</th>
            <td>${parking.parkingName}</td>
          </tr>
          <tr>
            <th>연락처</th>
            <td>${parking.parkingTel}</td>
          </tr>
          <tr>
            <th>주소</th>
            <td>${parking.parkingAddr}</td>
          </tr>
        </table>
      </div>

      <form class="rez" action="rez.do" method="post">
        <p>주차타입</p>
        <div class="type">
        	<label class="radio on"><input type="radio" name="type" value="A" checked>시간당</label>
        	<label class="radio"><input type="radio" name="type" value="B">종일권</label>
        	<label class="radio"><input type="radio" name="type" value="C">정기권</label>
        </div>

        <!-- A면 예약 일월, 시작-종료시간 전부 표시
            B면 예약 일월만 표시
            C면 예약 월만 표시-->
        <p>예약일자</p>
        <label class="startM">
          <select class="startMonth" name="startMonth">
            <option value="01">1</option>
            <option value="02">2</option>
            <option value="03">3</option>
            <option value="04">4</option>
            <option value="05">5</option>
            <option value="06">6</option>
            <option value="07">7</option>
            <option value="08">8</option>
            <option value="09">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
          </select>
          월
        </label>
        <label class="startD">
          <select class="startDate" name="startDate">
            <option value="01">1</option>
            <option value="02">2</option>
            <option value="03">3</option>
            <option value="04">4</option>
            <option value="05">5</option>
            <option value="06">6</option>
            <option value="07">7</option>
            <option value="08">8</option>
            <option value="09">9</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
            <option value="21">21</option>
            <option value="22">22</option>
            <option value="23">23</option>
            <option value="24">24</option>
            <option value="25">25</option>
            <option value="26">26</option>
            <option value="27">27</option>
            <option value="28">28</option>
            <option value="29">29</option>
            <option value="10">30</option>
            <option value="11">31</option>
          </select>
          일
        </label>
        <p class="t">예약시간</p>
        <label class="startT">시작시간
          <select class="startTime" name="startTime">
            <option value="00">00</option>
            <option value="01">01</option> 
            <option value="02">02</option>
            <option value="03">03</option>  
            <option value="04">04</option> 
            <option value="05">05</option> 
			<option value="06">06</option>
			<option value="07">07</option>
			<option value="08">08</option>
			<option value="09">09</option>
			<option value="10">10</option>
			<option value="11">11</option> 
            <option value="12">12</option>
            <option value="13">13</option>  
            <option value="14">14</option> 
            <option value="15">15</option> 
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option> 
            <option value="22">22</option>
            <option value="23">23</option>     
          </select>
          시
        </label>
        <label class="endT">종료시간
          <select class="endTime" name="endTime">
          	<option value="00" selected>00</option>
            <option value="01">01</option> 
            <option value="02">02</option>
            <option value="03">03</option>  
            <option value="04">04</option> 
            <option value="05">05</option> 
			<option value="06">06</option>
			<option value="07">07</option>
			<option value="08">08</option>
			<option value="09">09</option>
			<option value="10">10</option>
			<option value="11">11</option> 
            <option value="12">12</option>
            <option value="13">13</option>  
            <option value="14">14</option> 
            <option value="15">15</option> 
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option> 
            <option value="22">22</option>
            <option value="23">23</option>
          </select>
          시
        </label>

        <input type="submit" name="submit" value="예약하기">
      </form>
    </div>
    <footer>
	    <%@ include file="/incl/footer.jsp" %>
	</footer>
    <script type="text/javascript">
   		 $(function() {
    	  let date = new Date();
    	  let month = "0" + (date.getMonth() + 1); // 현재 월
    	  let day = date.getDate(); // 현재 일자
    	  let hour; // 현재 시간
    	  let nextHour; // 종료 시간담을 변수
    	  
    	  if(date.getHours() == 9) {
    		  hour = "0" + date.getHours();
    		  nextHour = 10;
    	  }
    	  if(date.getHours() < 10) {
    		  hour = "0" + date.getHours();
    		  nextHour = date.getHours() + 1
    	  } else {
    		  hour = date.getHours();
    		  nextHour = date.getHours() + 1
    	  }
    	  
    	  console.log(hour);
    	  $('.startMonth').val(month).attr("selected", "selected"); // 현재 월로 selected
    	  $('.startDate').val(day).attr("selected", "selected"); // 현재 일로 selected
    	  $('.startTime').val(hour).attr("selected", "selected"); // 현재 시로 selected
    	  $('.endTime').val(nextHour).attr("selected", "selected");  // 현재 시 + 1로 selected
    	  
    	  $('input[type=radio]').css("display", "none");
    	  $('.radio').click(function() {
    		  $('input[type=radio]').removeAttr("checked");
    		  $(this).find('input[type=radio]').attr("checked", "checked");
    		  $('.radio').removeClass("on");
    		  $(this).addClass("on");
    		  
    		  if($(this).hasClass("on")) {
    			  if($(this).find('input[type=radio]').val() == "A") { // 시간당이라면
    				  $('.startD').removeClass("off");
    				  $('.t').removeClass("off");
    				  $('.startT').removeClass("off");
    				  $('.endT').removeClass("off");
    			  } else if($(this).find('input[type=radio]').val() == "B") { // 종일권이라면 일까지만 표시
    				  $('.startD').removeClass("off");
    				  $('.t').addClass("off");
    				  $('.startT').addClass("off");
    				  $('.endT').addClass("off");
    			  } else if($(this).find('input[type=radio]').val() == "C") { // 정기권이라면 월까지만 표시
    				  $('.startD').addClass("off");
    				  $('.t').addClass("off");
    				  $('.startT').addClass("off");
    				  $('.endT').addClass("off");
    			  }
    		  }
    	  });

    	});
    </script>
</body>
</html>
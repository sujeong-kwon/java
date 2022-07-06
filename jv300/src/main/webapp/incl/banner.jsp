<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLDecoder"%>
<style>
	#banner{
		position: fixed;
		top: 0;
		left: 0;
		width: 100%;
		justify-content: center;
		text-align: center;
		height: 100px;
		line-height: 100px;
		background-color: #ddd;
	}
	a{
		position: fixed;
		top: 0;
		left: 0;
	}
</style>
<div id="banner">
	<h4><%=URLDecoder.decode(request.getParameter("subtitle"),"UTF-8")%></h4>
	<a href="list_users.do">회원정보 불러오기</a>
</div>
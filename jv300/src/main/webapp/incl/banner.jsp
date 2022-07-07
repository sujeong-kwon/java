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
	.user_info{
		position: fixed;
		top: 0;
		left: 0;
	}
	.user_modify{
		position: fixed;
		top: 0;
		left: 0;
		margin-left: 200px;
	}
</style>
<div id="banner">
	<h4><%=URLDecoder.decode(request.getParameter("subtitle"),"UTF-8")%></h4>
	<a class="user_info" href="list_users.do">회원정보 불러오기</a>
	<a class="user_modify" href="modify_user.do">회원정보 수정하기</a>
</div>
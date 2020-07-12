<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css?after" />
</head>
<body>
	<div id="userInfo">
		<div id="userWelcom"><label>서창재님 안녕하세요</label></div>
		<table id="userTable">
			<tr>
				<td>적립금</td>
				<td onclick="location.href='www.naver.com'">10000</td>
				<td onclick="location.href='www.naver.com'">장바구니</td>
			</tr>
			<tr>
			<td>로그아웃</td>
			<td onclick="location.href='www.naver.com'">마이페이지</td>
			<td onclick="location.href='www.naver.com'">주문조회</td>
			</tr>
		</table>
	</div>
	
	<div class="labelName">
		<label> 베스트 100 </label>
	</div>
	<div class="labelName">
		<label> New 신상 </label>
	</div>
	<div class="labelName">
		<label> 상의 </label>
	</div>
	<div class="labelName">
		<label> 셔츠 </label>
	</div>
	<div class="labelName">
		<label> 니트 </label>
	</div>
	<div class="labelName">
		<label> 가디건 </label>
	</div>

</body>
</html>
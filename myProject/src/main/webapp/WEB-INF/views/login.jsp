<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css?after" />
</head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<form method="POST" action="${pageContext.request.contextPath }/login">
		<div id="topTitle">
			<p id="topShop">서가앤숖</p>
			<p id="topLogo">로그인</p>
		</div>
		<div class="loginData">
			<input type="text" id="loginID" name="userid" class="login" value="" placeholder="아이디를 입력해주세요">
		</div>
		<div class="loginData">
			<input type="text" id="loginPW" name="userpw" class="login" value="" placeholder="비밀번호를 입력해주세요">
		</div>
		<div class="loginData">
			<input type="submit" id="loginBT" class="login" value="로그인">
		</div>
		
		<div class="loginData">
			<label id="loginSignUp" onclick="location.href='signUp'">회원가입</label>
			<label id="loginSerchID" onclick="location.href='lostID'">아이디찾기</label>
			<label id="loginSerchPW" onclick="location.href='lostPW'">비밀번호찾기</label>
		</div>
	</form>
</body>
</html>
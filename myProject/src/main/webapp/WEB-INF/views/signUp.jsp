<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css?after" />
</head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<div id="topTitle">
		<p id="topShop">서가앤숖</p>
		<p id="topLogo">회원가입</p>
	</div>
	<form method="POST">
		<div class="loginData2">
			<input type="text" id="loginID" class="login" value="" placeholder="아이디(5~12글자)">*
		</div>
		<div class="loginData2">
			<input type="text" id="loginPW" class="login" value="" placeholder="비밀번호(숫자,영문,특수문자 최소8자)">*
		</div>
		<div class="loginData2">
			<input type="text" id="loginPW2" class="login" value="" placeholder="비밀번호확인">*
		</div>
			<div class="loginData2">
			<input type="text" id="loginName" class="login" value="" placeholder="이름">*
		</div>
			<div class="loginData2">
			<input type="text" id="loginJumin" class="login" value="" placeholder="주민번호">*
		</div>
		<div class="loginData2">
			<input type="text" id="loginEmail" class="login" value="" placeholder="이메일">*
		</div>
		<div class="loginData2">
			<input type="text" id="loginPhone" class="login" value="" placeholder="전화번호">*
		</div>
		<div class="loginData2">
			<input type="submit" id="loginBT" class="login" value="가입완료">
		</div>
	</form>
</body>
</html>
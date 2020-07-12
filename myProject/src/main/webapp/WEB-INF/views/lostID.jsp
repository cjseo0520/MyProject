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
	<div id="topTitle">
		<p id="topShop">서가앤숖</p>
		<p id="topLogo">아이디찾기</p>
	</div>
	<div class="loginData3">
		<input type="text" id="loginName" class="login" value="" placeholder="이름">
	</div>
	<div class="loginData3">
		<input type="text" id="loginJumin" class="login" value="" placeholder="주민번호">
	</div>
	<div class="loginData3">
		<input type="submit" id="loginBT" class="login" value="아이디찾기">
	</div>
</body>
</html>
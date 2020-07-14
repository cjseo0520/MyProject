<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>


<html>
<head>
<meta charset="UTF-8">
<title>서가앤숖</title>
<style>

</style>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<div style="width: 100%; height: 100%;">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
		<div class="baner">
		<p>baner</p>
		</div>
		<div class="mainBody">
			<div id="left">
				<tiles:insertAttribute name="left" />
			</div>
			<div id="main">
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>

	<script type="text/javascript">
	</script>
</body>
</html>
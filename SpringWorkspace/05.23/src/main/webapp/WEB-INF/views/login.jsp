<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/t.css" />
<title>로그인 화면입니다.</title>
</head>
<body>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;아이디&nbsp;&nbsp;<input type="text" value="" id="idInfo">
&nbsp;<input type="button" value="Login" id="loginBtn">
<br>
&nbsp;&nbsp;&nbsp;비밀번호&nbsp;<input type="text" value="" id="pwInfo">
&nbsp;<input type="button" value="회원가입" id="joinBtn">
<br>
<div id = "resultArea"></div>
</body>
<script type="text/javascript">
</script>
</html>
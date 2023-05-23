<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지입니다.</title>
</head>
<body>
<h3 align = "center">회원가입</h3>

이름 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" value = "" id = "nameInfo">
<br>
성별&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;남<input type="radio" name = "genderTag" value = "" id = "genderInfo">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;여<input type="radio" name = "genderTag" value = "" id = "genderInfo">
<br>
아이디&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" value = "" id = "idInfo">
<br>
비밀번호 <input type="text" value = "" id = "pwInfo">
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" value="회원가입" id="joinBtn">
</body>
</html>
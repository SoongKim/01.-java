<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/t.css" />
</head>
<body>
<h1>
	Hello world Nice to Meet you!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  ${test}. </P>
</body>
</html>

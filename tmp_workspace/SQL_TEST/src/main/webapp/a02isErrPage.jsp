<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	Error 발생: 장애 발생
</div>
<div>
	exception도 jsp에서는 내장객체로 가지고 있어용
	<br>
	Error name : <%=exception.getClass().getName() %>
	<br>
	Error message : <%=exception.getMessage() %>
</div>
</body>
</html>
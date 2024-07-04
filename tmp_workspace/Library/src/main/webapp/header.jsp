<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
*{
	margin: 0;
	padding: 0;
}
header, nav, footer, header>a{
color: #fff;
}
	header {
		display: flex;
		background-color: blue;
		justify-content: center;
		align-items: center; 
		height: 100px;
	}
	nav{
		display: flex;
		gap: 30px;
		height: 80px;
		align-items: center;
		background-color: #b9b9fa;
	}
</style>
<body>
	<header>
		<h2>도서대여관리 ver 1.0</h2>
	</header>
	<nav>
		<a href="register.jsp">대여도서등록</a>
		<a href="Member">회원정보관리</a>
		<a href="">보유도서관리</a>
		<a href="">도서대여현황</a>
		<a href="">홈으로</a>
	</nav>
</body>
</html>
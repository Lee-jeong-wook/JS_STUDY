<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
* {margin: 0; padding: 0; list-style:none; text-decoration: none;}

html, body {width:100%; height:100%}

header {width:100%; height: 100px; position:relative;
		background: #0000ff; color:#ffffff; 
		text-align: center; line-height: 100px;}

nav 	{width:100%; height: 50px; position:relative;
		background: lightgray; color:black; 
		line-height: 50px;	}
		
nav ul {display: flex;}

nav li {margin:0px 3.5%; line-height: 50px;}
			 
section { width: 100%; height: calc(100% - 200px); }

footer {width:100%; height: 50px;
		background: #0000ff; color:#ffffff; 
		text-align: center; line-height: 50px;}
</style>
<body>
	<nav>
		<ul>
			<li><a href="Register">회원등록</a></li>
			<li><a href="GetMember">회원목록조회</a></li>
			<li><a href="Money">회원매출조회</a></li>
			<li><a href="NewFile.jsp">홈으로</a></li>
		</ul>
	</nav>
</body>
</html>
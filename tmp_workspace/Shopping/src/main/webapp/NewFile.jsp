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
	<header>
		<h1>쇼핑몰 회원관리 ver1.0</h1>
	</header>
	<%@include file="nav.jsp" %>
	<section>
	<h3>쇼핑몰 회원관리 프로그램</h3>
	<p>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.</p>
	<p>프로그램 작성 순서</p>
	<p>1. 회원정보 테이블을 생성한다.<br>
	2. 매출정보 테이블을 생성한다.<br>
	3. 회원정보, 매출정보 테이블에 제시된 문제지와 참조데이터를 추가 생성합니다.<br>
	4. 회원정보 입력 화면프로그램을 작성한다.<br>
	5. 회원정보 조회 프로그램을 작성한다.<br>
	6. 회원매출정보 조회 프로그램을 작성한다.</p>
	</section>
	<footer>
	<p>HRDKorea copyright &copy; 2016 All right reserved. Human Resources Development Service of Korea</p>
	</footer>
</body>
</html>
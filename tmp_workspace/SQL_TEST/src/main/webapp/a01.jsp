<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	//스크릿트릿
	int total = 0; 
	for(int i = 1; i <= 10; i++){
		total += i;
	}
%>
<p>1부터 10까지 더하면 <%=total %></p>
<%
	//jsp는 PrintWrite에 해당하는 out 객페를 내장하고 있음
	out.print(total);
%>
<%-- 여기는 jsp의 주석입니다 소스 표시 x --%>
<!-- html의 주석입니다 소스 표시-->
<%!
	//jsp에서 메소드를 선언하는 경우 선언문 영역에서 선언을 하고 사용햐야 함
	// 선언영역은 <%!로 시작함
	String name = "홍길동";
	public String getName(String name){
	return "hello" + name;
}
%>
<h3><%=getName(name) %></h3>
<%
	Date today = Date.valueOf("2024-04-01");
%>
<%= today %>
</body>
</html>
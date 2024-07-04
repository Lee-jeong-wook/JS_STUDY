<%@page import="vo.MemberMoneyVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<MemberMoneyVO> list = (ArrayList<MemberMoneyVO>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	body > div{
		width: 100%;
		display: flex;
		justify-content: center;
	}
	table{
	width: 90%
	}
	th{
		border-size: border-box;
		border: 1px solid black
	}
</style>
<body>
<%@include file="header.jsp" %>
<%@include file="nav.jsp" %>
<div align="center">
	<table>
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>고객등급</th>
			<th>매출</th>
		</tr>
		<%
		System.out.println(list.get(0));
			for(MemberMoneyVO vo : list){
			%>
		<tr>
			<th><a href="member.jsp?custo=<%=vo.getCusto() %>"><%=vo.getCusto()%></a></th>
			<th><%=vo.getCustname()%></th>
			<th><%=vo.getAmount()%></th>
			<th><%=vo.getGrade()%></th>
		</tr>
		<%	}
		%>
	</table>
</div>
</body>
</html>
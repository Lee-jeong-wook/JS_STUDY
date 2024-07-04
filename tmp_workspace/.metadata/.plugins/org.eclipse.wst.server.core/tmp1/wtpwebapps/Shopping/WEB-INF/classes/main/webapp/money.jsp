<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="dbConnection.jsp" %>
<%
	String sql = "select mem.custo, custname, decode(grade, 'A', 'VIP', 'B', '일반', 'C', '직원')grade, sum(price) sumofprice " + 
	"from money_tb1_02 mon, member_tb1_02 mem " + 
	"where mon.custo = mem.custo " +
	"group by mem.custo, mem.custname, grade order by 4 desc";
	stmt = conn.prepareStatement(sql);
	
	rs = stmt.executeQuery();
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
			while(rs.next()){ %>
		<tr>
			<th><%=rs.getString("custo")%></th>
			<th><%=rs.getString("custname")%></th>
			<th><%=rs.getString("grade")%></th>
			<th><%=rs.getString("sumofprice")%></th>
		</tr>
		<%	}
		%>
	</table>
</div>
</body>
</html>
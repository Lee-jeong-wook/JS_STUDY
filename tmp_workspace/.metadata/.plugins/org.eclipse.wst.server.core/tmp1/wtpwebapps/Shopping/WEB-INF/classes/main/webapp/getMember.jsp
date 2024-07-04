<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="dbConnection.jsp" %>
<%
	String sql = "select * from member_tb1_02";
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
			<th>전화번호</th>
			<th>주소</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>거주지역</th>
		</tr>
		<%
			while(rs.next()){ %>
		<tr>
			<th><a href="member.jsp?custo=<%=rs.getString("custo")%>"><%=rs.getString("custo")%></a></th>
			<th><%=rs.getString("custname")%></th>
			<th><%=rs.getString("phone")%></th>
			<th><%=rs.getString("address")%></th>
			<th><%=rs.getString("joindate").substring(0, 10)%></th>
			<%
				String grade = rs.getString("grade");
				String sGrade = "";
				switch(grade){
				case "A":
					sGrade = "VIP";
					break;
				case "B":
					System.out.println("grade is " + grade);
					sGrade = "일반";
					break;
				case "C":
					sGrade = "직원";
					break;
				}
			%>
			<th><%=sGrade%></th>
			<th><%=rs.getString("city")%></th>
		</tr>
		<%	}
		%>
	</table>
</div>
</body>
</html>
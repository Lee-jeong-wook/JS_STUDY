<%@page import="vo.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<MemberVO> list = (ArrayList<MemberVO>)request.getAttribute("list");
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
			for(int i = 0; i < list.size(); i++){
				MemberVO vo = list.get(i);
				%>
		<tr>
			<th><a href="member.jsp?custo=<%=vo.getCusto() %>"><%=vo.getCusto()%></a></th>
			<th><%=vo.getCustname()%></th>
			<th><%=vo.getPhone()%></th>
			<th><%=vo.getAddress()%></th>
			<th><%=vo.getJoindate()%></th>
			<%
				String grade = vo.getGrade();
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
			<th><%=vo.getCity()%></th>
		</tr>
		<%	}
		%>
	</table>
</div>
</body>
</html>
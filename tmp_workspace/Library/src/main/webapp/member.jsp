<%@page import="vo.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file = "header.jsp" %>
<%
	ArrayList<MemberVO> list = (ArrayList<MemberVO>)request.getAttribute("list");
%>
<form action="Register">
	<table>
		<tr>
			<td>
				회원등록
			</td>
		</tr>
		<tr>
			<td></td>
			<td>회원번호</td>
			<td>회원성명</td>
			<td>핸드폰번호</td>
			<td>주소</td>
			<td>가입일자</td>
			<td>상태구분</td>
		</tr>
		<%
			for(int i = 0; i < list.size(); i++){
				%>
		<tr>
			<th><%=i + 1 %></th>
			<th> <a href=Detail?cust_no=<%=list.get(i).getCust_no()%> %>><%=list.get(i).getCust_no()%></a></th>
			<th><%=list.get(i).getCust_name()%></th>
			<th><%=list.get(i).getPhone()%></th>
			<th><%=list.get(i).getAddress()%></th>
			<th><%=list.get(i).getJoindate()%></th>
			<th><%=list.get(i).getJoindate()%></th>
			<%
				if(list.get(i).getStat_fg().equals("0")){
			%>
			<th>정상</th>
			<%
				}else if(list.get(i).getStat_fg().equals("1")) {
			%>
			<th>휴면</th>
						<%
				}else {
					%>
				<th>탈퇴</th>
		</tr>
		<%	}
				}
		%>
	</table>
</form>
</body>
</html>
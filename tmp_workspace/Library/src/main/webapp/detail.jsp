<%@page import="vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%MemberVO vo = (MemberVO)request.getAttribute("vo"); 
	System.out.println(vo.getStat_fg());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp"%>
<form action="DetailCtrl">
	<table>
		<tr>
			<td>회원번호</td>
			<td><input name="cust_no" readonly="readonly" value=<%=vo.getCust_no() %>></td>
		</tr>
		<tr>
			<td>회원성명</td>
			<td><input name="cust_name" value=<%=vo.getCust_name() %>></td>
		</tr>
		<tr>
			<td>핸드폰번호</td>
			<td><input name="phone" value=<%=vo.getPhone() %>></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input name="address" value=<%=vo.getAddress() %>></td>
		</tr>
		<tr>
			<td>가입일자</td>
			<td><input name="join_date" disabled="disabled" value=<%=vo.getJoindate() %>></td>
		</tr>
		<tr>
			<td>상태구분</td>
			<td>
				<select name="stat_fg">
				<%switch(vo.getStat_fg()){ 
					case "0" :
				%>
				
					<option value="0" selected>정상</option>
					<option value="1">휴면</option>
					<option value="2">탈퇴</option>
				<% 	break;
					case "1" :
				%>
					<option value="0">정상</option>
					<option value="1" selected>휴면</option>
					<option value="2">탈퇴</option>
				<% 	break;
					case "2" :
				%>
					<option value="0">정상</option>
					<option value="1">휴면</option>
					<option value="2" selected>탈퇴</option>
				<%
					break;
				} %>
				</select>
			</td>
		</tr>
		<tr>
			<td></td>
			<td><button>등록</button><button>조회</button></td>
		</tr>
	</table>
</form>
<%@include file="footer.jsp"%>
</body>
</html>
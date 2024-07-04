<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="dbConnection.jsp" %>
<%
	String custo = request.getParameter("custo");
	String sql = "select * from member_tb1_02 where custo = ?";
	stmt = conn.prepareStatement(sql);
	stmt.setString(1, custo);
	
	rs =stmt.executeQuery();
	System.out.println(custo);
	
	//String custo = "";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	const phoneReg = /^(0)\d{1,2}-\d{3,4}-\d{4}$/;
	function validate(){
		if(form.custname.value===""){
			alert("회원 성명 입력하지 않음");
			form.custname.focus();
			return false;
		}
		
		if(form.phone.value===""){
			alert("전화번호 입력");
			return false;
		}else{
			console.log(phoneReg.test(form.phone.value));
			if(!phoneReg.test(form.phone.value)){
				alert("전화번호 형식");
				form.phone.focus();
				return false;
			}
		}
		
		if(form.address.value===""){
			alert("회원 주소 입력하지 않음");
			form.address.focus();
			return false;
		}
		
		if(form.joindate.value===""){
			alert("회원 날짜 입력하지 않음");
			form.address.focus();
			return false;
		}
		
		if(form.grade.value===""){
			alert("회원 등급 입력하지 않음");
			form.address.focus();
			return false;
		} else{
			if(!(form.grade.value==="A"||form.grade.value==="B"||form.grade.value==="C")){
				alert("고객등급 확인");
				form.grade.focus();
				return false;
			}
		}
		return true;
	}
</script>
<body>
<%@include file="header.jsp"%>
<%@include file="nav.jsp"%>
<div align="center">
<h1>홈쇼핑 회원 정보</h1>
<%	if(rs.next()){
 %>
<form name="form" action="action.jsp" method="post" onsubmit="return validate()">
<input type="hidden" name = "action" value ="member">
	<table>
		<tr>
			<td>회원번호(자동발생)</td>
			<td><input type="text" name="custo" value="<%=rs.getString("custo") %>"></td>
		</tr>
		<tr>
			<td>회원성명</td>
			<td><input type="text" name="custname" value="<%=rs.getString("custname") %>"/></td>
		</tr>
		<tr>
			<td>회원전화</td>
			<td><input type="text" name="phone" value="<%=rs.getString("phone") %>"/></td>
		</tr>
		<tr>
			<td>회원주소</td>
			<td><input type="text" name="address" value="<%=rs.getString("address") %>"/></td>
		</tr>
		<tr>
			<td>가입일자</td>
			<td><input type="date" name="joindate" value="<%=rs.getDate("joindate") %>"/></td>
		</tr>
		<tr>
			<td>고객등급(A:VIP,B:일반,C:직원)</td>
			<td><input type="text" name="grade" value="<%=rs.getString("grade") %>"/></td>
		</tr>
		<tr>
			<td>도시코드</td>
			<td><input type="text" name="city" value="<%=rs.getString("city") %>"/></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="수정"/><input type="button" value="조회" onclick="location.href='getMember.jsp'"/></td>
		</tr>
	</table>
</form>
<%} %>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="dbConnection.jsp" %>
<%
	String action = request.getParameter("action");
	String move_url = "";
	String msg = "";
	switch(action){
	case "register":
		String sql = "insert into member_tb1_02 values((select max(custo) + 1 from member_tb1_02),?,?,?,?,?,?)";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, request.getParameter("custname"));
		stmt.setString(2, request.getParameter("phone"));
		stmt.setString(3, request.getParameter("address"));
		stmt.setString(4, request.getParameter("joindate"));
		stmt.setString(5, request.getParameter("grade"));
		stmt.setString(6, request.getParameter("city"));
		if(stmt.executeUpdate()>0){
			msg = "성공적 저장";
		}else{
			msg="오류 발생";
		}
		move_url = "regist.jsp";
		break;
	case "member":
		String memberSql = "update member_tb1_02 set custname = ?, phone = ?, address = ?, joindate = ?, grade = ?, city = ? where custo = ?";
		stmt = conn.prepareStatement(memberSql);
		stmt.setString(1, request.getParameter("custname"));
		stmt.setString(2, request.getParameter("phone"));
		stmt.setString(3, request.getParameter("address"));
		stmt.setString(4, request.getParameter("joindate"));
		stmt.setString(5, request.getParameter("grade"));
		stmt.setString(6, request.getParameter("city"));
		stmt.setString(7, request.getParameter("custo"));
		if(stmt.executeUpdate()>0){
			msg = "성공적 저장";
		}else{
			msg="오류 발생";
		}
		move_url = "getMember.jsp";
	}
%>
<script type="text/javascript">
alert("<%=msg%>");
location.replace("<%=move_url%>");
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
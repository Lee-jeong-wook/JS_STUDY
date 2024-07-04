<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	if(session.getAttribute("ID") == null){
		response.sendRedirect("login.jsp");
	}
//화면
	int seq = Integer.parseInt(request.getParameter("seq"));
	Class.forName("oracle.jdbc.OracleDriver");
	//2. 연결설정
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "hr", "1234");
	//3. 질의문 준비
	String sql = "update board board set cnt = cnt + 1 where seq = ?";
	PreparedStatement stmt = conn.prepareStatement(sql);
	stmt.setInt(1, seq);
	if(stmt.executeUpdate() > 0)
		stmt.close();
	else
		response.sendRedirect("getBoardList.jsp");
	sql = "select * from board where seq = ?";
	stmt = conn.prepareStatement(sql);
	stmt.setInt(1, seq);
	ResultSet rs = stmt.executeQuery();
	if(rs.next()){
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://unpkg.com/bootstrap@3.3.7/dist/css/bootstrap.min.css">
<title>글 상세</title>
</head>

<body>
	<div align="center" style="margin: auto auto">
		<h3>글 상세</h3>
		<h3><%= session.getAttribute("name") %>님 로그인 환영합니다...... 
			<a href="logoutCtrl.jsp">Log-out</a>
		</h3>
		<hr>
		<form action="updateBoard.jsp" method="post">
			<input name="seq" type="hidden" value="<%= rs.getString("seq") %>""/>
			<table class="table" style="width: 800px">
				<tr>
					<td>제목</td>
					<td align="left">
						<input name="title" type="text" value="<%= rs.getString("title") %>" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>작성자</td>
					<td align="left"><%= rs.getString("nickname") %></td>
				</tr>
				<tr>
					<td>내용</td>
					<td align="left">
						<textarea name="content" cols="40" rows="10" class="form-control"><%= rs.getString("content") %></textarea>
					</td>
				</tr>
				<tr>
					<td>등록일</td>
					<td align="left"><%= rs.getString("regdate") %></td>
				</tr>
				<tr>
					<td>조회수</td>
					<td align="left"><%= rs.getInt("cnt") %></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글 수정" class="btn btn-primary"/>
					</td>
				</tr>
			</table>
		</form>
		<%} %>
		<hr>
		<a href="addBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteBoard.jsp">글삭제</a>&nbsp;&nbsp;&nbsp; 
		<a href="getBoardList.jsp">글목록</a>
	</div>
</body>
</html>











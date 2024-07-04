<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//request 인코딩
	request.setCharacterEncoding("UTF-8");
	if(session.getAttribute("ID") == null){
		response.sendRedirect("login.jsp");
	}
	//화면의 검색 조건을 가져오기
	String searchCondition = request.getParameter("searchCondition");
	String searchKeyword = request.getParameter("searchKeyword");
	
	//만약에 처음 화면으로 들어오는 경우에는 사람이 검색조건을 입력하지 않으므로 빈문자가 넘어옴
	if(searchCondition == null)
		searchCondition = "TITLE";
	//1. 드라이버 로드
	Class.forName("oracle.jdbc.OracleDriver");
	//2. 연결설정
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "hr", "1234");
	//3. 질의문 준비
	String sql = "select * from board ";
	if(searchCondition.equals("TITLE")){
		sql += "where title like '%'||?||'%'"; //물음표가 ''에 있으면 문자에 해당하고 sql 세팅을 하시 위한 ?가 되지 않는다
	} else{
		sql = "where content like '%'||?||'%'"; 
	}
	PreparedStatement stmt = conn.prepareStatement(sql);
	
	stmt.setString(1, searchKeyword);
	ResultSet rs = stmt.executeQuery();
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://unpkg.com/bootstrap@3.3.7/dist/css/bootstrap.min.css">
<title>글 목록</title>
</head>

<body>
	<div align="center" style="margin: auto auto">
		<h1>글 목록</h1>
		<h3>
			<%=session.getAttribute("name") %>님 환영합니다...... <a href="logoutCtrl.jsp">Log-out</a>
		</h3>

		<!-- 검색 시작 -->
		<form method="post">
			<table class="table" style="width: 800px">
				<tr>
					<td align="right">
					<select name="searchCondition">
							<option value="TITLE">제목
							<option value="CONTENT">내용
					</select>
					<input name="searchKeyword" type="text" />
					<input type="submit" value="검색" /></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->

		<table class="table" style="width: 800px">
			<tr>
				<th width="100">번호</th>
				<th width="200">제목</th>
				<th width="150">작성자</th>
				<th width="150">등록일</th>
				<th width="100">조회수</th>
			</tr>
			<% 
			while(rs.next()){ 
			%>
			<tr>
				<td> <a href="getBoard.jsp?seq=<%= rs.getString("seq") %>"><%= rs.getString("seq") %></a></td>
				<td> <%= rs.getString("title") %></td>
				<td> <%= rs.getString("nickname") %></td>
				<td> <%= rs.getDate("regdate") %></td>
				<td> <%= rs.getString("cnt") %></td>
			</tr>
			<%} 
			%>
		</table>
		<br> <a href="addBoard.jsp">새글 등록</a>
	</div>
</body>
</html>




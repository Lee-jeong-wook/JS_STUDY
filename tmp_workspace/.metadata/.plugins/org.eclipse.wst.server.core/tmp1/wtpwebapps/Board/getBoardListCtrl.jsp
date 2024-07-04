<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
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
<title>Insert title here</title>
</head>
<body>

</body>
</html>
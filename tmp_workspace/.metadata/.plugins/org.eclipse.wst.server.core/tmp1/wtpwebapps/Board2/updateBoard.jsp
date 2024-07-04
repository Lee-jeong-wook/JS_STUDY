<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	//getBoard에서 입력한 제목, 내용을 수정하기
	//key가 필요하다
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String seq = request.getParameter("seq");
	
	//1. 드라이버 로드
	Class.forName("oracle.jdbc.OracleDriver");
	//2. 연결설정
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "hr", "1234");
	//3. 질의문 준비
	String sql = "update board set title=?, content=? where seq=?";
	PreparedStatement stmt = conn.prepareStatement(sql);
	//4. 질의문 세팅
	stmt.setString(1, title);
	stmt.setString(2, content);
	stmt.setInt(3, Integer.parseInt(seq));
	//5, 질의문 실행
	if(stmt.executeUpdate() > 0){
		response.sendRedirect("getBoardList.jsp");
	}
	stmt.close();
	conn.close();
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
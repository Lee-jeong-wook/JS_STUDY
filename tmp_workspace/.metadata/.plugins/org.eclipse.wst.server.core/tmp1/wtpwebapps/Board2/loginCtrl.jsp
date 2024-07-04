<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 클라이언트가 request에다 요청을 한다
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	//db에서 id와 password를 이용해서 데이터 가져오기
	//1. 드라이버 로드
	Class.forName("oracle.jdbc.OracleDriver");
	//2. 연결설정
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Connection conn = DriverManager.getConnection(url, "hr", "1234");
	//3. 질의문 준비
	String sql = "select * from users where id = ? and password = ?";
	PreparedStatement stmt = conn.prepareStatement(sql);
	//4. 질의문 세팅
	stmt.setString(1, id);
	stmt.setString(2, password);
	//5, 질의문 실행
	ResultSet rs = stmt.executeQuery();
	if(rs.next()){
		//세션에 저장
		//이런 시나리오는 기획단계에서 기획되어야함
		String name = rs.getString("name");
		session.setAttribute("ID", id);
		session.setAttribute("name", name);
		
		response.sendRedirect("getBoardList.jsp");
	} else{
		response.sendRedirect("login.jsp");
	}
	//6. 질의문 닫기
	rs.close();
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
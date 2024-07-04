package kr.hs.sdh.dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class loginCtrl
 */
public class loginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//화면에 입력한 id와 패스워드 받앙ㅎ기
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 받아온 id와 pw가 db에 있는지 확인
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		HttpSession session = request.getSession();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "1234");
			
			String sql = "select id, name from users where id = ? and password = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, password);
			
			rs = stmt.executeQuery();
			if(rs.next()) {
				session.setAttribute("id", rs.getString("id"));
				session.setAttribute("name", rs.getString("name"));
			}
			response.sendRedirect("GetBoardListCtrl");
			//로그인 성공 이후 화면을 getBoardList 전환
		} catch (Exception e) {
			e.printStackTrace();
		}
		// id와 pw가 있으면 화면을 getBoardList로 열기
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

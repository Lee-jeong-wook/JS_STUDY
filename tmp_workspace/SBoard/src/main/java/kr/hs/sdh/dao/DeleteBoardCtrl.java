package kr.hs.sdh.dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class DeleteBoardCtrl
 */
public class DeleteBoardCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBoardCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String seq = request.getParameter("seq");
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2. 연결설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "1234");
			//3. 질의문 준비
			String sql = "delete from board where seq=?";
			stmt = conn.prepareStatement(sql);
			//4. 질의문 세팅
			stmt.setString(1, seq);
			//5, 질의문 실행
			System.out.println("안뇽안뇽 삭제양 삭제");
			if(stmt.executeUpdate() > 0){
				response.sendRedirect("GetBoardListCtrl");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

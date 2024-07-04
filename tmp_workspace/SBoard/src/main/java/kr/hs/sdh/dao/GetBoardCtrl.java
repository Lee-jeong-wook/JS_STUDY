package kr.hs.sdh.dao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.hs.sdh.vo.BoardVO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class GetBoardCtrl
 */
public class GetBoardCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetBoardCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = (String) request.getSession().getAttribute("id");
		if(id == null)
			response.sendRedirect("login.jsp");
		String seq = request.getParameter("seq");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		System.out.println("서버 getBoard");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "hr", "1234");
			String sql = "update board set cnt = cnt + 1 where seq = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, seq);
			if(stmt.executeUpdate() <= 0) {
				response.sendRedirect("GetBoardListCtrl");
			}
			stmt.close();
			sql = "select * from board where seq = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, seq);
			rs = stmt.executeQuery();
			if(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setSeq(rs.getString("seq"));
				vo.setNickname(rs.getString("nickname"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setRegdate(rs.getDate("regdate"));
				vo.setCnt(rs.getInt("cnt"));
				
				request.setAttribute("vo", vo);
				RequestDispatcher view = request.getRequestDispatcher("getBoard.jsp");
				view.forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
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

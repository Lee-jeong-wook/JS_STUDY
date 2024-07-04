package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.apache.catalina.connector.Response;

import jakarta.servlet.RequestDispatcher;
import util.DBConnection;
import vo.BoardVO;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	public ArrayList<BoardVO> getBoardList(String searchConditon, String searchKeyword){
		ArrayList<BoardVO> list = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "";
			if(searchConditon.equals("TITLE")) {
				sql = ("select * from board where title like '%' || ? || '%'");
			} else {
				sql = ("select * from board where content like '%' || ? || '%'");
			}
			sql += " order by seq desc";
			System.out.println(sql);
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, searchKeyword);
			rs = stmt.executeQuery();
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setTitle(rs.getString("title"));
				vo.setNickname(rs.getString("nickname"));
				vo.setSeq(rs.getString("seq"));
				vo.setContent(rs.getString("content"));
				vo.setRegDate(rs.getDate("regdate"));
				vo.setCnt(rs.getInt("cnt"));
				vo.setUserid(rs.getString("userid"));
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
		conn= DBConnection.getConnection();
		String sql = "update board set title = ?, content = ? where seq = ?";
		stmt.setString(1, vo.getTitle());
		stmt.setString(2, vo.getContent());
		stmt.setString(3, vo.getSeq());
		result = stmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}
		
	}
	public BoardVO getOneBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		try {
		String sql = "update board set cnt = cnt + 1 where seq = ?";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, vo.getSeq());
		stmt.close();
		sql = "select * from board where seq = ?";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, vo.getSeq());
		rs = stmt.executeQuery();
		if(rs.next()) {
			BoardVO result = new BoardVO();
			result.setSeq(rs.getString("seq"));
			result.setNickname(rs.getString("nickname"));
			result.setTitle(rs.getString("title"));
			result.setContent(rs.getString("content"));
			result.setRegDate(rs.getDate("regdate"));
			result.setCnt(rs.getInt("cnt"));
		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}

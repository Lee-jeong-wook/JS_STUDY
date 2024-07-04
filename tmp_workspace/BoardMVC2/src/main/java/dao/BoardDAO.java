package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}

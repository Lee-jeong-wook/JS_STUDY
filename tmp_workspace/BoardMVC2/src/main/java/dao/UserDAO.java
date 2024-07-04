package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.DBConnection;
import vo.UsersVO;

public class UserDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	public UsersVO getUser(String id, String password) {
		UsersVO vo = new UsersVO();
		try {
			conn = DBConnection.getConnection();
			String sql = "select * from users where id = ? and password = ?";
			stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, id);
			stmt.setString(2, password);
			
			stmt.executeQuery();
			if(rs.next()) {
				vo = new UsersVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setRole(rs.getString("role"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, stmt, conn);
		}
		return vo;
	}
}

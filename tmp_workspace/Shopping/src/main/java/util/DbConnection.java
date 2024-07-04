package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnection {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn= DriverManager.getConnection(url, "hr", "1234");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void close(PreparedStatement stmt, Connection conn) {
		try {
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

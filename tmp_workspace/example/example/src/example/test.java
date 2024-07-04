package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "hr", "1234");
		String sql = "";
		PreparedStatement stmt = conn.preparedStatement(sql);
		ResultSet rs = stmt.sxecuteQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getString(2));
		}
		rs.close();
		stmt.close();
		conn.close();
		
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DbConnection;
import vo.ReturnVO;

public class RentDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;

	public int register(ReturnVO vo) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			conn = DbConnection.getConnection();
			String sql = "insert into return_tbl_001 values(sysdate, (select to_char(nvl (max (rent_no), 0) + 1, 'fm0000') from return_tbl_001), ?, ?, sysdate + 7, ?, ?)";
//			stmt.setDate(1, vo.getReturn_ymd());
//			stmt.setString(1, vo.getRent_no());
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getRent_book());
			stmt.setInt(2, vo.getRent_rent());
//			stmt.setDate(4,  vo.getClose_ymd());
			stmt.setDate(3, vo.getReturn_ymd());
			stmt.setString(4, vo.getReturn_fg());
			
			result = stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return result;
		}
		
	}

}

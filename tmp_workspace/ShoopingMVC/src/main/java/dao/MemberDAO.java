package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DbConnection;
import vo.MemberVO;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	public int getCusto() {
		int custo = 0;
		try {
			conn = DbConnection.getConnection();
			String sql = "select nvl(max(custo), 10000)+1 from money_tb1_02";
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			if(rs.next()) {
				custo = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnection.close(rs, stmt, conn);
		}
		return custo;
	}
	public int insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			conn = DbConnection.getConnection();
			String sql = "insert into member_tb1_02 values((select nvl(max(custo), 100000) + 1 from member_tb1_02),?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getCustname());
			stmt.setString(2, vo.getPhone());
			stmt.setString(3, vo.getAddress());
			stmt.setDate(4, vo.getJoindate());
			stmt.setString(5, vo.getGrade());
			stmt.setString(6, vo.getCity());
			result = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnection.close(stmt, conn);
		}
		return result;
		
	}
	public ArrayList<MemberVO> getMemberList(){
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		try {
			conn = DbConnection.getConnection();
			String sql = "select * from member_tb1_02 order by custo";
			stmt = conn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setCusto(rs.getInt("custo"));
				vo.setCustname(rs.getString("custname"));
				vo.setAddress(rs.getString("address"));
				vo.setCity(rs.getString("city"));
				vo.setGrade(rs.getString("grade"));
				vo.setJoindate(rs.getDate("joindate"));
				vo.setPhone(rs.getString("phone"));
				
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DbConnection.close(rs, stmt, conn);
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
		}
		return list;
	}
	public MemberVO getMember(int custo) {
		MemberVO vo = new MemberVO();
		try {
			conn = DbConnection.getConnection();
			String sql = "select * from member_tb1_02 where custo = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, custo);
			
			rs =stmt.executeQuery();
			
			vo.setCusto(rs.getInt("custo"));
			vo.setCustname(rs.getString("custname"));
			vo.setPhone(rs.getString("phone"));
			vo.setAddress(rs.getString("address"));
			vo.setGrade(rs.getString("grade"));
			vo.setCity(rs.getString("city"));
			vo.setJoindate(rs.getDate("joindate"));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DbConnection.close(rs, stmt, conn);
			} catch (Exception e2) {
				e2.setStackTrace(null);
			}
		}
		return vo;
	}
}

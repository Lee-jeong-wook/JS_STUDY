package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DbConnection;
import vo.MemberVO;

public class MemberDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement stmt = null;

	public ArrayList<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		ArrayList<MemberVO> result = new ArrayList<MemberVO>();
		try {
			conn = DbConnection.getConnection();
			String sql = "select * from member_tbl_001";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			System.out.println("work");
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setCust_no(rs.getInt("cust_no"));
				vo.setCust_name(rs.getString("cust_name"));
				vo.setAddress(rs.getString("address"));
				vo.setJoindate(rs.getDate("join_date"));
				vo.setPhone(rs.getString("phone"));
				vo.setStat_fg(rs.getString("stat_fg"));
				System.out.println(rs.getInt("cust_no"));
				
				result.add(vo);
			}
			
		} catch (Exception e) {
			DbConnection.close(rs, stmt, conn);
		}
		return result;
	}

	public MemberVO getMember(int cust_no) {
		// TODO Auto-generated method stub
		MemberVO vo = new MemberVO();
		try {
			conn = DbConnection.getConnection();
			String sql = "select * from member_tbl_001 where cust_no = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, cust_no);
			rs = stmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt("cust_no"));
				vo.setCust_no(rs.getInt("cust_no"));
				vo.setCust_name(rs.getString("cust_name"));
				vo.setAddress(rs.getString("address"));
				vo.setJoindate(rs.getDate("join_date"));
				vo.setPhone(rs.getString("phone"));
				vo.setStat_fg(rs.getString("stat_fg"));	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	public int update(MemberVO vo) {
		// TODO Auto-generated method stub
		int result = 0;
		try {
			conn = DbConnection.getConnection();
			String sql = "update member_tbl_001 set cust_name = ?, phone = ?, address = ?, stat_fg = ? where cust_no = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getCust_name());
			stmt.setString(2, vo.getPhone());
			stmt.setString(3, vo.getAddress());
			stmt.setString(4, vo.getStat_fg());
			stmt.setInt(5, vo.getCust_no());
			result = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbConnection.close(stmt, conn);
		}
		return result;
	}
	public int insertMember(MemberVO vo) {
		int result = 0;
		try {
			conn = DbConnection.getConnection();
			String sql = "insert into member_tbl_001 values((select nvl(max(cust_no) from member_tbl_001), 100000)+1, ?, ?, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getCust_name());
			stmt.setString(2, vo.getPhone());
			stmt.setString(3, vo.getAddress());
			stmt.setDate(4, vo.getJoindate());
			stmt.setString(5, vo.getStat_fg());
			System.out.println(vo.getCust_name());
			
			result = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public MemberVO getDefault() {
		MemberVO vo = new MemberVO();
		try {
			conn = DbConnection.getConnection();
			String sql  = "select nvl(max(cust_no), 100000) + 1 as cust_no, sysdate as join_date from member_tbl_001";
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				vo.setCust_no(rs.getInt("cust_no"));
				vo.setJoindate(rs.getDate("join_date"));
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return vo;
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.DbConnection;
import vo.MemberMoneyVO;
import vo.MemberVO;
import vo.MoneyVO;

public class MoneyDAO {
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	public ArrayList<MemberMoneyVO> getMoneyList() {
		ArrayList<MemberMoneyVO> list = new ArrayList<MemberMoneyVO>();
		try {
			conn = DbConnection.getConnection();
			String sql = "";
			 sql = "select mem.custo, custname, decode(grade, 'A', 'VIP', 'B', '일반', 'C', '직원')grade, sum(price) amount " + 
						"from money_tb1_02 mon, member_tb1_02 mem " + 
						"where mon.custo = mem.custo " +
						"group by mem.custo, mem.custname, grade order by 4 desc";
				stmt = conn.prepareStatement(sql);
				
				rs = stmt.executeQuery();
				
				while(rs.next()) {
					MemberMoneyVO vo = new MemberMoneyVO();
					vo.setCusto(rs.getInt("custo"));
					vo.setCustname(rs.getString("custname"));
					vo.setGrade(rs.getString("grade"));
					vo.setAmount(rs.getInt("amount"));
					
					System.out.println(rs.getString("custname"));

					list.add(vo);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		// TODO Auto-generated method stub
		
	}
}

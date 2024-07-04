import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// DB 명령어는 예외 가능성 대비 try catch 문 안에 넣거나 throws Exception
			
			// 1, 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			// 2, 연결 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(url, "hr", "1234");
			// 3. 질의문 준비
			String sql = "update employees set first_name = ? where employee_id = 207";
			PreparedStatement stmt = conn.prepareStatement(sql);
			// 4, 질의문 세팅
			
			Scanner sc = new Scanner(System.in);
			System.out.println("이름은?");
			String name = sc.next();
			stmt.setString(1, name);
			// 조회조건이 있는 경우 여기서 세팅
			// 5. 질ㅁ의문 실행
//			ResultSet rs = stmt.executeQuery();
			if(stmt.executeUpdate() < 1) {
				System.out.println("오류");
			} else {
				System.out.println("성공");
			}
			System.out.println("HI");
			sc.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseDao {
	
	// DB 정보
	private String host = "jdbc:mysql://127.0.0.1:3306/studydb";
	private String user = "wldnd9895";
	private String pass = "1234";
	
	public void insert() {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			// PreparedStatement(미리 준비가 완료된 SQL을 사용하는 실행객체)
			// ? : 쿼리 파라미터 사용
			String sql = "INSERT INTO user1 VALUES (?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2026/05/15
 * 이름 : 양지웅
 * 내용 : 12장 JDBC CRUD 실습
 * */

public class DeleteTest {

	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "wldnd9895";
		String pass = "1234";
		
		try {
			// 1) DB 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2) SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// 3) SQL 실행
			String sql = "DELETE FROM user1 WHERE userid='j101'";
			stmt.executeUpdate(sql);	//  Insert, Update, Delete 쿼리만 사용
			
			// 4) SQL 결과 처리 (SELECT 작업일 경우)
			// 5) DB 연결해제
			stmt.close();
			conn.close();
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("DELETE 완료");

	}

}

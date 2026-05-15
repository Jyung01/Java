package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class User1DAO {
	
	// DB 정보
	private static String host = "jdbc:mysql://127.0.0.1:3306/studydb";
	private static String user = "wldnd9895";
	private static String pass = "1234";
	
	public static void insert(User1DTO dto) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			// PreparedStatement(미리 준비가 완료된 SQL을 사용하는 실행객체)
			// ? : 쿼리 파라미터 사용
			String sql = "INSERT INTO user1 VALUES (?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 데이터 매핑(사상)
			psmt.setString(1, dto.getUserid());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getHp());
			psmt.setInt(4, dto.getAge());	// 4번째 쿼리 파라미터에 숫자로 데이터 매핑
			
			// SQL 실행
			psmt.executeUpdate();
			
			// 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void update(User1DTO dto) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			// PreparedStatement(미리 준비가 완료된 SQL을 사용하는 실행객체)
			// ? : 쿼리 파라미터 사용
			String sql = "UPDATE User1 SET "
					+ "name=?,"
					+ "hp = ?,"
					+ "age = ? "
					+ "WHERE userid = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 데이터 매핑(사상)
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getHp());
			psmt.setInt(3, dto.getAge());
			psmt.setString(4, dto.getUserid());	// 4번째 쿼리 파라미터에 숫자로 데이터 매핑
			
			// SQL 실행
			psmt.executeUpdate();
			
			// 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delete(String userid) {
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			// PreparedStatement(미리 준비가 완료된 SQL을 사용하는 실행객체)
			// ? : 쿼리 파라미터 사용
			String sql = "DELETE FROM User1 WHERE userid = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 데이터 매핑(사상)
			psmt.setString(1, userid);
			
			// SQL 실행
			psmt.executeUpdate();
			
			// 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<User1DTO> select() {
		List<User1DTO> dtoList = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			// PreparedStatement(미리 준비가 완료된 SQL을 사용하는 실행객체)
			// ? : 쿼리 파라미터 사용
			String sql = "SELECT * FROM User1";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			// 쿼리 파라미터 데이터 매핑(사상) - SELECT 에서는 X
			
			// SQL 실행
			ResultSet rs = psmt.executeQuery(sql);
			
			// 결과셋 처리(DTO 리스트 생성)
			while (rs.next()) {
				
				User1DTO dto = new User1DTO();
				dto.setUserid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setAge(rs.getInt(4));
				
				dtoList.add(dto);
			}
			
			// 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dtoList;
	}
	
	public static List<User1DTO> search(String name) {
		List<User1DTO> dtoList = new ArrayList<>();
		
		try {
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			// PreparedStatement(미리 준비가 완료된 SQL을 사용하는 실행객체)
			// ? : 쿼리 파라미터 사용
			String sql = "SELECT * FROM User1 WHERE name = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			
			// 쿼리 파라미터 데이터 매핑(사상) - SELECT 에서는 X
			
			// SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			// 결과셋 처리(DTO 리스트 생성)
			while (rs.next()) {
				
				User1DTO dto = new User1DTO();
				dto.setUserid(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setHp(rs.getString(3));
				dto.setAge(rs.getInt(4));
				
				dtoList.add(dto);
			}
			
			// 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dtoList;
	}
	
	
}

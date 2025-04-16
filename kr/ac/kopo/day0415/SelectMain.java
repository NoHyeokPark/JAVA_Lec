package kr.ac.kopo.day0415;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// t_test 테이블의 id와 name을 조회
		try {
			// 1단계 : 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료...");

			// 2단계 : DB접속 Connection 객체 얻기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);

			// 3단계 : 쿼리 생성 및 실행
			String sql = "select id, name as s ";
			sql += "from t_test ";
			sql += "order by id ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			System.out.println("id" + "\t" + "name");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString("s"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

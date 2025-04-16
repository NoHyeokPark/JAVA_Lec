package kr.ac.kopo.day0415;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

// id : hong, name : 홍길동
public class InsertMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
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
			System.out.println("아이디를 입력하세요 :");
			String id = sc.nextLine();
			System.out.println("네임을 입력하세요 :");
			String name = sc.nextLine();
			/*
			 * String sql = "insert into t_test(id,name) "; sql +=
			 * " values(\'"+id+"\', \'"+name+"\') "; Statement stmt =
			 * conn.createStatement(); int cnt = stmt.executeUpdate(sql);
			 */
			String sql = "insert into t_test(id,name) ";
			sql += " values(?, ?) ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			//pstmt.setInt(0, 0);
			int cnt = pstmt.executeUpdate();

			System.out.println("총 " + cnt + " 개의 행이 삽입되었습니다");
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

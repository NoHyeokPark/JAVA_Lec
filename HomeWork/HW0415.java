package HomeWork;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class HW0415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection conn = ConnectionFactory.getConn();
		System.out.println("급여를 입력하세요 : ");
		String sal = sc.nextLine();
		int cnt = 0;
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT JOB_TITLE, AVG(SALARY) AS SAL ");
			sql.append(" FROM employees M1 " + " JOIN JOBS M2 ON M2.JOB_ID = M1.JOB_ID ");
			sql.append("WHERE SALARY >= ? ");
			sql.append("GROUP BY JOB_TITLE ");
			sql.append("ORDER BY SAL DESC ");
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, sal);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				cnt++;
				//System.out.println("[" + rs.getString(1) + "]\t" + rs.getString(2));
				System.out.printf("[%31s]\t%6s\n", rs.getString(1), rs.getString(2));
			}
			System.out.println("\t\t총 [" + cnt + "]명이 검색되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

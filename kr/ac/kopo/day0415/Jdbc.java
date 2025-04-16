package kr.ac.kopo.day0415;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("conn : " + conn);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

package kr.ac.kopo.day0415;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;

public class SqlMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = ConnectionFactory.getConn();
		
		try {
			StringBuilder sql = new StringBuilder();
			sql.append("select lower(id) id, name ");
			sql.append("from t_test ");
			sql.append("order by id ");			   
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("id : " + rs.getString(1) + "\t name : " + rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	}



package com.mystudy.jdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_PreparedStatement {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 2. DB 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "MYSTUDY", "mystudypw");

			// 3. SQL 문 준비 및 실행
			String sql = "UPDATE STUDENT SET NAME = ?, KOR = ?, ENG = ?, MATH = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);

			// 수정할 데이터 값
			String name = "수정이";
			int kor = 88;
			int eng = 77;
			int math = 66;
			String id = "S2025007";

			// 바인딩 변수 설정
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, math);
			pstmt.setString(5, id);

			// SQL 실행
			int result = pstmt.executeUpdate();
			System.out.println("::수정된 건수 : " + result);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
			}
		}
	}
}

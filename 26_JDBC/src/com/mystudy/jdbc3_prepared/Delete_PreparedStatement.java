package com.mystudy.jdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete_PreparedStatement {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 2. DB 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
												"MYSTUDY",
												"mystudypw");

			// 3. SQL 문 준비 및 실행
			String sql = "DELETE FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);

			// 삭제할 학생 ID
			String id = "2025003";

			// 바인딩 변수 설정
			pstmt.setString(1, id);

			// SQL 실행
			int result = pstmt.executeUpdate();
			System.out.println("::삭제된 건수 : " + result);

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

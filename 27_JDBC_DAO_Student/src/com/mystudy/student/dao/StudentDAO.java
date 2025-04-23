package com.mystudy.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mystudy.common.CommonJdbcUtil;
import com.mystudy.student.vo.StudentVO;

public class StudentDAO {
	public StudentDAO() {
		System.out.println(">> StudentDAO() 실행~~");
	}

	static {
		System.out.println(">> 스태틱(static) 초기화구문");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] JDBC 드라이버 로딩 실패!!!");
		}
	}

	// SELECT : 데이터 1개 조회(ID)
	public StudentVO selectOne(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentVO vo = null;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"), rs.getInt("ENG"),
						rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		return vo;
	}

	// SELECT : 전체 데이터 조회
	public List<StudentVO> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentVO> list = new ArrayList<>();

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG FROM STUDENT ORDER BY ID";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				StudentVO vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"),
						rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		return list;
	}

	// SELECT : 이름으로 조회
	public List<StudentVO> selectName(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StudentVO> list = new ArrayList<>();

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG FROM STUDENT WHERE NAME = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				StudentVO vo = new StudentVO(rs.getString("ID"), rs.getString("NAME"), rs.getInt("KOR"),
						rs.getInt("ENG"), rs.getInt("MATH"), rs.getInt("TOT"), rs.getDouble("AVG"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn, pstmt, rs);
		}
		return list;
	}

	// INSERT
	public int insert(StudentVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "INSERT INTO STUDENT (ID, NAME, KOR, ENG, MATH, TOT, AVG) VALUES (?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setInt(3, vo.getKor());
			pstmt.setInt(4, vo.getEng());
			pstmt.setInt(5, vo.getMath());
			pstmt.setInt(6, vo.getTot());
			pstmt.setDouble(7, vo.getAvg());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		return result;
	}

	// UPDATE : VO 데이터 수정
	public int update(StudentVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "UPDATE STUDENT SET KOR = ?, ENG = ?, MATH = ?, TOT = ?, AVG = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getKor());
			pstmt.setInt(2, vo.getEng());
			pstmt.setInt(3, vo.getMath());
			pstmt.setInt(4, vo.getTot());
			pstmt.setDouble(5, vo.getAvg());
			pstmt.setString(6, vo.getId());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		return result;
	}

	// UPDATE : 이름 수정
	public int updateName(String id, String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "UPDATE STUDENT SET NAME = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		return result;
	}

	// UPDATE : 국어 점수 수정
	public int updateKor(String id, int kor) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "UPDATE STUDENT SET KOR = ? WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, kor);
			pstmt.setString(2, id);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		return result;
	}

	// UPDATE : 총점, 평균 재계산 (특정 학생)
	public int updateTotAvg(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "UPDATE STUDENT SET TOT = KOR + ENG + MATH, AVG = (KOR + ENG + MATH) / 3 WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		return result;
	}

	// UPDATE : 총점, 평균 재계산 (전체 학생)
	public int updateTotAvgAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "UPDATE STUDENT SET TOT = KOR + ENG + MATH, AVG = (KOR + ENG + MATH) / 3";
			pstmt = conn.prepareStatement(sql);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		return result;
	}

	// DELETE : ID로 삭제
	public int delete(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			conn = CommonJdbcUtil.getConnection();
			String sql = "DELETE FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			result = -1;
		} finally {
			CommonJdbcUtil.close(conn, pstmt);
		}
		return result;
	}

	// DELETE : VO로 삭제
	public int delete(StudentVO vo) {
		if (vo == null || vo.getId() == null)
			return -1;
		return delete(vo.getId());
	}

	private void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
		}
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

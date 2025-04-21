package com.mystudy.list5_exam_vo;

import java.util.ArrayList;
import java.util.List;

public class StudentListManager {

	// 학생 정보를 저장하기 위한 리스트
	private List<StudentVO> studentList;

	// 기본 생성자: 빈 리스트 초기화
	public StudentListManager() {
		this.studentList = new ArrayList<>();
	}

	// 리스트를 전달받는 생성자 (현재는 사용하지 않음)
	public StudentListManager(List<StudentVO> studentList) {
		this.studentList = new ArrayList<>();
	}

	// 모든 학생 정보를 반환하는 메소드
	public List<StudentVO> selectAll() {
		return studentList;
	}

	// 주어진 학번에 해당하는 학생 정보를 반환하는 메소드
	public StudentVO select(String id) {
		// 학생 리스트를 순회하며 ID가 일치하는 학생 찾기
		for (StudentVO student : studentList) {
			if (student.getId().equals(id)) {
				return student; // 학생 찾으면 반환
			}
		}
		return null; // 학생이 없으면 null 반환
	}

	// 주어진 StudentVO 객체를 통해 학생 정보 조회
	public StudentVO select(StudentVO student) {
		return select(student.getId());
	}

	// 학생 정보를 리스트에 추가하는 메소드
	public boolean insert(StudentVO student) {
		studentList.add(student); // 학생 추가
		return true; // 성공적으로 추가됨
	}

	// 학생 정보를 업데이트하는 메소드
	public boolean update(StudentVO student) {
		// 주어진 ID로 학생 조회
		StudentVO updateStu = select(student.getId());
		if (updateStu == null)
			return false; // 학생이 없으면 수정 실패

		// 학생 점수 업데이트
		updateStu.setKor(student.getKor());
		updateStu.setEng(student.getEng());
		updateStu.setMath(student.getMath());
		updateStu.computeTotAvg(); // 총점과 평균 재계산

		return true; // 수정 성공
	}

	// 학생의 이름을 수정하는 메소드
	public boolean updateName(String id, String name) {
		// 주어진 ID로 학생 조회
		StudentVO student = select(id);
		if (student != null) {
			student.setName(name); // 이름 수정
			return true; // 수정 성공
		}
		return false; // 수정 실패
	}

	// 학생의 국어 점수를 수정하는 메소드
	public boolean updateKor(String id, int kor) {
		// 주어진 ID로 학생 조회
		StudentVO student = select(id);
		if (student == null)
			return false; // 학생이 없으면 수정 실패
		student.setKor(kor); // 국어 점수 수정
		student.computeTotAvg(); // 총점과 평균 재계산
		return true; // 수정 성공
	}

	// 학생 정보를 삭제하는 메소드 (StudentVO 객체로 삭제)
	public boolean delete(StudentVO student) {
		return delete(student.getId()); // ID로 삭제 메소드 호출
	}

	// 주어진 학번에 해당하는 학생 정보를 삭제하는 메소드
	public boolean delete(String id) {
		// 주어진 ID로 학생 조회
		StudentVO student = select(id);
		if (student != null) {
			studentList.remove(student); // 학생 삭제
			return true; // 삭제 성공
		}
		return false; // 삭제 실패
	}
}
package com.mystudy.list5_exam_vo;

public class StudentTest {
	public static void main(String[] args) {
		// 학생 관리 객체 생성
		StudentListManager manager = new StudentListManager();

		// 학생 데이터 추가
		manager.insert(new StudentVO("A01", "김유신", 100, 90, 81));
		manager.insert(new StudentVO("A02", "이순신", 95, 88, 92));
		manager.insert(new StudentVO("A03", "홍길동", 90, 87, 77));

		// 특정 학생 조회 변수등록
		StudentVO studentA01 = manager.select("A01");
		StudentVO studentA03 = manager.select("A03");

		// 전체 데이터 출력
		System.out.println("전체 학생 데이터:");
		for (StudentVO student : manager.selectAll()) {
			// 학생의 모든 정보를 포맷하여 출력
			System.out.printf("학번: %s, 성명: %s, 국어: %d, 영어: %d, 수학: %d, 총점: %d, 평균: %.2f\n", student.getId(),
					student.getName(), student.getKor(), student.getEng(), student.getMath(), student.getTot(),
					student.getAvg());
		}

		// 특정 학생 이름 수정
		manager.updateName("A01", "연창현");

		// 특정 학생 국어 점수 수정
		manager.updateKor("A01", 95);
		System.out.println("A01의 국어 점수, 이름 수정 후:");

		// 수정된 학생 정보 출력
		System.out.printf("학번: %s, 성명: %s, 국어: %d\n", studentA01.getId(), studentA01.getName(), studentA01.getKor());

		// 특정 학생 삭제
		manager.delete("A02"); // A02 삭제
		manager.delete(studentA03); // A03 삭제

		// 삭제 후 전체 데이터 출력
		System.out.println("A02, A03 삭제 후 전체 데이터:");
		for (StudentVO student : manager.selectAll()) {
			// 남아 있는 학생 정보 출력
			System.out.printf("학번: %s, 성명: %s\n", student.getId(), student.getName());
		}
	}
}

package com.mystudy.list5_exam_vo;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * (실습) List를 사용한 성적 처리 사용클래스명 : StudentVO 1. StudentVO 클래스를 사용해서 3명의
		 * 학생데이터(학번,성명,국어,영어,수학)를 만들고(저장하고) "A01", "김유신", 100, 90, 81 "A02", "이순신", 95,
		 * 88, 92 "A03", "홍길동", 90, 87, 77 2. ArrayList 타입의 변수(list)에 저장하고 3. list에 있는
		 * 전체 데이터 화면출력 학번 성명 국어 영어 수학 총점 평균 ------------------------------------------
		 * A01 김유신 100 90 81 271 90.33 ... 4. ID가 A01 의 국어 점수를 95 점으로 수정 하고, A01 데이터만 출력
		 * 출력예 -------- 학번 : A01 성명 : 김유신 국어 : 95 영어 : 90 ... 5. 전체 데이터 화면 출력(3번 형식으로)
		 ***********************************/

		// 1.데이터 생성
		StudentVO student1 = new StudentVO("A01", "김유신", 100, 90, 81);
		StudentVO student2 = new StudentVO("A02", "이순신", 95, 88, 92);
		StudentVO student3 = new StudentVO("A03", "홍길동", 90, 87, 77);

		// 2. ArrayList 타입으로 list 생성 및 add
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		list.add(student1);
		list.add(student2);
		list.add(student3);

		// 전체 데이터 화면 출력
		printData(list);

		System.out.println("---------");
		for (StudentVO student : list) {
			if (student.getId().equals("A01")) {
				student.setKor(95);	
				student.computeTotAvg();
				System.out.println("A01 의 국어 성적 수정");
				printStudentDetails(student);
				break;
			}
		}

		// 전체 데이터 화면 출력
		printData(list);
	}

	public static void printData(ArrayList<StudentVO> list) {
		System.out.printf("%-5s %-10s %-5s %-5s %-5s %-5s %-10s\n", "학번", "성명", "국어", "영어", "수학", "총점", "평균");
		System.out.println("----------------------------------------------------");
		for (StudentVO student : list) {
			System.out.printf("%-5s %-10s %-5s %-5s %-5s %-5s %-10s\n", student.getId(), student.getName(),
					student.getKor(), student.getEng(), student.getMath(), student.getTot(), student.getAvg());
			
			
		}
	}

	public static void printStudentDetails(StudentVO student) {
		System.out.println("---------");
		System.out.printf("학번 : %s\n", student.getId());
		System.out.printf("성명 : %s\n", student.getName());
		System.out.printf("국어 : %d\n", student.getKor());
		System.out.printf("영어 : %d\n", student.getEng());
		System.out.printf("수학 : %d\n", student.getMath());
		System.out.printf("총점 : %d\n", student.getTot());
		System.out.printf("평균 : %.2f\n", student.getAvg());
		System.out.println("---------");
		
		
		
	}
}

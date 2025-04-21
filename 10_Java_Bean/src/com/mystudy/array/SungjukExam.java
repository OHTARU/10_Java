package com.mystudy.array;

public class SungjukExam {

	public static void main(String[] args) {

		/* 국어 , 영어 , 수학점수를 저장할 수 있는 2차원 배열(students) 만들고
		 3명의 성적을 입력하고 개인별 총점, 평균을 계산하여 화면 출력
		 -------------------------
		 국어\t영어\t수학\t총점\t평균
		 -------------------------
		 100\t90\t80\t270\t90.0
		 100\t90\t80\t270\t90.0
		 100\t90\t80\t270\t90.0
		 -------------------------		 
		 */
	
		int[][] students = { { 100, 90, 80 }, { 100, 90, 81 }, { 100, 90, 82 } };

		String[] names = { "연창현", "김지윤", "조준범" };

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

		System.out.println("---------------------------------------------");
		for (int i = 0; i < students.length; i++) {
			
			int tot = 0;
			float avg = 0;
			
			System.out.print(names[i] + "\t");
			
			for (int j = 0; j < students[i].length; j++) {
				tot += students[i][j];
				System.out.print(students[i][j] + "\t");
			}
			
			avg = tot / 3f;
			
			System.out.printf("%d\t%.1f%n", tot, avg);
		}
		System.out.println("---------------------------------------------");

	}
}

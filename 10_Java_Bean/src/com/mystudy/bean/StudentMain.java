package com.mystudy.bean;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		String name = stu.getName();
		
		System.out.print("사용자의 이름을 입력하세요 : ");
		String nameInput = sc.nextLine();
		
		stu.setName(nameInput);
		System.out.println(nameInput);	
		
		System.out.print("국어 점수 입력 : ");
		int korInput = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int engInput = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int mathInput = sc.nextInt();

		stu.setKor(korInput);
		stu.setEng(engInput);
		stu.setMath(mathInput);
		
		int kor = stu.getKor();
		int eng = stu.getEng();
		int math = stu.getMath();
		int result = stu.getTot();
		double avg = stu.getAvg();
		
		System.out.println("국어 : " + kor + "점");
		System.out.println("영어 : " + eng + "점");
		System.out.println("수학 : " + math + "점");
		System.out.println("총점 : " + result + "점");
		System.out.println("평균 : " + avg + "점");
	
		String resultStr = stu.toString();
		
		System.out.println(resultStr);
		
		sc.close();
	}

}

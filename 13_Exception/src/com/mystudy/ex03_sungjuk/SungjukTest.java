package com.mystudy.ex03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		StudentVO vo = new StudentVO("홍길동", 100, 90, 81);
		System.out.println("vo : " + vo);
		System.out.println("vo.toString() : " + vo.toString());
		System.out.println("-- 국어점수 999 설정 ---");
		vo.setKor(999);
		System.out.println("vo : " + vo);
		

	}

}

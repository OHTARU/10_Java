package edu.class1.basic;

public class Ex02_class {

	// 변수 선언 영역 ==========
	// 필드변수(인스턴스변수, 속성-property, 멤버변수, 전역변수)
	int num = 111;

	// static 변수, 클래스 변수, 인스턴스
	static int staticNum = 222;

	// 생성자 선언 영역 ==========

	Ex02_class() { // 기본생성자 생략가능

	}

	// 메소드선언영역 =========
	public static void main(String[] args) {

		// 로컬변수
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;

		System.out.println("로컬변수 num1 : " + num1);
		System.out.println("로컬변수 num2 : " + num2);
		System.out.println("num1 + num2 = " + result);

		System.out.println("staticNum : " + staticNum);
		
		
		System.out.println("add 메소드를 이용한 num1 + num2 = " + add(num1,num2));

		Ex02_class ex02 = new Ex02_class(); // Ex02_class 타입의 인스턴스(객체) 생성
		
		System.out.println("인스턴스변수 num : " + ex02.num);
		System.out.println("인스턴스변수 staticNum : " + ex02.staticNum);
		
		
	} // main 끝

	static int add(int a, int b) {
		return a + b;
	}

}

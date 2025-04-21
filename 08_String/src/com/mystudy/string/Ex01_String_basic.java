package com.mystudy.string;

public class Ex01_String_basic {
	public static void main(String[] args) {
		// String 클래스 : 문자열 저장, 처리하기 위한 클래스
		// String 데이터 자체는 불변(immutable)

		// String str = "홍길동"; 기본 데이터타입처럼 사용 가능 : 상수값 처럼 공유
		// String str = new String("홍길동"); 객체(인스턴스) 생성 방식

		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		System.out.println("str1 == str2 : " + (str1 == str2));

		// == : 객체(인스턴스, 주소값) 비교 (동일 객체 여부 확인)
		String strObj1 = new String("홍길동");
		String strObj2 = new String("홍길동");

		System.out.println("strObj1 : " + strObj1);
		System.out.println("strObj2 : " + strObj2);

		System.out.println("str1 == strObj1 : " + (str1 == strObj1));
		System.out.println("str2 == strObj2 : " + (str2 == strObj2));
		// equals() : 문자열 값을 비교할 때는 반드시 equals() 메소드 사용할것

		System.out.println("==== 문자열 값 비교 ====");
		System.out.println("strObj1.equals(strObj1) : " + strObj1.equals(strObj1));
		System.out.println("strObj2.equals(strObj2) : " + strObj2.equals(strObj2));

		
		
		System.out.println("str1.equals(strObj1) : " + str1.equals(strObj1));
		System.out.println("str2.equals(strObj2) : " + str2.equals(strObj2));
		
		System.out.println("====================");
		String a = "Hello";
		String b = "World";
		
		System.out.println(a.concat(", " + b));


		System.out.println("====================");
	
		str1 = "JAVA";
		str2 = "java";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
	
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2)); // 영문 대소문자 상관없이 비교
	}
}

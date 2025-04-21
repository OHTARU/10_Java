package com.mystudy.string;

import java.util.Arrays;

public class Ex04_String_array_exam {

	public static void main(String[] args) {
		/*
		 * 배열 String[]과 String 메소드 사용 실습 문자열 :
		 * "홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM" 1. 위의 문자열 값을 저장할 수 있는
		 * String 배열(names) 변수를 선언하고 입력 2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력 출력 예)
		 * 홍길동,이순신,이순신,을지문덕.... 3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력 출력 예)
		 * 홍,이,이,을,김,연,T,T 4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력 예) 3:을지문덕
		 * =========================
		 */

		String[] names = { "홍길동", "이순신", "이순신", "을지문덕", "김유신", "연개소문", "Tom", "TOM" };

		String result = String.join(",", names);
		System.out.println(result);

		String firstChars = "";

		System.out.println("==========앞자리 출력 첫번째==========");

//		for (int i = 0; i < names.length; i++) {
//			firstChars += names[i].charAt(0);
//			if (i < names.length - 1) {
//				firstChars += ",";
//			}
//		}

//		System.out.println(firstChars);
		System.out.println("==========앞자리 출력 두번째==========");

		StringBuilder firstChar = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			firstChar.append(names[i].charAt(0));
			if (i < names.length - 1) {
				firstChar.append(",");
			}
		}

		System.out.println(firstChar.toString());

		for (int i = 0; i < names.length; i++) {
			if (names[i].length() >= 4) {
				System.out.println(i + " : " + names[i]);
			}

			System.out.println("==== 개선된 for 문 ====");

			// for (다른언어 : for-each문)
			// for (데이터타입 변수명 : Iterable데이터){}
			// Iterable 데이터 : 배열 , List , Set,...

			System.out.println("names : " + Arrays.toString(names));
			System.out.println("--------");
			int idx = 0;
			for (String name : names) {
				System.out.println(idx++ + " : " + name);
			}

			// 첫번째 , 두번째 ~ 마지막 데이터 구분처리

			boolean isFirst = true;
			for (String name : names) {
				if (isFirst) {
					System.out.print(name);
					isFirst = false;
				} else {
					System.out.print("," + name);
				}
			}
		}
	}

}

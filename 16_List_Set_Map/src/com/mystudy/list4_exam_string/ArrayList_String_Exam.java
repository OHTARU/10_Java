package com.mystudy.list4_exam_string;

import java.util.ArrayList;

public class ArrayList_String_Exam {

	public static void main(String[] args) {
		/*
		 * List 중 ArrayList<String> 사용 실습 문자열 :
		 * "홍길동","을지문덕","이순신","이순신","을지문덕","연개소문","광개토대왕" 1. 위의 문자열 값을 저장할 수 있는
		 * ArrayList 타입 names 변수를 선언하고 입력 2. List에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력 출력)
		 * 홍길동,을지문덕,이순신,이순신,... 3. List에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력 출력)
		 * 홍,을,이,이,... 4. 이름이 을지문덕인 데이터를 찾아서 "인덱스번호:이름" 형태로 출력 출력) 1:을지문덕 5. 이름이 4글자 이상인
		 * 데이터를 찾아서 "인덱스번호:이름" 형태로 출력 출력) 1:을지문덕 6. 이름이 "이순신" 데이터 모두 삭제
		 * ======================================
		 */

		ArrayList<String> names = new ArrayList<>();

		names.add("홍길동");
		names.add("을지문덕");
		names.add("이순신");
		names.add("이순신");
		names.add("을지문덕");
		names.add("연개소문");
		names.add("광개토대왕");

		System.out.println("------ names 에 데이터 넣기 ------");
		
//		System.out.println(String.join(",", names));
		
		StringBuilder FullLetter = new StringBuilder();
		
		for (String name : names) {
			FullLetter.append(name).append(",");
		}
		if (FullLetter.length() > 0) {
			FullLetter.setLength(FullLetter.length() - 1);
		}
		
		
		System.out.println(FullLetter.toString());

		System.out.println("------ 첫글자출력 ------");

		StringBuilder firstLetter = new StringBuilder();

		for (String name : names) {
			firstLetter.append(name.charAt(0)).append(",");
		}
		if (firstLetter.length() > 0) {
			firstLetter.setLength(firstLetter.length() - 1);
		}
		System.out.println(firstLetter.toString());

		System.out.println("------ 을지문덕 데이터 찾기 ------");

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals("을지문덕")) {
				System.out.println(i + " : " + names.get(i));
			}
		}

		System.out.println("------ 4글자 이상 데이터 찾기 ------");

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).length() >= 4) {
				System.out.println(i + " : " + names.get(i));
			}
		}

		System.out.println("  ------ 이순신 데이터 지우기 ------");

		int cnt = 0;
		for (int i = (names.size() - 1); i >= 0; i--) {
			if (names.get(i).equals("이순신")) {
				cnt++;
			}
		}
		
		System.out.println("삭제된 이순신 데이터 개수 : " + cnt);
		
		for (int i = (names.size() - 1); i >= 0; i--) {
			if (names.get(i).equals("이순신")) {
				names.remove(i);
			}
		}

		System.out.println(names.toString());

	}
}

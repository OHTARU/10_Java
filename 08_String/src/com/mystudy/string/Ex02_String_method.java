package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		// String class

		String str = "Java World";
		System.out.println("str : " + str);
		System.out.println("--- chatAt(인덱스 번호) ---");
		char charstr = str.charAt(0);
		System.out.println("str.charAt(0) : " + charstr);

		System.out.println("--- compareTo() : 문자열 비교 ( 결과 : 음수 , 0 , 양수 ) ");
		System.out.println("aaa vs aaa : " + "aaa".compareTo("aaa"));

		System.out.println("--- indexOf() : 문자(문자열) 위치값 확인 ---");
		System.out.println(str.indexOf("J"));

		System.out.println(str.indexOf("Java"));
		System.out.println(str.indexOf("a", 2));

		System.out.println("--- startsWith(), endsWith() ---");
		System.out.println("str.startsWith('Java') : " + str.startsWith("Java"));
		System.out.println("str.startsWith('World') : " + str.startsWith("World"));

		System.out.println("str.endsWith('Java') : " + str.endsWith("Java"));
		System.out.println("str.endsWith('World') : " + str.endsWith("World"));

		System.out.println("---- isEmpty() ----");
		System.out.println("str.isEmpty() : " + str.isEmpty());

		System.out.println("---- replace() ----");
		System.out.println("str.replace('a','m') : " + str.replace('a', 'b'));
		System.out.println(str.replace("Java", "Hello"));

		String str1 = "java java";
		System.out.println(str1.replace("ja", "Ja"));
		// replaceAll(졍규표현식, 바꿀문자열)
		System.out.println("str1.replaceAll(\"[jv]\", \"X\") : " + str1.replaceAll("[jv]", "X"));

		// substring(beginIndex , endIndex) : begin 부터 end 까지
		System.out.println(str.substring(0,str.length()));
		
		System.out.println(str.substring(str.length()-5));
		
		str = "  JAVA World   ";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str.trim());
		
		System.out.println("---- toCharArray() : 문자열을 char[] 로 변환 ---- ");
		str = "Java World";
		char chs[] = str.toCharArray();
		
		System.out.println(Arrays.toString(chs));
		
		for (int i = 0 ; i < chs.length; i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
		
		
		int num = 100;
		str = num + ""; // 100 > "100"
		str = String.valueOf(num);  // int 타입 테이터 문자열로 형변환
		System.out.println(str); // int 타입 데이터 문자열로 형변환 출력
		
		System.out.println(">>> main() 끝");
	}

}
package com.mystudy.stringbuilder;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		
		//String 크래스의 split() vs StringTokenizer 클래스
		System.out.println("---- String split() ----");
		String str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str.toString());
		
		String[] str1 = str.split(",");
		System.out.println(str1.length);
		System.out.println(Arrays.toString(str1));
		
		
		for (int i = 0; i < str1.length ; i++) {
			System.out.println(i+" -" + str1[i] + "- ");
		}
		
		System.out.println("-----");
		
		for( String str2 : str1) {
			System.out.println(str2);
		}
		
		System.out.println("---- StringTokenizer() ----");
		str = "사과,배,복숭아, ,포도";
		StringTokenizer strToken = new StringTokenizer(str,",");
		System.out.println(strToken.countTokens());
		
		strToken.nextToken();
		System.out.println("strToken.countToken() : " + strToken.countTokens());
		
		while(strToken.hasMoreTokens()) {
			String token = strToken.nextToken();
			System.out.println("-" + token + "-");
		}
		System.out.println("strToken.countToken() : " + strToken.countTokens());
		
		
		
		System.out.println("=======================");
		//for 문으로 데이터 처리
		
		str = "사과,배,복숭아, ,포도";
		StringTokenizer strToken1 = new StringTokenizer(str, ",");
		
		for (int i = 0 ; i < str.length() ; i++) {
			String token = strToken1.nextToken();
			System.out.println("-" + token + "-");
		}
	}

}

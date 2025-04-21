package com.mystudy.stringbuilder;

import java.util.StringTokenizer;

public class Ex04_String_controls_exam2 {

    public static void main(String[] args) {
        /*
         * 문자열 다루기 
         * 0. 문자열 데이터 
         * String str1 = "홍길동 이순신  이순신 Tom 홍길동"; 
         * String str2 ="    TOM   을지문덕 김유신 연개소문"; 
         */
    	
        String str1 = "홍길동 이순신  이순신 Tom 홍길동";
        String str2 = "    TOM   을지문덕 김유신 연개소문";

        // 1. str1과 str2를 합친 문자열을 공백(" ") 기준으로 나누기 위한 StringTokenizer 객체 생성
        StringTokenizer tokenizer = new StringTokenizer(str1 + " " + str2);

        // 2-1. 공백 기준으로 나누어진 이름들을 한 줄로 출력
        while (tokenizer.hasMoreTokens()) {
            System.out.print(tokenizer.nextToken() + " ");  // 각 이름을 공백과 함께 출력
        }

        System.out.println();  // 줄바꿈

        // 2-2. 이름들을 콤마(,)로 구분하여 출력
        StringBuilder comma = new StringBuilder();  // 콤마로 구분할 문자열을 만들 StringBuilder 객체 생성
        tokenizer = new StringTokenizer(str1 + " " + str2);  // 다시 tokenizer를 초기화

        // 토큰을 하나씩 읽어 콤마로 구분하여 연결
        while (tokenizer.hasMoreTokens()) {
            if (comma.length() > 0) {  // 첫 번째 항목 이후부터 콤마 추가
                comma.append(", ");
            }
            comma.append(tokenizer.nextToken());  // 이름 추가
        }
        System.out.println(comma.toString());  // 콤마로 구분된 이름들 출력

        // 4. 이름의 첫 글자만 추출해서 콤마(,)로 구분하여 한 줄에 출력
        StringBuilder first = new StringBuilder();  // 첫 글자를 구분할 StringBuilder 객체 생성
        tokenizer = new StringTokenizer(str1 + " " + str2);  // 다시 tokenizer 초기화

        // 각 이름의 첫 글자만 추출하여 콤마로 구분해 출력
        while (tokenizer.hasMoreTokens()) {
            String name = tokenizer.nextToken();  // 현재 이름 가져오기
            first.append(name.charAt(0));  // 이름의 첫 글자만 추출하여 추가
            if (tokenizer.hasMoreTokens()) {  // 마지막 이름이 아니면 콤마 추가
                first.append(", ");
            }
        }
        System.out.println(first.toString());  // 첫 글자들 출력

        // 5. 이름 중 글자수가 4 이상인 이름을 "인덱스번호:이름" 형식으로 출력
        tokenizer = new StringTokenizer(str1 + " " + str2);  // 다시 tokenizer 초기화
        int idx = 0;  // 인덱스 변수 초기화

        // 이름을 하나씩 확인하고 글자수가 4 이상인 이름을 인덱스와 함께 출력
        while (tokenizer.hasMoreTokens()) {
            String name = tokenizer.nextToken();  // 현재 이름 가져오기
            if (name.length() >= 4) {  // 이름의 길이가 4 이상이면
                System.out.println(idx + " : " + name);  // 인덱스와 함께 출력
            }
            idx++;  // 인덱스 증가
        }
    }
}

package com.mystudy.stringbuilder;



	public class Ex04_String_controls_exam {
	    public static void main(String[] args) {
	        String str1 = "홍길동 이순신  이순신 Tom 홍길동";
	        String str2 = "    TOM   을지문덕 김유신 연개소문";
	
	        // 1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
	        StringBuilder sb = new StringBuilder();
	        sb.append(str1).append(str2); // StringBuilder에다가 str1 + " " + str2 append하기
	
	        System.out.println(sb);
	
	        // 2-1. sb의 문자열을 빈칸 1개(" ")를 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
	        String names[] = sb.toString().trim().split("\\s+");
	
	        // 3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력
	        StringBuilder comma = new StringBuilder();
	        for (int i = 0; i < names.length; i++) {
	            if (names[i].isEmpty()) {
	                continue;
	            }
	            if (i > 0) { // 배열이 0인 것에는 "," 을 추가하지 않음
	                comma.append(",");
	            }
	            comma.append(names[i]); // i 번지에 이름 추가
	        }
	        System.out.println("콤마로 구분된 이름들: " + comma.toString());
	
	        // 4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력
	        StringBuilder first = new StringBuilder();
	        for (int i = 0 ; i < names.length; i++) {
	            if (names[i].isEmpty()) {
	                continue;
	            }
	            first.append(names[i].charAt(0)); // 이름의 첫 문자를 추출
	            if(i < names.length - 1 ) { // 마지막 배열에는 , 를 붙히지않음
	                first.append(",");
	            }
	        }
	        System.out.println(first.toString());
	
	        // 5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
	        for (int i = 0; i < names.length; i++) {
	            if (names[i].length() >= 4) { // i 번지의 글자수가 4자리 이상인지 확인
	                System.out.println(i + " : " + names[i]); // 4자리 이상이면 i : 문자 출력
	            }
	        }
	        
	        // 위의 배열에서 유의미한 데이터 선택해서 새로운 배열 만들기
	        
	        
	    }
	}

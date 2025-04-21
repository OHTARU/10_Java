package com.mystudy.string;

public class Ex03_String_exam {

	public static void main(String[] args) {
		String str = "320229-3234567";
		// 1. 전체 자리수 ("-" 부호 포함 14개 여부 확인 ) , "-" 위치가 7번째 있는지 확인
		// 2. 생년월일 출력 (자리수 : 1~2번째 > 년도 , 3~4번째 > 월 , 5~6 > 일) :
		// 예시 : 1999년 10월 12일 또는 99년 10월 12일 : -다음 숫자가 1,2 면 "19" + 자리수 1~2번째 3,4 면
		// "20"+ 자리수 1~2번째
		// 성별 확인 출력 ( - 뒤에가 1,3 : 남성 , 2,4 여성 )
		// 데이터 값 검증 ( 월 : 1 ~ 12 , 일 : 1 ~ 31 )
		// 참고 ) int num = Integer.parseInt("10") // "10" ---> 10
		// 1 , 3 , 5 , 7 , 8 , 10 , 12월은 31 일까지
		// 2 월 = 28일까지
		// 나머지 달은 30일 까지

		if (str.length() != 14) {
			System.out.println("주민등록번호는 14자리여야 합니다.");
		}
		if (str.charAt(6) != '-') {
			System.out.println("'-' 기호가 7번째 위치에 존재해야 합니다.");
		}

		String year = null;
		char gender = str.charAt(7); // "-" 다음 첫 숫자
		if (gender == '1' || gender == '3') {
			year = "19";
		} else if (gender == '3' || gender == '4') {
			year = "20";
		} else {
			System.out.println("잘못된 성별 구분 숫자 입니다.");
		}

		String yearNum = year + str.substring(0, 2);
		String month = str.substring(2, 4);
		String day = str.substring(4, 6);

		int monthNum = Integer.parseInt(month);
		int dayNum = Integer.parseInt(day);
		int yearInt = Integer.parseInt(yearNum);
		
		
		if (monthNum < 1 || monthNum > 12) {
			System.out.println("월은 1 ~ 12 사이어야 합니다.");
		}

		int maxDays;

		if (monthNum == 2) {
			maxDays = 29;
		} else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
			maxDays = 30; // 4,6,9,11월은 30일까지
		} else {
			maxDays = 31;
		}
		
		if (dayNum < 1 || dayNum > maxDays) {
            System.out.println(monthNum + "월의 일은 1~" + maxDays + " 사이어야 합니다.");
            return;
        }
		
		System.out.println(yearNum + "년 " + month + "월 " + day + "일");

		String genderstr = null;

		if (gender == '1' || gender == '3') {
			genderstr = "남성";
		} else if (gender == '2' || gender == '4') {
			genderstr = "여성";
		} else {
			System.out.println("잘못된 성별입니다.");
		}

		System.out.println(yearNum + "년 " + month + "월 " + day + "일" + " 성별 : " + genderstr);

	}
}
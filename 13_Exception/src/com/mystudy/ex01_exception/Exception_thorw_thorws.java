package com.mystudy.ex01_exception;

public class Exception_thorw_thorws {

	public static void main(String[] args) throws Exception {

		// thorw : 예외를 발생시킬때 이용
		// thorw 예외객체;

		// thorws 예외를 던질때 (위임, 전가) 사용 - method 선언부에 사용
		// 예외가 발생한 곳에서 처리하지 않고, 예외를 던져서 다른 곳에서 처리토록 함

		System.out.println("메인 시작");
		
		try {
			test(2);			
		} catch (Exception e) {
			System.out.println("[예외 메시지]");
//			e.printStackTrace();
		}

		System.out.println("메인 끝");
	}
	//thorws : 호출한 곳으로 예외를 던짐
	static void test(int idx) throws Exception {
		int[] num = new int[3];

		try {
			num[idx] = 100;
			System.out.println("[정상] : 인덱스값 정상 : " + idx);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[비정상] : 인덱스값 비정상");
			// 예외 발생 시키기 : throw 사용
			throw new Exception("잘못된 인덱스번호 사용");

		}
	}

}
